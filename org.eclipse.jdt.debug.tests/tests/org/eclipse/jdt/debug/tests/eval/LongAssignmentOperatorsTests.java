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

public class LongAssignmentOperatorsTests extends Tests {

	public LongAssignmentOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests",37,1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// long += {byte, char, short, int, long, float, double}

	public void testLongPlusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xByteValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yByteValue;
		value = eval(xVarLong + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xByteValue;
		value = eval(yVarLong + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yByteValue;
		value = eval(yVarLong + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xCharValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yCharValue;
		value = eval(xVarLong + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xCharValue;
		value = eval(yVarLong + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yCharValue;
		value = eval(yVarLong + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xShortValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yShortValue;
		value = eval(xVarLong + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xShortValue;
		value = eval(yVarLong + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yShortValue;
		value = eval(yVarLong + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xIntValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yIntValue;
		value = eval(xVarLong + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xIntValue;
		value = eval(yVarLong + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yIntValue;
		value = eval(yVarLong + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xLongValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yLongValue;
		value = eval(xVarLong + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xLongValue;
		value = eval(yVarLong + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yLongValue;
		value = eval(yVarLong + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xFloatValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment float : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yFloatValue;
		value = eval(xVarLong + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xFloatValue;
		value = eval(yVarLong + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yFloatValue;
		value = eval(yVarLong + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar += xDoubleValue;
		IValue value = eval(xVarLong + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment double : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar += yDoubleValue;
		value = eval(xVarLong + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar += xDoubleValue;
		value = eval(yVarLong + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar += yDoubleValue;
		value = eval(yVarLong + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plusAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plusAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long -= {byte, char, short, int, long, float, double}

	public void testLongMinusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xByteValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yByteValue;
		value = eval(xVarLong + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xByteValue;
		value = eval(yVarLong + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yByteValue;
		value = eval(yVarLong + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xCharValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yCharValue;
		value = eval(xVarLong + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xCharValue;
		value = eval(yVarLong + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yCharValue;
		value = eval(yVarLong + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xShortValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yShortValue;
		value = eval(xVarLong + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xShortValue;
		value = eval(yVarLong + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yShortValue;
		value = eval(yVarLong + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xIntValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yIntValue;
		value = eval(xVarLong + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xIntValue;
		value = eval(yVarLong + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yIntValue;
		value = eval(yVarLong + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xLongValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yLongValue;
		value = eval(xVarLong + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xLongValue;
		value = eval(yVarLong + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yLongValue;
		value = eval(yVarLong + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xFloatValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment float : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yFloatValue;
		value = eval(xVarLong + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xFloatValue;
		value = eval(yVarLong + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yFloatValue;
		value = eval(yVarLong + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar -= xDoubleValue;
		IValue value = eval(xVarLong + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment double : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar -= yDoubleValue;
		value = eval(xVarLong + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar -= xDoubleValue;
		value = eval(yVarLong + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar -= yDoubleValue;
		value = eval(yVarLong + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minusAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minusAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long *= {byte, char, short, int, long, float, double}

	public void testLongMultiplyAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xByteValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yByteValue;
		value = eval(xVarLong + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xByteValue;
		value = eval(yVarLong + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yByteValue;
		value = eval(yVarLong + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xCharValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yCharValue;
		value = eval(xVarLong + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xCharValue;
		value = eval(yVarLong + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yCharValue;
		value = eval(yVarLong + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xShortValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yShortValue;
		value = eval(xVarLong + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xShortValue;
		value = eval(yVarLong + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yShortValue;
		value = eval(yVarLong + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xIntValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yIntValue;
		value = eval(xVarLong + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xIntValue;
		value = eval(yVarLong + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yIntValue;
		value = eval(yVarLong + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xLongValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yLongValue;
		value = eval(xVarLong + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xLongValue;
		value = eval(yVarLong + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yLongValue;
		value = eval(yVarLong + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xFloatValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment float : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yFloatValue;
		value = eval(xVarLong + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xFloatValue;
		value = eval(yVarLong + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yFloatValue;
		value = eval(yVarLong + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar *= xDoubleValue;
		IValue value = eval(xVarLong + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment double : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar *= yDoubleValue;
		value = eval(xVarLong + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar *= xDoubleValue;
		value = eval(yVarLong + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar *= yDoubleValue;
		value = eval(yVarLong + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiplyAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiplyAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long /= {byte, char, short, int, long, float, double}

	public void testLongDivideAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xByteValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yByteValue;
		value = eval(xVarLong + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xByteValue;
		value = eval(yVarLong + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yByteValue;
		value = eval(yVarLong + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xCharValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yCharValue;
		value = eval(xVarLong + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xCharValue;
		value = eval(yVarLong + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yCharValue;
		value = eval(yVarLong + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xShortValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yShortValue;
		value = eval(xVarLong + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xShortValue;
		value = eval(yVarLong + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yShortValue;
		value = eval(yVarLong + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xIntValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yIntValue;
		value = eval(xVarLong + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xIntValue;
		value = eval(yVarLong + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yIntValue;
		value = eval(yVarLong + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xLongValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yLongValue;
		value = eval(xVarLong + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xLongValue;
		value = eval(yVarLong + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yLongValue;
		value = eval(yVarLong + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xFloatValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment float : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yFloatValue;
		value = eval(xVarLong + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xFloatValue;
		value = eval(yVarLong + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yFloatValue;
		value = eval(yVarLong + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar /= xDoubleValue;
		IValue value = eval(xVarLong + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment double : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar /= yDoubleValue;
		value = eval(xVarLong + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar /= xDoubleValue;
		value = eval(yVarLong + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar /= yDoubleValue;
		value = eval(yVarLong + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divideAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divideAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long %= {byte, char, short, int, long, float, double}

	public void testLongRemainderAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xByteValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yByteValue;
		value = eval(xVarLong + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xByteValue;
		value = eval(yVarLong + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yByteValue;
		value = eval(yVarLong + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xCharValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yCharValue;
		value = eval(xVarLong + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xCharValue;
		value = eval(yVarLong + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yCharValue;
		value = eval(yVarLong + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xShortValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yShortValue;
		value = eval(xVarLong + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xShortValue;
		value = eval(yVarLong + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yShortValue;
		value = eval(yVarLong + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xIntValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yIntValue;
		value = eval(xVarLong + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xIntValue;
		value = eval(yVarLong + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yIntValue;
		value = eval(yVarLong + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xLongValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yLongValue;
		value = eval(xVarLong + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xLongValue;
		value = eval(yVarLong + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yLongValue;
		value = eval(yVarLong + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xFloatValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment float : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yFloatValue;
		value = eval(xVarLong + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment float : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xFloatValue;
		value = eval(yVarLong + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yFloatValue;
		value = eval(yVarLong + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment float : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment float : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar %= xDoubleValue;
		IValue value = eval(xVarLong + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment double : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar %= yDoubleValue;
		value = eval(xVarLong + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment double : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar %= xDoubleValue;
		value = eval(yVarLong + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar %= yDoubleValue;
		value = eval(yVarLong + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainderAssignment double : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainderAssignment double : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long <<= {byte, char, short, int, long, float, double}

	public void testLongLeftShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar <<= xByteValue;
		IValue value = eval(xVarLong + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar <<= yByteValue;
		value = eval(xVarLong + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar <<= xByteValue;
		value = eval(yVarLong + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar <<= yByteValue;
		value = eval(yVarLong + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar <<= xCharValue;
		IValue value = eval(xVarLong + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar <<= yCharValue;
		value = eval(xVarLong + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar <<= xCharValue;
		value = eval(yVarLong + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar <<= yCharValue;
		value = eval(yVarLong + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar <<= xShortValue;
		IValue value = eval(xVarLong + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar <<= yShortValue;
		value = eval(xVarLong + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar <<= xShortValue;
		value = eval(yVarLong + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar <<= yShortValue;
		value = eval(yVarLong + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar <<= xIntValue;
		IValue value = eval(xVarLong + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar <<= yIntValue;
		value = eval(xVarLong + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar <<= xIntValue;
		value = eval(yVarLong + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar <<= yIntValue;
		value = eval(yVarLong + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar <<= xLongValue;
		IValue value = eval(xVarLong + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar <<= yLongValue;
		value = eval(xVarLong + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar <<= xLongValue;
		value = eval(yVarLong + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar <<= yLongValue;
		value = eval(yVarLong + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShiftAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long >>= {byte, char, short, int, long, float, double}

	public void testLongRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>= xByteValue;
		IValue value = eval(xVarLong + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>= yByteValue;
		value = eval(xVarLong + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>= xByteValue;
		value = eval(yVarLong + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>= yByteValue;
		value = eval(yVarLong + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>= xCharValue;
		IValue value = eval(xVarLong + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>= yCharValue;
		value = eval(xVarLong + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>= xCharValue;
		value = eval(yVarLong + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>= yCharValue;
		value = eval(yVarLong + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>= xShortValue;
		IValue value = eval(xVarLong + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>= yShortValue;
		value = eval(xVarLong + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>= xShortValue;
		value = eval(yVarLong + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>= yShortValue;
		value = eval(yVarLong + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>= xIntValue;
		IValue value = eval(xVarLong + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>= yIntValue;
		value = eval(xVarLong + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>= xIntValue;
		value = eval(yVarLong + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>= yIntValue;
		value = eval(yVarLong + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>= xLongValue;
		IValue value = eval(xVarLong + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>= yLongValue;
		value = eval(xVarLong + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>= xLongValue;
		value = eval(yVarLong + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>= yLongValue;
		value = eval(yVarLong + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShiftAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long >>>= {byte, char, short, int, long, float, double}

	public void testLongUnsignedRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>>= xByteValue;
		IValue value = eval(xVarLong + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>>= yByteValue;
		value = eval(xVarLong + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>>= xByteValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>>= yByteValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>>= xCharValue;
		IValue value = eval(xVarLong + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>>= yCharValue;
		value = eval(xVarLong + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>>= xCharValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>>= yCharValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>>= xShortValue;
		IValue value = eval(xVarLong + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>>= yShortValue;
		value = eval(xVarLong + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>>= xShortValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>>= yShortValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>>= xIntValue;
		IValue value = eval(xVarLong + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>>= yIntValue;
		value = eval(xVarLong + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>>= xIntValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>>= yIntValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar >>>= xLongValue;
		IValue value = eval(xVarLong + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar >>>= yLongValue;
		value = eval(xVarLong + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar >>>= xLongValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar >>>= yLongValue;
		value = eval(yVarLong + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShiftAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShiftAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long |= {byte, char, short, int, long, float, double}

	public void testLongOrAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar |= xByteValue;
		IValue value = eval(xVarLong + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar |= yByteValue;
		value = eval(xVarLong + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar |= xByteValue;
		value = eval(yVarLong + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar |= yByteValue;
		value = eval(yVarLong + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar |= xCharValue;
		IValue value = eval(xVarLong + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar |= yCharValue;
		value = eval(xVarLong + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar |= xCharValue;
		value = eval(yVarLong + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar |= yCharValue;
		value = eval(yVarLong + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar |= xShortValue;
		IValue value = eval(xVarLong + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar |= yShortValue;
		value = eval(xVarLong + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar |= xShortValue;
		value = eval(yVarLong + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar |= yShortValue;
		value = eval(yVarLong + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar |= xIntValue;
		IValue value = eval(xVarLong + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar |= yIntValue;
		value = eval(xVarLong + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar |= xIntValue;
		value = eval(yVarLong + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar |= yIntValue;
		value = eval(yVarLong + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar |= xLongValue;
		IValue value = eval(xVarLong + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar |= yLongValue;
		value = eval(xVarLong + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar |= xLongValue;
		value = eval(yVarLong + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar |= yLongValue;
		value = eval(yVarLong + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long orAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long orAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long &= {byte, char, short, int, long, float, double}

	public void testLongAndAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar &= xByteValue;
		IValue value = eval(xVarLong + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar &= yByteValue;
		value = eval(xVarLong + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar &= xByteValue;
		value = eval(yVarLong + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar &= yByteValue;
		value = eval(yVarLong + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar &= xCharValue;
		IValue value = eval(xVarLong + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar &= yCharValue;
		value = eval(xVarLong + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar &= xCharValue;
		value = eval(yVarLong + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar &= yCharValue;
		value = eval(yVarLong + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar &= xShortValue;
		IValue value = eval(xVarLong + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar &= yShortValue;
		value = eval(xVarLong + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar &= xShortValue;
		value = eval(yVarLong + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar &= yShortValue;
		value = eval(yVarLong + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar &= xIntValue;
		IValue value = eval(xVarLong + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar &= yIntValue;
		value = eval(xVarLong + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar &= xIntValue;
		value = eval(yVarLong + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar &= yIntValue;
		value = eval(yVarLong + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar &= xLongValue;
		IValue value = eval(xVarLong + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar &= yLongValue;
		value = eval(xVarLong + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar &= xLongValue;
		value = eval(yVarLong + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar &= yLongValue;
		value = eval(yVarLong + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long andAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long andAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	// long ^= {byte, char, short, int, long, float, double}

	public void testLongXorAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar ^= xByteValue;
		IValue value = eval(xVarLong + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar ^= yByteValue;
		value = eval(xVarLong + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment byte : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar ^= xByteValue;
		value = eval(yVarLong + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar ^= yByteValue;
		value = eval(yVarLong + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment byte : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar ^= xCharValue;
		IValue value = eval(xVarLong + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar ^= yCharValue;
		value = eval(xVarLong + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment char : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar ^= xCharValue;
		value = eval(yVarLong + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar ^= yCharValue;
		value = eval(yVarLong + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment char : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar ^= xShortValue;
		IValue value = eval(xVarLong + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar ^= yShortValue;
		value = eval(xVarLong + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment short : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar ^= xShortValue;
		value = eval(yVarLong + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar ^= yShortValue;
		value = eval(yVarLong + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment short : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar ^= xIntValue;
		IValue value = eval(xVarLong + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar ^= yIntValue;
		value = eval(xVarLong + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment int : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar ^= xIntValue;
		value = eval(yVarLong + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar ^= yIntValue;
		value = eval(yVarLong + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment int : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		long tmpxVar = xVarLongValue;
		tmpxVar ^= xLongValue;
		IValue value = eval(xVarLong + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		tmpxVar ^= yLongValue;
		value = eval(xVarLong + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment long : wrong result : ", tmpxVar, longValue);
		value = eval(xVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpxVar, longValue);

		long tmpyVar = yVarLongValue;
		tmpyVar ^= xLongValue;
		value = eval(yVarLong + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);

		tmpyVar ^= yLongValue;
		value = eval(yVarLong + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xorAssignment long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xorAssignment long : wrong result : ", tmpyVar, longValue);
		value = eval(yVarLong);
		typeName = value.getReferenceTypeName();
		assertEquals("long local variable value : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long local variable value : wrong result : ", tmpyVar, longValue);
		} finally {
		end();
		}
	}


}
