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
import org.eclipse.jdt.internal.debug.core.model.JDIObjectValue;

public class StringPlusOpTests extends Tests {

	public StringPlusOpTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests", 18, 1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// java.lang.String + {byte, char, short, int, long, java.lang.String, null}

	public void testStringPlusByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus byte : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus byte : wrong result : ", xStringValue + yByteValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus byte : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus byte : wrong result : ", yStringValue + xByteValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus char : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus char : wrong result : ", xStringValue + yCharValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus char : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus char : wrong result : ", yStringValue + xCharValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus short : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus short : wrong result : ", xStringValue + yShortValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus short : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus short : wrong result : ", yStringValue + xShortValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus int : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus int : wrong result : ", xStringValue + yIntValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus int : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus int : wrong result : ", yStringValue + xIntValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus long : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus long : wrong result : ", xStringValue + yLongValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus long : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus long : wrong result : ", yStringValue + xLongValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus double : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus double : wrong result : ", xStringValue + yDoubleValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus double : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus double : wrong result : ", yStringValue + xDoubleValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusBoolean() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus boolean : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus boolean : wrong result : ", xStringValue + yBooleanValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xBoolean); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus boolean : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus boolean : wrong result : ", yStringValue + xBooleanValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusString() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yString); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus java.lang.String : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus java.lang.String : wrong result : ", xStringValue + yStringValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xString); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus java.lang.String : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus java.lang.String : wrong result : ", yStringValue + xStringValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	public void testStringPlusNull() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xString + plusOp + yNull); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus null : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus null : wrong result : ", xStringValue + yNullValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yString + plusOp + xNull); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String plus null : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("java.lang.String plus null : wrong result : ", yStringValue + xNullValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}


}
