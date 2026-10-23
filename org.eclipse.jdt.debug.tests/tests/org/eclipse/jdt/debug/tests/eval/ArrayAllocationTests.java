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

public class ArrayAllocationTests extends Tests {

	public ArrayAllocationTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalArrayTests", 40, 1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	public void testByteArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayByte + equalOp + "new byte[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte array assignment : wrong type : ", "byte[]", typeName);
		int intValue = 0;
		value = eval(xArrayByte + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("byte array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayByte + equalOp + "new byte[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte array assignment : wrong type : ", "byte[]", typeName);
		value = eval(yArrayByte + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("byte array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testCharArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayChar + equalOp + "new char[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char array assignment : wrong type : ", "char[]", typeName);
		int intValue = 0;
		value = eval(xArrayChar + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("char array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayChar + equalOp + "new char[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char array assignment : wrong type : ", "char[]", typeName);
		value = eval(yArrayChar + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("char array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testShortArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayShort + equalOp + "new short[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short array assignment : wrong type : ", "short[]", typeName);
		int intValue = 0;
		value = eval(xArrayShort + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("short array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayShort + equalOp + "new short[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short array assignment : wrong type : ", "short[]", typeName);
		value = eval(yArrayShort + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("short array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testIntArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayInt + equalOp + "new int[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("int array assignment : wrong type : ", "int[]", typeName);
		int intValue = 0;
		value = eval(xArrayInt + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("int array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("int array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayInt + equalOp + "new int[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("int array assignment : wrong type : ", "int[]", typeName);
		value = eval(yArrayInt + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("int array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("int array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testLongArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayLong + equalOp + "new long[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long array assignment : wrong type : ", "long[]", typeName);
		int intValue = 0;
		value = eval(xArrayLong + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("long array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayLong + equalOp + "new long[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long array assignment : wrong type : ", "long[]", typeName);
		value = eval(yArrayLong + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("long array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testFloatArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayFloat + equalOp + "new float[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float array assignment : wrong type : ", "float[]", typeName);
		int intValue = 0;
		value = eval(xArrayFloat + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("float array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayFloat + equalOp + "new float[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float array assignment : wrong type : ", "float[]", typeName);
		value = eval(yArrayFloat + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("float array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testDoubleArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayDouble + equalOp + "new double[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double array assignment : wrong type : ", "double[]", typeName);
		int intValue = 0;
		value = eval(xArrayDouble + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("double array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayDouble + equalOp + "new double[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double array assignment : wrong type : ", "double[]", typeName);
		value = eval(yArrayDouble + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("double array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testStringArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayString + equalOp + "new java.lang.String[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String array assignment : wrong type : ", "java.lang.String[]", typeName);
		int intValue = 0;
		value = eval(xArrayString + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("java.lang.String array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayString + equalOp + "new java.lang.String[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String array assignment : wrong type : ", "java.lang.String[]", typeName);
		value = eval(yArrayString + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("java.lang.String array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("java.lang.String array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}

	public void testBooleanArrayAllocation() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xArrayBoolean + equalOp + "new boolean[" + xChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("boolean array assignment : wrong type : ", "boolean[]", typeName);
		int intValue = 0;
		value = eval(xArrayBoolean + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("boolean array length : wrong result : ", xCharValue, intValue);

		value = eval(yArrayBoolean + equalOp + "new boolean[" + yChar + "]"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean array assignment : wrong type : ", "boolean[]", typeName);
		value = eval(yArrayBoolean + ".length"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("boolean array length : wrong type : ", "int", typeName);
		intValue = ((IJavaPrimitiveValue)value).getIntValue();
		assertEquals("boolean array length : wrong result : ", yCharValue, intValue);
		} finally {
		end();
		}
	}


}
