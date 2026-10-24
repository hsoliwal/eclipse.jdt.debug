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

public class DoubleAssignmentOperatorsTests extends Tests {

	public DoubleAssignmentOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests",37,1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// double += {byte, char, short, int, long, float, double}

	public void testDoublePlusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xByteValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment byte : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yByteValue;
		value = eval(xVarDouble + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xByteValue;
		value = eval(yVarDouble + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yByteValue;
		value = eval(yVarDouble + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoublePlusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xCharValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment char : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yCharValue;
		value = eval(xVarDouble + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xCharValue;
		value = eval(yVarDouble + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yCharValue;
		value = eval(yVarDouble + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoublePlusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xShortValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment short : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yShortValue;
		value = eval(xVarDouble + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xShortValue;
		value = eval(yVarDouble + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yShortValue;
		value = eval(yVarDouble + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoublePlusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xIntValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment int : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yIntValue;
		value = eval(xVarDouble + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xIntValue;
		value = eval(yVarDouble + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yIntValue;
		value = eval(yVarDouble + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoublePlusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xLongValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment long : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yLongValue;
		value = eval(xVarDouble + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xLongValue;
		value = eval(yVarDouble + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yLongValue;
		value = eval(yVarDouble + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoublePlusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xFloatValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment float : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yFloatValue;
		value = eval(xVarDouble + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xFloatValue;
		value = eval(yVarDouble + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yFloatValue;
		value = eval(yVarDouble + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoublePlusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar += xDoubleValue;
		IValue value = eval(xVarDouble + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar += yDoubleValue;
		value = eval(xVarDouble + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar += xDoubleValue;
		value = eval(yVarDouble + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar += yDoubleValue;
		value = eval(yVarDouble + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double plusAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double plusAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	// double -= {byte, char, short, int, long, float, double}

	public void testDoubleMinusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xByteValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment byte : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yByteValue;
		value = eval(xVarDouble + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xByteValue;
		value = eval(yVarDouble + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yByteValue;
		value = eval(yVarDouble + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMinusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xCharValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment char : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yCharValue;
		value = eval(xVarDouble + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xCharValue;
		value = eval(yVarDouble + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yCharValue;
		value = eval(yVarDouble + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMinusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xShortValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment short : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yShortValue;
		value = eval(xVarDouble + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xShortValue;
		value = eval(yVarDouble + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yShortValue;
		value = eval(yVarDouble + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMinusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xIntValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment int : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yIntValue;
		value = eval(xVarDouble + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xIntValue;
		value = eval(yVarDouble + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yIntValue;
		value = eval(yVarDouble + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMinusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xLongValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment long : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yLongValue;
		value = eval(xVarDouble + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xLongValue;
		value = eval(yVarDouble + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yLongValue;
		value = eval(yVarDouble + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMinusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xFloatValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment float : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yFloatValue;
		value = eval(xVarDouble + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xFloatValue;
		value = eval(yVarDouble + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yFloatValue;
		value = eval(yVarDouble + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMinusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar -= xDoubleValue;
		IValue value = eval(xVarDouble + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar -= yDoubleValue;
		value = eval(xVarDouble + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar -= xDoubleValue;
		value = eval(yVarDouble + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar -= yDoubleValue;
		value = eval(yVarDouble + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double minusAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double minusAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	// double *= {byte, char, short, int, long, float, double}

	public void testDoubleMultiplyAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xByteValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment byte : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yByteValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xByteValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yByteValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMultiplyAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xCharValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment char : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yCharValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xCharValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yCharValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMultiplyAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xShortValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment short : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yShortValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xShortValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yShortValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMultiplyAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xIntValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment int : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yIntValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xIntValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yIntValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMultiplyAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xLongValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment long : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yLongValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xLongValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yLongValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMultiplyAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xFloatValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment float : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yFloatValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xFloatValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yFloatValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleMultiplyAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar *= xDoubleValue;
		IValue value = eval(xVarDouble + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar *= yDoubleValue;
		value = eval(xVarDouble + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar *= xDoubleValue;
		value = eval(yVarDouble + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar *= yDoubleValue;
		value = eval(yVarDouble + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double multiplyAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double multiplyAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	// double /= {byte, char, short, int, long, float, double}

	public void testDoubleDivideAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xByteValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment byte : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yByteValue;
		value = eval(xVarDouble + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xByteValue;
		value = eval(yVarDouble + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yByteValue;
		value = eval(yVarDouble + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleDivideAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xCharValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment char : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yCharValue;
		value = eval(xVarDouble + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xCharValue;
		value = eval(yVarDouble + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yCharValue;
		value = eval(yVarDouble + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleDivideAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xShortValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment short : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yShortValue;
		value = eval(xVarDouble + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xShortValue;
		value = eval(yVarDouble + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yShortValue;
		value = eval(yVarDouble + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleDivideAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xIntValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment int : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yIntValue;
		value = eval(xVarDouble + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xIntValue;
		value = eval(yVarDouble + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yIntValue;
		value = eval(yVarDouble + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleDivideAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xLongValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment long : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yLongValue;
		value = eval(xVarDouble + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xLongValue;
		value = eval(yVarDouble + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yLongValue;
		value = eval(yVarDouble + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleDivideAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xFloatValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment float : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yFloatValue;
		value = eval(xVarDouble + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xFloatValue;
		value = eval(yVarDouble + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yFloatValue;
		value = eval(yVarDouble + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleDivideAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar /= xDoubleValue;
		IValue value = eval(xVarDouble + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar /= yDoubleValue;
		value = eval(xVarDouble + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar /= xDoubleValue;
		value = eval(yVarDouble + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar /= yDoubleValue;
		value = eval(yVarDouble + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double divideAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double divideAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	// double %= {byte, char, short, int, long, float, double}

	public void testDoubleRemainderAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xByteValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment byte : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yByteValue;
		value = eval(xVarDouble + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment byte : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xByteValue;
		value = eval(yVarDouble + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yByteValue;
		value = eval(yVarDouble + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment byte : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment byte : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleRemainderAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xCharValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment char : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yCharValue;
		value = eval(xVarDouble + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment char : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xCharValue;
		value = eval(yVarDouble + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yCharValue;
		value = eval(yVarDouble + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment char : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment char : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleRemainderAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xShortValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment short : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yShortValue;
		value = eval(xVarDouble + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment short : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xShortValue;
		value = eval(yVarDouble + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yShortValue;
		value = eval(yVarDouble + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment short : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment short : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleRemainderAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xIntValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment int : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yIntValue;
		value = eval(xVarDouble + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment int : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xIntValue;
		value = eval(yVarDouble + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yIntValue;
		value = eval(yVarDouble + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment int : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment int : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleRemainderAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xLongValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment long : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yLongValue;
		value = eval(xVarDouble + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment long : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xLongValue;
		value = eval(yVarDouble + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yLongValue;
		value = eval(yVarDouble + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment long : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment long : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleRemainderAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xFloatValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment float : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yFloatValue;
		value = eval(xVarDouble + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment float : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xFloatValue;
		value = eval(yVarDouble + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yFloatValue;
		value = eval(yVarDouble + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment float : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment float : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testDoubleRemainderAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		double tmpxVar = xVarDoubleValue;
		tmpxVar %= xDoubleValue;
		IValue value = eval(xVarDouble + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		tmpxVar %= yDoubleValue;
		value = eval(xVarDouble + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment double : wrong result : ", tmpxVar, doubleValue, 0);
		value = eval(xVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpxVar, doubleValue, 0);

		double tmpyVar = yVarDoubleValue;
		tmpyVar %= xDoubleValue;
		value = eval(yVarDouble + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);

		tmpyVar %= yDoubleValue;
		value = eval(yVarDouble + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("double remainderAssignment double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double remainderAssignment double : wrong result : ", tmpyVar, doubleValue, 0);
		value = eval(yVarDouble);
		typeName = value.getReferenceTypeName();
		assertEquals("double local variable value : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("double local variable value : wrong result : ", tmpyVar, doubleValue, 0);
		} finally {
		end();
		}
	}


}
