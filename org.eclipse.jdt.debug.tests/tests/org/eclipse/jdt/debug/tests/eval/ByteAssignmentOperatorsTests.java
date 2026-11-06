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

public class ByteAssignmentOperatorsTests extends Tests {

	public ByteAssignmentOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests",37,1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// byte += {byte, char, short, int, long, float, double}

	public void testBytePlusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xByteValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yByteValue;
		value = eval(xVarByte + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xByteValue;
		value = eval(yVarByte + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yByteValue;
		value = eval(yVarByte + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testBytePlusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xCharValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yCharValue;
		value = eval(xVarByte + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xCharValue;
		value = eval(yVarByte + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yCharValue;
		value = eval(yVarByte + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testBytePlusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xShortValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yShortValue;
		value = eval(xVarByte + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xShortValue;
		value = eval(yVarByte + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yShortValue;
		value = eval(yVarByte + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testBytePlusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xIntValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yIntValue;
		value = eval(xVarByte + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xIntValue;
		value = eval(yVarByte + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yIntValue;
		value = eval(yVarByte + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testBytePlusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xLongValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yLongValue;
		value = eval(xVarByte + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xLongValue;
		value = eval(yVarByte + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yLongValue;
		value = eval(yVarByte + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testBytePlusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xFloatValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment float : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yFloatValue;
		value = eval(xVarByte + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xFloatValue;
		value = eval(yVarByte + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yFloatValue;
		value = eval(yVarByte + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testBytePlusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar += xDoubleValue;
		IValue value = eval(xVarByte + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment double : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar += yDoubleValue;
		value = eval(xVarByte + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar += xDoubleValue;
		value = eval(yVarByte + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar += yDoubleValue;
		value = eval(yVarByte + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte plusAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte plusAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte -= {byte, char, short, int, long, float, double}

	public void testByteMinusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xByteValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yByteValue;
		value = eval(xVarByte + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xByteValue;
		value = eval(yVarByte + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yByteValue;
		value = eval(yVarByte + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMinusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xCharValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yCharValue;
		value = eval(xVarByte + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xCharValue;
		value = eval(yVarByte + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yCharValue;
		value = eval(yVarByte + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMinusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xShortValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yShortValue;
		value = eval(xVarByte + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xShortValue;
		value = eval(yVarByte + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yShortValue;
		value = eval(yVarByte + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMinusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xIntValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yIntValue;
		value = eval(xVarByte + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xIntValue;
		value = eval(yVarByte + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yIntValue;
		value = eval(yVarByte + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMinusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xLongValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yLongValue;
		value = eval(xVarByte + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xLongValue;
		value = eval(yVarByte + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yLongValue;
		value = eval(yVarByte + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMinusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xFloatValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment float : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yFloatValue;
		value = eval(xVarByte + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xFloatValue;
		value = eval(yVarByte + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yFloatValue;
		value = eval(yVarByte + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMinusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar -= xDoubleValue;
		IValue value = eval(xVarByte + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment double : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar -= yDoubleValue;
		value = eval(xVarByte + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar -= xDoubleValue;
		value = eval(yVarByte + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar -= yDoubleValue;
		value = eval(yVarByte + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte minusAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte minusAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte *= {byte, char, short, int, long, float, double}

	public void testByteMultiplyAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xByteValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yByteValue;
		value = eval(xVarByte + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xByteValue;
		value = eval(yVarByte + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yByteValue;
		value = eval(yVarByte + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMultiplyAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xCharValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yCharValue;
		value = eval(xVarByte + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xCharValue;
		value = eval(yVarByte + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yCharValue;
		value = eval(yVarByte + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMultiplyAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xShortValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yShortValue;
		value = eval(xVarByte + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xShortValue;
		value = eval(yVarByte + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yShortValue;
		value = eval(yVarByte + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMultiplyAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xIntValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yIntValue;
		value = eval(xVarByte + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xIntValue;
		value = eval(yVarByte + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yIntValue;
		value = eval(yVarByte + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMultiplyAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xLongValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yLongValue;
		value = eval(xVarByte + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xLongValue;
		value = eval(yVarByte + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yLongValue;
		value = eval(yVarByte + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMultiplyAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xFloatValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment float : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yFloatValue;
		value = eval(xVarByte + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xFloatValue;
		value = eval(yVarByte + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yFloatValue;
		value = eval(yVarByte + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteMultiplyAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar *= xDoubleValue;
		IValue value = eval(xVarByte + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment double : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar *= yDoubleValue;
		value = eval(xVarByte + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar *= xDoubleValue;
		value = eval(yVarByte + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar *= yDoubleValue;
		value = eval(yVarByte + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte multiplyAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte multiplyAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte /= {byte, char, short, int, long, float, double}

	public void testByteDivideAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xByteValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yByteValue;
		value = eval(xVarByte + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xByteValue;
		value = eval(yVarByte + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yByteValue;
		value = eval(yVarByte + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteDivideAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xCharValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yCharValue;
		value = eval(xVarByte + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xCharValue;
		value = eval(yVarByte + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yCharValue;
		value = eval(yVarByte + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteDivideAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xShortValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yShortValue;
		value = eval(xVarByte + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xShortValue;
		value = eval(yVarByte + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yShortValue;
		value = eval(yVarByte + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteDivideAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xIntValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yIntValue;
		value = eval(xVarByte + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xIntValue;
		value = eval(yVarByte + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yIntValue;
		value = eval(yVarByte + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteDivideAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xLongValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yLongValue;
		value = eval(xVarByte + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xLongValue;
		value = eval(yVarByte + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yLongValue;
		value = eval(yVarByte + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteDivideAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xFloatValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment float : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yFloatValue;
		value = eval(xVarByte + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xFloatValue;
		value = eval(yVarByte + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yFloatValue;
		value = eval(yVarByte + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteDivideAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar /= xDoubleValue;
		IValue value = eval(xVarByte + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment double : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar /= yDoubleValue;
		value = eval(xVarByte + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar /= xDoubleValue;
		value = eval(yVarByte + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar /= yDoubleValue;
		value = eval(yVarByte + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte divideAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte divideAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte %= {byte, char, short, int, long, float, double}

	public void testByteRemainderAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xByteValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yByteValue;
		value = eval(xVarByte + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xByteValue;
		value = eval(yVarByte + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yByteValue;
		value = eval(yVarByte + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRemainderAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xCharValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yCharValue;
		value = eval(xVarByte + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xCharValue;
		value = eval(yVarByte + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yCharValue;
		value = eval(yVarByte + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRemainderAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xShortValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yShortValue;
		value = eval(xVarByte + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xShortValue;
		value = eval(yVarByte + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yShortValue;
		value = eval(yVarByte + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRemainderAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xIntValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yIntValue;
		value = eval(xVarByte + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xIntValue;
		value = eval(yVarByte + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yIntValue;
		value = eval(yVarByte + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRemainderAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xLongValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yLongValue;
		value = eval(xVarByte + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xLongValue;
		value = eval(yVarByte + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yLongValue;
		value = eval(yVarByte + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRemainderAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xFloatValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment float : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yFloatValue;
		value = eval(xVarByte + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment float : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xFloatValue;
		value = eval(yVarByte + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yFloatValue;
		value = eval(yVarByte + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment float : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment float : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRemainderAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar %= xDoubleValue;
		IValue value = eval(xVarByte + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment double : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar %= yDoubleValue;
		value = eval(xVarByte + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment double : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar %= xDoubleValue;
		value = eval(yVarByte + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar %= yDoubleValue;
		value = eval(yVarByte + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte remainderAssignment double : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte remainderAssignment double : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte <<= {byte, char, short, int, long, float, double}

	public void testByteLeftShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar <<= xByteValue;
		IValue value = eval(xVarByte + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar <<= yByteValue;
		value = eval(xVarByte + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar <<= xByteValue;
		value = eval(yVarByte + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar <<= yByteValue;
		value = eval(yVarByte + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteLeftShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar <<= xCharValue;
		IValue value = eval(xVarByte + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar <<= yCharValue;
		value = eval(xVarByte + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar <<= xCharValue;
		value = eval(yVarByte + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar <<= yCharValue;
		value = eval(yVarByte + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteLeftShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar <<= xShortValue;
		IValue value = eval(xVarByte + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar <<= yShortValue;
		value = eval(xVarByte + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar <<= xShortValue;
		value = eval(yVarByte + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar <<= yShortValue;
		value = eval(yVarByte + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteLeftShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar <<= xIntValue;
		IValue value = eval(xVarByte + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar <<= yIntValue;
		value = eval(xVarByte + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar <<= xIntValue;
		value = eval(yVarByte + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar <<= yIntValue;
		value = eval(yVarByte + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteLeftShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar <<= xLongValue;
		IValue value = eval(xVarByte + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar <<= yLongValue;
		value = eval(xVarByte + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar <<= xLongValue;
		value = eval(yVarByte + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar <<= yLongValue;
		value = eval(yVarByte + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte leftShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte leftShiftAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte >>= {byte, char, short, int, long, float, double}

	public void testByteRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>= xByteValue;
		IValue value = eval(xVarByte + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>= yByteValue;
		value = eval(xVarByte + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>= xByteValue;
		value = eval(yVarByte + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>= yByteValue;
		value = eval(yVarByte + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>= xCharValue;
		IValue value = eval(xVarByte + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>= yCharValue;
		value = eval(xVarByte + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>= xCharValue;
		value = eval(yVarByte + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>= yCharValue;
		value = eval(yVarByte + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>= xShortValue;
		IValue value = eval(xVarByte + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>= yShortValue;
		value = eval(xVarByte + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>= xShortValue;
		value = eval(yVarByte + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>= yShortValue;
		value = eval(yVarByte + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>= xIntValue;
		IValue value = eval(xVarByte + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>= yIntValue;
		value = eval(xVarByte + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>= xIntValue;
		value = eval(yVarByte + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>= yIntValue;
		value = eval(yVarByte + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>= xLongValue;
		IValue value = eval(xVarByte + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>= yLongValue;
		value = eval(xVarByte + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>= xLongValue;
		value = eval(yVarByte + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>= yLongValue;
		value = eval(yVarByte + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte rightShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte rightShiftAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte >>>= {byte, char, short, int, long, float, double}

	public void testByteUnsignedRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>>= xByteValue;
		IValue value = eval(xVarByte + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>>= yByteValue;
		value = eval(xVarByte + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>>= xByteValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>>= yByteValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteUnsignedRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>>= xCharValue;
		IValue value = eval(xVarByte + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>>= yCharValue;
		value = eval(xVarByte + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>>= xCharValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>>= yCharValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteUnsignedRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>>= xShortValue;
		IValue value = eval(xVarByte + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>>= yShortValue;
		value = eval(xVarByte + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>>= xShortValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>>= yShortValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteUnsignedRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>>= xIntValue;
		IValue value = eval(xVarByte + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>>= yIntValue;
		value = eval(xVarByte + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>>= xIntValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>>= yIntValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteUnsignedRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar >>>= xLongValue;
		IValue value = eval(xVarByte + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar >>>= yLongValue;
		value = eval(xVarByte + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar >>>= xLongValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar >>>= yLongValue;
		value = eval(yVarByte + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte unsignedRightShiftAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte unsignedRightShiftAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte |= {byte, char, short, int, long, float, double}

	public void testByteOrAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar |= xByteValue;
		IValue value = eval(xVarByte + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar |= yByteValue;
		value = eval(xVarByte + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar |= xByteValue;
		value = eval(yVarByte + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar |= yByteValue;
		value = eval(yVarByte + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteOrAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar |= xCharValue;
		IValue value = eval(xVarByte + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar |= yCharValue;
		value = eval(xVarByte + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar |= xCharValue;
		value = eval(yVarByte + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar |= yCharValue;
		value = eval(yVarByte + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteOrAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar |= xShortValue;
		IValue value = eval(xVarByte + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar |= yShortValue;
		value = eval(xVarByte + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar |= xShortValue;
		value = eval(yVarByte + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar |= yShortValue;
		value = eval(yVarByte + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteOrAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar |= xIntValue;
		IValue value = eval(xVarByte + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar |= yIntValue;
		value = eval(xVarByte + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar |= xIntValue;
		value = eval(yVarByte + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar |= yIntValue;
		value = eval(yVarByte + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteOrAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar |= xLongValue;
		IValue value = eval(xVarByte + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar |= yLongValue;
		value = eval(xVarByte + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar |= xLongValue;
		value = eval(yVarByte + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar |= yLongValue;
		value = eval(yVarByte + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte orAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte orAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte &= {byte, char, short, int, long, float, double}

	public void testByteAndAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar &= xByteValue;
		IValue value = eval(xVarByte + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar &= yByteValue;
		value = eval(xVarByte + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar &= xByteValue;
		value = eval(yVarByte + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar &= yByteValue;
		value = eval(yVarByte + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteAndAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar &= xCharValue;
		IValue value = eval(xVarByte + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar &= yCharValue;
		value = eval(xVarByte + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar &= xCharValue;
		value = eval(yVarByte + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar &= yCharValue;
		value = eval(yVarByte + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteAndAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar &= xShortValue;
		IValue value = eval(xVarByte + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar &= yShortValue;
		value = eval(xVarByte + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar &= xShortValue;
		value = eval(yVarByte + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar &= yShortValue;
		value = eval(yVarByte + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteAndAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar &= xIntValue;
		IValue value = eval(xVarByte + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar &= yIntValue;
		value = eval(xVarByte + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar &= xIntValue;
		value = eval(yVarByte + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar &= yIntValue;
		value = eval(yVarByte + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteAndAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar &= xLongValue;
		IValue value = eval(xVarByte + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar &= yLongValue;
		value = eval(xVarByte + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar &= xLongValue;
		value = eval(yVarByte + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar &= yLongValue;
		value = eval(yVarByte + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte andAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte andAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	// byte ^= {byte, char, short, int, long, float, double}

	public void testByteXorAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar ^= xByteValue;
		IValue value = eval(xVarByte + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment byte : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar ^= yByteValue;
		value = eval(xVarByte + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment byte : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar ^= xByteValue;
		value = eval(yVarByte + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar ^= yByteValue;
		value = eval(yVarByte + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment byte : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment byte : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteXorAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar ^= xCharValue;
		IValue value = eval(xVarByte + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment char : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar ^= yCharValue;
		value = eval(xVarByte + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment char : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar ^= xCharValue;
		value = eval(yVarByte + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar ^= yCharValue;
		value = eval(yVarByte + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment char : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment char : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteXorAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar ^= xShortValue;
		IValue value = eval(xVarByte + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment short : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar ^= yShortValue;
		value = eval(xVarByte + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment short : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar ^= xShortValue;
		value = eval(yVarByte + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar ^= yShortValue;
		value = eval(yVarByte + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment short : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment short : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteXorAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar ^= xIntValue;
		IValue value = eval(xVarByte + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment int : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar ^= yIntValue;
		value = eval(xVarByte + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment int : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar ^= xIntValue;
		value = eval(yVarByte + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar ^= yIntValue;
		value = eval(yVarByte + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment int : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment int : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}

	public void testByteXorAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		byte tmpxVar = xVarByteValue;
		tmpxVar ^= xLongValue;
		IValue value = eval(xVarByte + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment long : wrong type : ", "byte", typeName);
		byte byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		tmpxVar ^= yLongValue;
		value = eval(xVarByte + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment long : wrong result : ", tmpxVar, byteValue);
		value = eval(xVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpxVar, byteValue);

		byte tmpyVar = yVarByteValue;
		tmpyVar ^= xLongValue;
		value = eval(yVarByte + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);

		tmpyVar ^= yLongValue;
		value = eval(yVarByte + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("byte xorAssignment long : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte xorAssignment long : wrong result : ", tmpyVar, byteValue);
		value = eval(yVarByte);
		typeName = value.getReferenceTypeName();
		assertEquals("byte local variable value : wrong type : ", "byte", typeName);
		byteValue = ((IJavaPrimitiveValue)value).getByteValue();
		assertEquals("byte local variable value : wrong result : ", tmpyVar, byteValue);
		} finally {
		end();
		}
	}


}
