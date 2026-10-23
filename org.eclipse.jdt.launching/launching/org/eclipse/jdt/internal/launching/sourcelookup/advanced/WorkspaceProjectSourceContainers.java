/*******************************************************************************
 * Copyright (c) 2012-2016 Igor Fedorenko
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Igor Fedorenko - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.launching.sourcelookup.advanced;

import static org.eclipse.jdt.core.IJavaElementDelta.F_ADDED_TO_CLASSPATH;
import static org.eclipse.jdt.core.IJavaElementDelta.F_CLASSPATH_CHANGED;
import static org.eclipse.jdt.core.IJavaElementDelta.F_CLOSED;
import static org.eclipse.jdt.core.IJavaElementDelta.F_OPENED;
import static org.eclipse.jdt.core.IJavaElementDelta.F_REMOVED_FROM_CLASSPATH;
import static org.eclipse.jdt.core.IJavaElementDelta.F_RESOLVED_CLASSPATH_CHANGED;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.launching.sourcelookup.advanced.FileHashing.Hasher;
import org.eclipse.jdt.launching.sourcelookup.advanced.IWorkspaceProjectDescriber;
import org.eclipse.jdt.launching.sourcelookup.advanced.IWorkspaceProjectDescriber.IJavaProjectSourceDescription;
import org.eclipse.jdt.launching.sourcelookup.containers.PackageFragmentRootSourceContainer;

/**
 * Workspace project source container factory.
 *
 * <p>
 * The factory creates both project and project classpath entry containers. Both projects and project classpath entries can be identified by their
 * filesystem location and, if the location is a file, by the file SHA1 checksum.
 *
 * <p>
 * The factory maintains up-to-date registry of workspace projects and their classpath entries and can be used to create source containers fast enough
 * to be used from UI thread.
 */
public class WorkspaceProjectSourceContainers {
	private final IElementChangedListener changeListener = new IElementChangedListener() { //FLLDCIM: MARK — T31  ANONYMOUS
		@Override
		public void elementChanged(ElementChangedEvent event) {
			try {
				final Set<IJavaProject> remove = new HashSet<>(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW
				final Set<IJavaProject> add = new HashSet<>(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW

				processDelta(event.getDelta(), remove, add);

				if (!remove.isEmpty() || !add.isEmpty()) {
					AdvancedSourceLookupSupport.schedule((m) -> updateProjects(remove, add, m));
				}
			}
			catch (CoreException e) {
				// maybe do something about it?
			}
		}

		private void processDelta(final IJavaElementDelta delta, Set<IJavaProject> remove, Set<IJavaProject> add) throws CoreException { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
			// TODO review, this looks too complicated to add/remove java projects

			final IJavaElement element = delta.getElement();
			final int kind = delta.getKind();
			switch (element.getElementType()) {
				case IJavaElement.JAVA_MODEL:
					processChangedChildren(delta, remove, add);
					break;
				case IJavaElement.JAVA_PROJECT:
					switch (kind) {
						case IJavaElementDelta.REMOVED:
							remove.add((IJavaProject) element);
							break;
						case IJavaElementDelta.ADDED:
							add.add((IJavaProject) element);
							break;
						case IJavaElementDelta.CHANGED:
							if ((delta.getFlags() & F_CLOSED) != 0) {
								remove.add((IJavaProject) element);
							} else if ((delta.getFlags() & F_OPENED) != 0) {
								add.add((IJavaProject) element);
							} else if ((delta.getFlags() & (F_CLASSPATH_CHANGED | F_RESOLVED_CLASSPATH_CHANGED)) != 0) {
								remove.add((IJavaProject) element);
								add.add((IJavaProject) element);
							}
							break;
					}
					processChangedChildren(delta, remove, add);
					break;
				case IJavaElement.PACKAGE_FRAGMENT_ROOT:
					if ((delta.getFlags() & (F_ADDED_TO_CLASSPATH | F_REMOVED_FROM_CLASSPATH)) != 0) {
						remove.add(element.getJavaProject());
						add.add(element.getJavaProject());
					}
					break;
			}
		}

		private void processChangedChildren(IJavaElementDelta delta, Set<IJavaProject> remove, Set<IJavaProject> add) throws CoreException {
			for (IJavaElementDelta childDelta : delta.getAffectedChildren()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				processDelta(childDelta, remove, add);
			}
		}
	};

	private static class JavaProjectDescriptionBuilder implements IJavaProjectSourceDescription {
		final Set<File> locations = new HashSet<>(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW
		final List<Supplier<ISourceContainer>> factories = new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
		final Map<File, IPackageFragmentRoot> dependencyLocations = new HashMap<>(); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW

		@Override
		public void addLocation(File location) {
			locations.add(location);
		}

		@Override
		public void addSourceContainerFactory(Supplier<ISourceContainer> factory) {
			factories.add(factory);
		}

		@Override
		public void addDependencies(Map<File, IPackageFragmentRoot> dependencies) {
			// TODO decide what happens if the same location is associated with multiple package fragment roots
			this.dependencyLocations.putAll(dependencies);
		}

	}

	private static class JavaProjectDescription {
		final Set<File> classesLocations;

		final Set<Object> classesLocationsHashes;

		final List<Supplier<ISourceContainer>> sourceContainerFactories;

		final Map<File, IPackageFragmentRoot> dependencies;

		final Map<Object, IPackageFragmentRoot> dependencyHashes;

		public JavaProjectDescription(Set<File> locations, Set<Object> hashes, List<Supplier<ISourceContainer>> factories, Map<File, IPackageFragmentRoot> dependencies, Map<Object, IPackageFragmentRoot> dependencyHashes) {
			this.classesLocations = Collections.unmodifiableSet(locations);
			this.classesLocationsHashes = Collections.unmodifiableSet(hashes);
			this.sourceContainerFactories = Collections.unmodifiableList(factories);
			this.dependencies = Collections.unmodifiableMap(dependencies);
			this.dependencyHashes = Collections.unmodifiableMap(dependencyHashes);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof JavaProjectDescription)) {
				return false;
			}
			JavaProjectDescription other = (JavaProjectDescription) obj;
			return classesLocations.equals(other.classesLocations);
		}

		@Override
		public int hashCode() {
			return classesLocations.hashCode();
		}
	}

	/**
	 * Guards concurrent access to {@link #locations}, {@link #hashes} and {@link #projects}. Necessary because source lookup queries and java model
	 * changes are processed on different threads.
	 *
	 * @TODO consider using ConcurrentMaps instead of explicit locking.
	 */
	private final Object lock = new Object() {
	};

	/**
	 * Maps project classes location to project description.
	 */
	private final Map<File, JavaProjectDescription> locations = new HashMap<>(); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW

	/**
	 * Maps project dependency hash to project descriptions. Hash-based source lookup is useful when runtime uses copies of jars used by the
	 * workspace.
	 */
	private final Map<Object, Collection<JavaProjectDescription>> hashes = new HashMap<>(); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW

	/**
	 * Maps java project to project description.
	 */
	private final Map<IJavaProject, JavaProjectDescription> projects = new HashMap<>(); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW

	/**
	 * Creates and returns new source containers for the workspace project identified by the given location. Returns {@code null} if there is no such
	 * workspace project.
	 */
	public ISourceContainer createProjectContainer(File projectLocation) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		Hasher hasher = FileHashing.hasher(); // use long-lived hasher

		JavaProjectDescription description = getProjectByLocation(projectLocation);

		if (description == null) {
			Collection<JavaProjectDescription> desciptions = getProjectsByHash(projectLocation, hasher);
			if (!desciptions.isEmpty()) {
				// it is possible, but unlikely, to have multiple binary projects for the same jar
				description = desciptions.iterator().next();
			}
		}

		if (description == null) {
			return null;
		}

		List<ISourceContainer> containers = new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
		for (Supplier<ISourceContainer> factory : description.sourceContainerFactories) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			containers.add(factory.get());
		}

		return CompositeSourceContainer.compose(containers);
	}

	private JavaProjectDescription getProjectByLocation(File projectLocation) {
		synchronized (lock) {
			return locations.get(projectLocation);
		}
	}

	private Collection<JavaProjectDescription> getProjectsByHash(File projectLocation, FileHashing.Hasher hasher) {
		Collection<JavaProjectDescription> projects;
		synchronized (lock) {
			projects = hashes.get(hasher.hash(projectLocation));
			return projects != null ? new HashSet<>(projects) : Collections.emptySet(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW
		}
	}

	/**
	 * Creates and returns new source container for the workspace project classpath entry identified by the given project and entry locations. Returns
	 * {@code null} if there is no such project classpath entry or if the classpath entry does not have associated sources.
	 */
	public ISourceContainer createClasspathEntryContainer(File projectLocation, File entryLocation) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		Hasher hasher = FileHashing.hasher(); // use long-lived hasher

		JavaProjectDescription projectByLocation = getProjectByLocation(projectLocation);

		IPackageFragmentRoot dependency = getProjectDependency(projectByLocation, entryLocation, hasher);

		if (dependency == null && projectByLocation == null) {
			for (JavaProjectDescription projectByHash : getProjectsByHash(projectLocation, hasher)) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				dependency = getProjectDependency(projectByHash, entryLocation, hasher);
				if (dependency != null) {
					break;
				}
			}
		}

		try {
			if (dependency == null || (dependency.getKind() == IPackageFragmentRoot.K_BINARY && dependency.getSourceAttachmentPath() == null)) {
				return null;
			}
		} catch (JavaModelException e) {
			return null;
		}

		return new PackageFragmentRootSourceContainer(dependency);
	}

	private IPackageFragmentRoot getProjectDependency(JavaProjectDescription project, File entryLocation, FileHashing.Hasher hasher) {
		if (project == null) {
			return null;
		}

		IPackageFragmentRoot dependency = project.dependencies.get(entryLocation);

		if (dependency == null) {
			dependency = project.dependencyHashes.get(hasher.hash(entryLocation));
		}
		return dependency;
	}

	public void initialize(IProgressMonitor monitor) throws CoreException { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		// note that initialization and java element change events are processed by the same background job
		// this guarantees the events aren't lost when they are delivered while the initialization is running
		JavaCore.addElementChangedListener(changeListener); //FLLDCIM: MARK — T31 JAVA_ELEMENT_DELTA_ADAPTER CALL

		final IJavaModel javaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
		final IJavaProject[] javaProjects = javaModel.getJavaProjects();

		SubMonitor progress = SubMonitor.convert(monitor, javaProjects.length);

		// TODO this can take significant time for large workspaces, consider running on multiple threads
		// NB: can't persist state across restarts because java element change events are not delivered when this plugin isn't active

		Hasher hasher = FileHashing.newHasher(); // short-lived hasher for bulk workspace indexing

		List<IWorkspaceProjectDescriber> describers = getJavaProjectDescribers();
		for (IJavaProject project : javaProjects) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			addJavaProject(project, describers, hasher, progress.split(1));
		}
	}

	public void close() {
		JavaCore.removeElementChangedListener(changeListener);
		synchronized (lock) {
			this.locations.clear();
			this.hashes.clear();
			this.projects.clear();
		}
	}

	private void addJavaProject(IJavaProject project, List<IWorkspaceProjectDescriber> describers, FileHashing.Hasher hasher, IProgressMonitor monitor) throws CoreException { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		if (project == null) {
			throw new IllegalArgumentException();
		}

		JavaProjectDescriptionBuilder builder = new JavaProjectDescriptionBuilder();

		for (IWorkspaceProjectDescriber describer : describers) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			describer.describeProject(project, builder);
		}

		Set<File> locations = builder.locations;
		List<Supplier<ISourceContainer>> factories = builder.factories;
		Map<File, IPackageFragmentRoot> dependencies = builder.dependencyLocations;

		// make binary project support little easier to implement
		locations.forEach(location -> dependencies.remove(location));

		Set<Object> hashes = new HashSet<>(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW
		locations.forEach(location -> {
			Object hash = hasher.hash(location);
			if (hash != null) {
				hashes.add(hash);
			}
		});

		Map<Object, IPackageFragmentRoot> dependencyHashes = new HashMap<>(); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW
		dependencies.forEach((location, packageFragmentRoot) -> dependencyHashes.put(hasher.hash(location), packageFragmentRoot));

		JavaProjectDescription info = new JavaProjectDescription(locations, hashes, factories, dependencies, dependencyHashes);

		synchronized (this.lock) {
			for (File location : locations) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				this.locations.put(location, info);
			}
			for (Object hash : hashes) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				Collection<JavaProjectDescription> hashProjects = this.hashes.get(hash);
				if (hashProjects == null) {
					hashProjects = new HashSet<>(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW
					this.hashes.put(hash, hashProjects);
				}
				hashProjects.add(info);
			}
			this.projects.put(project, info);
		}

		SubMonitor.done(monitor);
	}

	protected List<IWorkspaceProjectDescriber> getJavaProjectDescribers() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		List<IWorkspaceProjectDescriber> result = new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW

		IExtensionRegistry registry = Platform.getExtensionRegistry();

		IConfigurationElement[] elements = registry.getConfigurationElementsFor(AdvancedSourceLookupSupport.ID_workspaceProjectDescribers);

		for (IConfigurationElement element : elements) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if ("describer".equals(element.getName())) { //$NON-NLS-1$
				try {
					result.add((IWorkspaceProjectDescriber) element.createExecutableExtension("class")); //$NON-NLS-1$
				}
				catch (CoreException e) {
				}
			}
		}

		result.add(new DefaultProjectDescriber());

		return result;
	}

	private void removeJavaProject(IJavaProject project) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		if (project == null) {
			throw new IllegalArgumentException();
		}
		synchronized (lock) {
			JavaProjectDescription description = projects.remove(project);
			if (description != null) {
				for (File location : description.classesLocations) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					locations.remove(location);
				}
				for (Object hash : description.classesLocationsHashes) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					Collection<JavaProjectDescription> hashProjects = hashes.get(hash);
					if (hashProjects != null) {
						hashProjects.remove(description);
						if (hashProjects.isEmpty()) {
							hashes.remove(hash);
						}
					}
				}
			}
		}
	}

	void updateProjects(final Set<IJavaProject> remove, final Set<IJavaProject> add, IProgressMonitor monitor) throws CoreException {
		SubMonitor progress = SubMonitor.convert(monitor, 1 + add.size());

		progress.split(1);
		for (IJavaProject project : remove) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			removeJavaProject(project);
		}
		List<IWorkspaceProjectDescriber> describers = getJavaProjectDescribers();
		Hasher hasher = FileHashing.newHasher();
		for (IJavaProject project : add) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			addJavaProject(project, describers, hasher, progress.split(1));
		}
	}

}
