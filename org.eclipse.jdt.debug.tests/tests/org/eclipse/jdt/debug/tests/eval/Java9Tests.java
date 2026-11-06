/*******************************************************************************
 * Copyright (c) 2021 Gayan Perera and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Gayan Perera - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.debug.tests.eval;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.tests.AbstractDebugTest;

public class Java9Tests extends AbstractDebugTest {

	private IJavaThread thread;

	public Java9Tests(String name) {
		super(name);
	}

	@Override
	protected IJavaProject getProjectContext() {
		return super.get9Project();
	}

	public void testBug575039_methodBreakpointOnJavaBaseModuleClass_expectSuccessfulEval() throws Exception {
		String type = "Bug575039";
		createMethodBreakpoint("java.lang.Thread", "<init>", getSutableThreadConstructorSignature(),
				true, false);
		thread = launchToBreakpoint(type);
		assertNotNull("The program did not suspend", thread);

		String snippet = "name != null";
		IValue value = doEval(thread, snippet);

		assertNotNull("value is null", value);
		assertEquals("true", value.getValueString());
	}

	private String getSutableThreadConstructorSignature() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		Constructor<?>[] constructors = Thread.class.getDeclaredConstructors();
		int index = 0, argCount = 0;
		for (int i = 0; i < constructors.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			Constructor<?> constructor = constructors[i];
			if (!Modifier.isPublic(constructor.getModifiers()) && !Modifier.isProtected(constructor.getModifiers())
					&& constructor.getParameterCount() > argCount) {
				argCount = constructor.getParameterCount();
				index = i;
			}
		}

		Constructor<?> constructor = constructors[index];
		Parameter[] parameters = constructor.getParameters();
		StringBuilder builder = new StringBuilder("("); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
		for (Parameter parameter : parameters) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if (!parameter.getType().isPrimitive()) {
				builder.append('L'); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
				builder.append(parameter.getType().getName().replace('.', '/')); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
				builder.append(';'); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			} else {
				builder.append(getInternalName(parameter.getType().getName())); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			}
		}
		builder.append(")V"); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		return builder.toString();
	}

	private String getInternalName(String name) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		switch (name) {
			case "byte":
				return "B";
			case "char":
				return "C";
			case "double":
				return "D";
			case "float":
				return "F";
			case "int":
				return "I";
			case "long":
				return "J";
			case "short":
				return "S";
			case "boolean":
				return "Z";
			default:
				return name;

		}
	}

	@Override
	protected void tearDown() throws Exception {
		removeAllBreakpoints();
		terminateAndRemove(thread);
		super.tearDown();
	}
}
