/*******************************************************************************
 * Copyright (c) 2004, 2015 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.launching.sourcelookup.containers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.ISourceContainerType;
import org.eclipse.debug.core.sourcelookup.containers.CompositeSourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.FolderSourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.ProjectSourceContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.launching.LaunchingPlugin;

/**
 * Java project source container. Searches for source in a project's
 * source folders.
 * <p>
 * This class may be instantiated.
 * </p>
 *
 * @since 3.0
 * @noextend This class is not intended to be sub-classed by clients.
 */
public class JavaProjectSourceContainer extends CompositeSourceContainer {

	// Java project
	private final IJavaProject fProject;
	// Source folders
	private ISourceContainer[] fSourceFolders;
	// Generic project container
	private ISourceContainer[] fOthers;

	private static String[] fgJavaExtensions = null;

	/**
	 * initialize java file extensions
	 */
	static {
		String[] extensions = JavaCore.getJavaLikeExtensions();
		fgJavaExtensions = new String[extensions.length];
		for (int i = 0; i < extensions.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			String ext = extensions[i];
			fgJavaExtensions[i] = '.' + ext; //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}

	/**
	 * Unique identifier for Java project source container type
	 * (value <code>org.eclipse.jdt.launching.sourceContainer.javaProject</code>).
	 */
	public static final String TYPE_ID = LaunchingPlugin.getUniqueIdentifier() + ".sourceContainer.javaProject";   //$NON-NLS-1$ //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

	/**
	 * Constructs a source container on the given Java project.
	 *
	 * @param project project to look for source in
	 */
	public JavaProjectSourceContainer(IJavaProject project) {
		fProject = project;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceContainer#getName()
	 */
	@Override
	public String getName() {
		return fProject.getElementName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceContainer#getType()
	 */
	@Override
	public ISourceContainerType getType() {
		return getSourceContainerType(TYPE_ID);
	}

	/**
	 * Returns the Java project associated with this source container.
	 *
	 * @return Java project
	 */
	public IJavaProject getJavaProject() {
		return fProject;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.containers.CompositeSourceContainer#createSourceContainers()
	 */
	@Override //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
	protected ISourceContainer[] createSourceContainers() throws CoreException {
		List<ISourceContainer> containers = new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		if (fProject.getProject().isOpen()) {
			IClasspathEntry[] entries = fProject.getRawClasspath();
			for (int i = 0; i < entries.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				IClasspathEntry entry = entries[i];
				switch (entry.getEntryKind()) {
					case IClasspathEntry.CPE_SOURCE:
						IPath path = entry.getPath();
						IResource resource = root.findMember(path);
						if (resource instanceof IContainer iContainer) {
							containers.add(new FolderSourceContainer(iContainer, false));
						}
						break;
				}
			}
		}
		// cache the Java source folders to search for java like files in
		fSourceFolders = containers.toArray(new ISourceContainer[containers.size()]);
		ISourceContainer theProject = new ProjectSourceContainer(fProject.getProject(), false);
		fOthers = new ISourceContainer[] {theProject};
		containers.add(theProject);
		return containers.toArray(new ISourceContainer[containers.size()]);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JavaProjectSourceContainer) {
			return getJavaProject().equals(((JavaProjectSourceContainer)obj).getJavaProject());
		}
		return super.equals(obj);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return getJavaProject().hashCode();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.sourcelookup.ISourceContainer#findSourceElements(java.lang.String)
	 */
	@Override //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
	public Object[] findSourceElements(String name) throws CoreException {
		// force container initialization
		getSourceContainers();

		if (isJavaLikeFileName(name)) {
			// only look in source folders
			Object[] objects = findSourceElements(name, fSourceFolders);
			List<Object> filtered = null;
			for (int i = 0; i < objects.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				Object object = objects[i];
				if (object instanceof IResource) {
					if (!getJavaProject().isOnClasspath((IResource)object)) {
						if (filtered == null) {
							filtered = new ArrayList<>(objects.length); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
							for (int j = 0; j < objects.length; j++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
								filtered.add(objects[j]);
							}
						}
						filtered.remove(object);
					}
				}
			}
			if (filtered == null) {
				return objects;
			}
			return filtered.toArray();
		}
		// look elsewhere if not a java like file
		return findSourceElements(name, fOthers);
	}
	@Override
	public void dispose() {
		fSourceFolders = null;
		fOthers = null;
		super.dispose();
	}

	private boolean isJavaLikeFileName(String name) {
		for (int i = 0; i < fgJavaExtensions.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			String ext = fgJavaExtensions[i];
			if (name.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}
}
