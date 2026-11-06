/*******************************************************************************
 * Copyright (c) 2002, 2005 IBM Corporation and others.
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
package org.eclipse.jdt.debug.tests.eval;

import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.debug.core.IJavaPrimitiveValue;

public class BooleanOperatorsTests extends Tests {

	public BooleanOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests", 18, 1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// boolean | boolean

	public void testBooleanOrBoolean() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xBoolean + orOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("boolean or boolean : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean or boolean : wrong result : ", xBooleanValue | xBooleanValue, booleanValue);

		value = eval(xBoolean + orOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean or boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean or boolean : wrong result : ", xBooleanValue | yBooleanValue, booleanValue);

		value = eval(yBoolean + orOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean or boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean or boolean : wrong result : ", yBooleanValue | xBooleanValue, booleanValue);

		value = eval(yBoolean + orOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean or boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean or boolean : wrong result : ", yBooleanValue | yBooleanValue, booleanValue);
		} finally {
		end();
		}
	}

	// boolean & boolean

	public void testBooleanAndBoolean() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xBoolean + andOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("boolean and boolean : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean and boolean : wrong result : ", xBooleanValue & xBooleanValue, booleanValue);

		value = eval(xBoolean + andOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean and boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean and boolean : wrong result : ", xBooleanValue & yBooleanValue, booleanValue);

		value = eval(yBoolean + andOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean and boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean and boolean : wrong result : ", yBooleanValue & xBooleanValue, booleanValue);

		value = eval(yBoolean + andOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean and boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean and boolean : wrong result : ", yBooleanValue & yBooleanValue, booleanValue);
		} finally {
		end();
		}
	}

	// boolean ^ boolean

	public void testBooleanXorBoolean() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xBoolean + xorOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("boolean xor boolean : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean xor boolean : wrong result : ", xBooleanValue ^ xBooleanValue, booleanValue);

		value = eval(xBoolean + xorOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean xor boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean xor boolean : wrong result : ", xBooleanValue ^ yBooleanValue, booleanValue);

		value = eval(yBoolean + xorOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean xor boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean xor boolean : wrong result : ", yBooleanValue ^ xBooleanValue, booleanValue);

		value = eval(yBoolean + xorOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean xor boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("boolean xor boolean : wrong result : ", yBooleanValue ^ yBooleanValue, booleanValue);
		} finally {
		end();
		}
	}

	// ! boolean

	public void testNotBoolean() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(notOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("not boolean : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("not boolean : wrong result : ", ! xBooleanValue, booleanValue);

		value = eval(notOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("not boolean : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("not boolean : wrong result : ", ! yBooleanValue, booleanValue);
		} finally {
		end();
		}
	}


}
