/*******************************************************************************
 * Copyright (c) 2006, 2015 IBM Corporation and others.
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
package org.eclipse.jdt.internal.debug.ui.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;
import org.eclipse.jdt.core.JavaCore;

/**
 * Resolves to Java-like file extensions for hyperlink matching.
 *
 * @since 3.2
 */
public class JavaLikeExtensionsResolver implements IDynamicVariableResolver {

	@Override //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
	public String resolveValue(IDynamicVariable variable, String argument) throws CoreException {
		String[] javaLikeExtensions = JavaCore.getJavaLikeExtensions();
		StringBuilder buffer = new StringBuilder(); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
		if (javaLikeExtensions.length > 1) {
			buffer.append("("); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		}
		for (int i = 0; i < javaLikeExtensions.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			String ext = javaLikeExtensions[i];
			buffer.append("\\."); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buffer.append(ext); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buffer.append(":"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			if (i < (javaLikeExtensions.length - 1)) {
				buffer.append("|"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			}
		}
		if (javaLikeExtensions.length > 1) {
			buffer.append(")"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		}
		return buffer.toString();
	}

}
