/*******************************************************************************
 * Copyright (c) 2000, 2022 IBM Corporation and others.
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
package org.eclipse.jdt.internal.debug.ui.launcher;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IOrdinaryClassFile;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.debug.core.JavaDebugUtils;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.osgi.util.NLS;

public class AppletLaunchConfigurationUtils {

	/**
	 * Throws a core exception with an error status object built from
	 * the given message, lower level exception, and error code.
	 *
	 * @param message the status message
	 * @param exception lower level exception associated with the
	 *  error, or <code>null</code> if none
	 * @param code error code
	 */
	public static void abort(String message, Throwable exception, int code)
		throws CoreException {
		throw new CoreException(
			new Status(
				IStatus.ERROR,
				JDIDebugUIPlugin.getUniqueIdentifier(),
				code,
				message,
				exception));
	}

	/**
	 * Return the <code>IType</code> referenced by the specified name and contained in
	 * the specified project or throw a <code>CoreException</code> whose message explains why
	 * this couldn't be done.
	 */
	public static IType getMainType(String mainTypeName, IJavaProject javaProject) throws CoreException {
		if ((mainTypeName == null) || (mainTypeName.trim().length() < 1)) {
			abort(LauncherMessages.appletlauncher_utils_error_main_type_not_specified, null, IJavaLaunchConfigurationConstants.ERR_UNSPECIFIED_MAIN_TYPE);
		}
		IType mainType = null;
		try {
			mainType = findType(javaProject, mainTypeName);
		} catch (JavaModelException jme) {
		}
		if (mainType == null) {
			abort(NLS.bind(LauncherMessages.appletlauncher_utils_error_main_type_does_not_exist, mainTypeName, javaProject.getElementName()), null, IJavaLaunchConfigurationConstants.ERR_UNSPECIFIED_MAIN_TYPE);
		}
		return mainType;
	}


	/**
	 * Find the specified (fully-qualified) type name in the specified java project.
	 */
	public static IType findType(IJavaProject javaProject, String mainTypeName) throws CoreException {
		IJavaElement javaElement= JavaDebugUtils.findElement(mainTypeName, javaProject);
		if (javaElement == null) {
			return null;
		} else if (javaElement instanceof IType) {
			return (IType)javaElement;
		} else if (javaElement.getElementType() == IJavaElement.COMPILATION_UNIT) {
			String simpleName= Signature.getSimpleName(mainTypeName);
			return ((ICompilationUnit) javaElement).getType(simpleName);
		} else if (javaElement.getElementType() == IJavaElement.CLASS_FILE && javaElement instanceof IOrdinaryClassFile) {
			return ((IOrdinaryClassFile) javaElement).getType();
		}
		return null;
	}

	public static Set<IType> collectAppletTypesInProject(IProgressMonitor monitor, IJavaProject project) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		IType[] types;
		HashSet<IType> result = new HashSet<>(5); //FLLDCIM: MARK — M03 M3_SET_LANES NEW
		try {
			IType javaLangApplet = AppletLaunchConfigurationUtils.getMainType("java.applet.Applet", project); //$NON-NLS-1$
			ITypeHierarchy hierarchy = javaLangApplet.newTypeHierarchy(project, monitor);
			types = hierarchy.getAllSubtypes(javaLangApplet);
			int length = types.length;
			if (length != 0) {
				for (int i = 0; i < length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					if (!types[i].isBinary()) {
						result.add(types[i]);
					}
				}
			}
		} catch(JavaModelException jme) {
		} catch(CoreException e) {
		}
		monitor.done();
		return result;
	}

	public static void collectTypes(Object element, IProgressMonitor monitor, Set<Object> result) throws JavaModelException/*, InvocationTargetException*/ { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		element= computeScope(element);
		while(element instanceof IMember) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if(element instanceof IType) {
				if (isSubclassOfApplet(monitor, (IType)element)) {
					result.add(element);
					monitor.done();
					return;
				}
			}
			element= ((IJavaElement)element).getParent();
		}
		if (element instanceof ICompilationUnit) {
			ICompilationUnit cu= (ICompilationUnit)element;
			for (IType type : cu.getAllTypes()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				if (isSubclassOfApplet(monitor, type)) {
					result.add(type);
				}
			}
		} else if (element instanceof IOrdinaryClassFile) {
			IType type = ((IOrdinaryClassFile) element).getType();
			if (isSubclassOfApplet(monitor, type)) {
				result.add(type);
			}
		} else if (element instanceof IJavaElement) {
			IJavaElement parent = (IJavaElement) element;
			List<IType> found= searchSubclassesOfApplet(monitor, (IJavaElement)element);
			// filter within the parent element
			Iterator<IType> iterator = found.iterator();
			while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				IJavaElement target = iterator.next();
				IJavaElement child = target;
				while (child != null) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					if (child.equals(parent)) {
						result.add(target);
						break;
					}
					child = child.getParent();
				}
			}
		}
		monitor.done();
	}

	private static List<IType> searchSubclassesOfApplet(IProgressMonitor pm, IJavaElement javaElement) {
		return new ArrayList<>(collectAppletTypesInProject(pm, javaElement.getJavaProject())); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
	}

	private static boolean isSubclassOfApplet(IProgressMonitor pm, IType type) {
		return collectAppletTypesInProject(pm, type.getJavaProject()).contains(type);
	}

	private static Object computeScope(Object element) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
        if (element instanceof IJavaElement) {
            return element;
        }
		if (element instanceof IAdaptable) {
			element = ((IAdaptable)element).getAdapter(IResource.class);
		}
		if (element instanceof IResource) {
			IJavaElement javaElement = JavaCore.create((IResource)element);
			if (javaElement != null && !javaElement.exists()) {
				// do not consider the resource - corresponding java element does not exist
				element = null;
			} else {
			    element= javaElement;
            }

		}
		return element;
	}

	/**
	 * Searches for applets from within the given scope of elements
	 * @param elements the search scope
	 * @return and array of <code>IType</code>s of matches for java types that extend <code>Applet</code> (directly or indirectly)
	 */
	public static IType[] findApplets(IRunnableContext context, final Object[] elements) throws InvocationTargetException, InterruptedException { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		final Set<Object> result= new HashSet<>(); //FLLDCIM: MARK — M03 M3_SET_LANES NEW

		int nElements = elements.length;
		if (nElements > 0) {
			IRunnableWithProgress runnable = pm -> { //FLLDCIM: MARK — T09  LAMBDA
				SubMonitor subMon = SubMonitor.convert(pm, LauncherMessages.appletlauncher_search_task_inprogress, nElements);
				try {
					for (Object o : elements) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
						try {
							collectTypes(o, subMon.split(1), result);
						} catch (JavaModelException jme) {
							JDIDebugUIPlugin.log(jme.getStatus());
						}
						if (pm.isCanceled()) {
							throw new InterruptedException();
						}
					}
				} finally {
					pm.done();
				}
			};
			context.run(true, true, runnable);
		}
		return result.toArray(new IType[result.size()]) ;
	}
}

