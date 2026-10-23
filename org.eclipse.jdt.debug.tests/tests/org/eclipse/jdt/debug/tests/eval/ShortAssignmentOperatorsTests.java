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

public class ShortAssignmentOperatorsTests extends Tests {

	public ShortAssignmentOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests",37,1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// short += {byte, char, short, int, long, float, double}

	public void testShortPlusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xByteValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yByteValue;
		value = eval(xVarShort + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xByteValue;
		value = eval(yVarShort + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yByteValue;
		value = eval(yVarShort + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortPlusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xCharValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yCharValue;
		value = eval(xVarShort + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xCharValue;
		value = eval(yVarShort + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yCharValue;
		value = eval(yVarShort + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortPlusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xShortValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yShortValue;
		value = eval(xVarShort + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xShortValue;
		value = eval(yVarShort + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yShortValue;
		value = eval(yVarShort + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortPlusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xIntValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yIntValue;
		value = eval(xVarShort + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xIntValue;
		value = eval(yVarShort + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yIntValue;
		value = eval(yVarShort + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortPlusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xLongValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yLongValue;
		value = eval(xVarShort + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xLongValue;
		value = eval(yVarShort + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yLongValue;
		value = eval(yVarShort + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortPlusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xFloatValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment float : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yFloatValue;
		value = eval(xVarShort + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xFloatValue;
		value = eval(yVarShort + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yFloatValue;
		value = eval(yVarShort + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortPlusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar += xDoubleValue;
		IValue value = eval(xVarShort + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment double : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar += yDoubleValue;
		value = eval(xVarShort + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar += xDoubleValue;
		value = eval(yVarShort + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar += yDoubleValue;
		value = eval(yVarShort + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short plusAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short plusAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short -= {byte, char, short, int, long, float, double}

	public void testShortMinusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xByteValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yByteValue;
		value = eval(xVarShort + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xByteValue;
		value = eval(yVarShort + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yByteValue;
		value = eval(yVarShort + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMinusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xCharValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yCharValue;
		value = eval(xVarShort + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xCharValue;
		value = eval(yVarShort + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yCharValue;
		value = eval(yVarShort + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMinusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xShortValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yShortValue;
		value = eval(xVarShort + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xShortValue;
		value = eval(yVarShort + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yShortValue;
		value = eval(yVarShort + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMinusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xIntValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yIntValue;
		value = eval(xVarShort + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xIntValue;
		value = eval(yVarShort + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yIntValue;
		value = eval(yVarShort + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMinusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xLongValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yLongValue;
		value = eval(xVarShort + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xLongValue;
		value = eval(yVarShort + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yLongValue;
		value = eval(yVarShort + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMinusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xFloatValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment float : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yFloatValue;
		value = eval(xVarShort + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xFloatValue;
		value = eval(yVarShort + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yFloatValue;
		value = eval(yVarShort + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMinusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar -= xDoubleValue;
		IValue value = eval(xVarShort + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment double : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar -= yDoubleValue;
		value = eval(xVarShort + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar -= xDoubleValue;
		value = eval(yVarShort + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar -= yDoubleValue;
		value = eval(yVarShort + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short minusAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short minusAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short *= {byte, char, short, int, long, float, double}

	public void testShortMultiplyAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xByteValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yByteValue;
		value = eval(xVarShort + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xByteValue;
		value = eval(yVarShort + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yByteValue;
		value = eval(yVarShort + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMultiplyAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xCharValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yCharValue;
		value = eval(xVarShort + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xCharValue;
		value = eval(yVarShort + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yCharValue;
		value = eval(yVarShort + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMultiplyAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xShortValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yShortValue;
		value = eval(xVarShort + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xShortValue;
		value = eval(yVarShort + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yShortValue;
		value = eval(yVarShort + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMultiplyAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xIntValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yIntValue;
		value = eval(xVarShort + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xIntValue;
		value = eval(yVarShort + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yIntValue;
		value = eval(yVarShort + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMultiplyAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xLongValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yLongValue;
		value = eval(xVarShort + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xLongValue;
		value = eval(yVarShort + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yLongValue;
		value = eval(yVarShort + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMultiplyAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xFloatValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment float : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yFloatValue;
		value = eval(xVarShort + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xFloatValue;
		value = eval(yVarShort + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yFloatValue;
		value = eval(yVarShort + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortMultiplyAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar *= xDoubleValue;
		IValue value = eval(xVarShort + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment double : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar *= yDoubleValue;
		value = eval(xVarShort + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar *= xDoubleValue;
		value = eval(yVarShort + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar *= yDoubleValue;
		value = eval(yVarShort + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short multiplyAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short multiplyAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short /= {byte, char, short, int, long, float, double}

	public void testShortDivideAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xByteValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yByteValue;
		value = eval(xVarShort + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xByteValue;
		value = eval(yVarShort + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yByteValue;
		value = eval(yVarShort + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortDivideAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xCharValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yCharValue;
		value = eval(xVarShort + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xCharValue;
		value = eval(yVarShort + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yCharValue;
		value = eval(yVarShort + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortDivideAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xShortValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yShortValue;
		value = eval(xVarShort + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xShortValue;
		value = eval(yVarShort + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yShortValue;
		value = eval(yVarShort + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortDivideAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xIntValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yIntValue;
		value = eval(xVarShort + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xIntValue;
		value = eval(yVarShort + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yIntValue;
		value = eval(yVarShort + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortDivideAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xLongValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yLongValue;
		value = eval(xVarShort + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xLongValue;
		value = eval(yVarShort + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yLongValue;
		value = eval(yVarShort + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortDivideAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xFloatValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment float : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yFloatValue;
		value = eval(xVarShort + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xFloatValue;
		value = eval(yVarShort + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yFloatValue;
		value = eval(yVarShort + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortDivideAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar /= xDoubleValue;
		IValue value = eval(xVarShort + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment double : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar /= yDoubleValue;
		value = eval(xVarShort + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar /= xDoubleValue;
		value = eval(yVarShort + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar /= yDoubleValue;
		value = eval(yVarShort + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short divideAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short divideAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short %= {byte, char, short, int, long, float, double}

	public void testShortRemainderAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xByteValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yByteValue;
		value = eval(xVarShort + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xByteValue;
		value = eval(yVarShort + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yByteValue;
		value = eval(yVarShort + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRemainderAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xCharValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yCharValue;
		value = eval(xVarShort + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xCharValue;
		value = eval(yVarShort + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yCharValue;
		value = eval(yVarShort + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRemainderAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xShortValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yShortValue;
		value = eval(xVarShort + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xShortValue;
		value = eval(yVarShort + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yShortValue;
		value = eval(yVarShort + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRemainderAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xIntValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yIntValue;
		value = eval(xVarShort + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xIntValue;
		value = eval(yVarShort + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yIntValue;
		value = eval(yVarShort + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRemainderAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xLongValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yLongValue;
		value = eval(xVarShort + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xLongValue;
		value = eval(yVarShort + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yLongValue;
		value = eval(yVarShort + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRemainderAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xFloatValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment float : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yFloatValue;
		value = eval(xVarShort + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment float : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xFloatValue;
		value = eval(yVarShort + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yFloatValue;
		value = eval(yVarShort + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment float : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment float : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRemainderAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar %= xDoubleValue;
		IValue value = eval(xVarShort + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment double : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar %= yDoubleValue;
		value = eval(xVarShort + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment double : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar %= xDoubleValue;
		value = eval(yVarShort + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar %= yDoubleValue;
		value = eval(yVarShort + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short remainderAssignment double : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short remainderAssignment double : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short <<= {byte, char, short, int, long, float, double}

	public void testShortLeftShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar <<= xByteValue;
		IValue value = eval(xVarShort + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar <<= yByteValue;
		value = eval(xVarShort + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar <<= xByteValue;
		value = eval(yVarShort + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar <<= yByteValue;
		value = eval(yVarShort + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortLeftShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar <<= xCharValue;
		IValue value = eval(xVarShort + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar <<= yCharValue;
		value = eval(xVarShort + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar <<= xCharValue;
		value = eval(yVarShort + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar <<= yCharValue;
		value = eval(yVarShort + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortLeftShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar <<= xShortValue;
		IValue value = eval(xVarShort + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar <<= yShortValue;
		value = eval(xVarShort + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar <<= xShortValue;
		value = eval(yVarShort + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar <<= yShortValue;
		value = eval(yVarShort + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortLeftShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar <<= xIntValue;
		IValue value = eval(xVarShort + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar <<= yIntValue;
		value = eval(xVarShort + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar <<= xIntValue;
		value = eval(yVarShort + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar <<= yIntValue;
		value = eval(yVarShort + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortLeftShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar <<= xLongValue;
		IValue value = eval(xVarShort + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar <<= yLongValue;
		value = eval(xVarShort + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar <<= xLongValue;
		value = eval(yVarShort + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar <<= yLongValue;
		value = eval(yVarShort + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short leftShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short leftShiftAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short >>= {byte, char, short, int, long, float, double}

	public void testShortRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>= xByteValue;
		IValue value = eval(xVarShort + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>= yByteValue;
		value = eval(xVarShort + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>= xByteValue;
		value = eval(yVarShort + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>= yByteValue;
		value = eval(yVarShort + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>= xCharValue;
		IValue value = eval(xVarShort + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>= yCharValue;
		value = eval(xVarShort + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>= xCharValue;
		value = eval(yVarShort + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>= yCharValue;
		value = eval(yVarShort + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>= xShortValue;
		IValue value = eval(xVarShort + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>= yShortValue;
		value = eval(xVarShort + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>= xShortValue;
		value = eval(yVarShort + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>= yShortValue;
		value = eval(yVarShort + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>= xIntValue;
		IValue value = eval(xVarShort + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>= yIntValue;
		value = eval(xVarShort + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>= xIntValue;
		value = eval(yVarShort + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>= yIntValue;
		value = eval(yVarShort + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>= xLongValue;
		IValue value = eval(xVarShort + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>= yLongValue;
		value = eval(xVarShort + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>= xLongValue;
		value = eval(yVarShort + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>= yLongValue;
		value = eval(yVarShort + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short rightShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short rightShiftAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short >>>= {byte, char, short, int, long, float, double}

	public void testShortUnsignedRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>>= xByteValue;
		IValue value = eval(xVarShort + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>>= yByteValue;
		value = eval(xVarShort + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>>= xByteValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>>= yByteValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortUnsignedRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>>= xCharValue;
		IValue value = eval(xVarShort + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>>= yCharValue;
		value = eval(xVarShort + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>>= xCharValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>>= yCharValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortUnsignedRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>>= xShortValue;
		IValue value = eval(xVarShort + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>>= yShortValue;
		value = eval(xVarShort + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>>= xShortValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>>= yShortValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortUnsignedRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>>= xIntValue;
		IValue value = eval(xVarShort + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>>= yIntValue;
		value = eval(xVarShort + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>>= xIntValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>>= yIntValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortUnsignedRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar >>>= xLongValue;
		IValue value = eval(xVarShort + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar >>>= yLongValue;
		value = eval(xVarShort + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar >>>= xLongValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar >>>= yLongValue;
		value = eval(yVarShort + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short unsignedRightShiftAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short unsignedRightShiftAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short |= {byte, char, short, int, long, float, double}

	public void testShortOrAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar |= xByteValue;
		IValue value = eval(xVarShort + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar |= yByteValue;
		value = eval(xVarShort + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar |= xByteValue;
		value = eval(yVarShort + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar |= yByteValue;
		value = eval(yVarShort + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortOrAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar |= xCharValue;
		IValue value = eval(xVarShort + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar |= yCharValue;
		value = eval(xVarShort + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar |= xCharValue;
		value = eval(yVarShort + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar |= yCharValue;
		value = eval(yVarShort + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortOrAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar |= xShortValue;
		IValue value = eval(xVarShort + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar |= yShortValue;
		value = eval(xVarShort + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar |= xShortValue;
		value = eval(yVarShort + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar |= yShortValue;
		value = eval(yVarShort + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortOrAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar |= xIntValue;
		IValue value = eval(xVarShort + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar |= yIntValue;
		value = eval(xVarShort + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar |= xIntValue;
		value = eval(yVarShort + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar |= yIntValue;
		value = eval(yVarShort + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortOrAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar |= xLongValue;
		IValue value = eval(xVarShort + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar |= yLongValue;
		value = eval(xVarShort + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar |= xLongValue;
		value = eval(yVarShort + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar |= yLongValue;
		value = eval(yVarShort + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short orAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short orAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short &= {byte, char, short, int, long, float, double}

	public void testShortAndAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar &= xByteValue;
		IValue value = eval(xVarShort + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar &= yByteValue;
		value = eval(xVarShort + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar &= xByteValue;
		value = eval(yVarShort + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar &= yByteValue;
		value = eval(yVarShort + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortAndAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar &= xCharValue;
		IValue value = eval(xVarShort + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar &= yCharValue;
		value = eval(xVarShort + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar &= xCharValue;
		value = eval(yVarShort + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar &= yCharValue;
		value = eval(yVarShort + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortAndAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar &= xShortValue;
		IValue value = eval(xVarShort + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar &= yShortValue;
		value = eval(xVarShort + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar &= xShortValue;
		value = eval(yVarShort + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar &= yShortValue;
		value = eval(yVarShort + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortAndAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar &= xIntValue;
		IValue value = eval(xVarShort + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar &= yIntValue;
		value = eval(xVarShort + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar &= xIntValue;
		value = eval(yVarShort + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar &= yIntValue;
		value = eval(yVarShort + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortAndAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar &= xLongValue;
		IValue value = eval(xVarShort + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar &= yLongValue;
		value = eval(xVarShort + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar &= xLongValue;
		value = eval(yVarShort + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar &= yLongValue;
		value = eval(yVarShort + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short andAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short andAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	// short ^= {byte, char, short, int, long, float, double}

	public void testShortXorAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar ^= xByteValue;
		IValue value = eval(xVarShort + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment byte : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar ^= yByteValue;
		value = eval(xVarShort + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment byte : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar ^= xByteValue;
		value = eval(yVarShort + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar ^= yByteValue;
		value = eval(yVarShort + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment byte : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment byte : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortXorAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar ^= xCharValue;
		IValue value = eval(xVarShort + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment char : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar ^= yCharValue;
		value = eval(xVarShort + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment char : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar ^= xCharValue;
		value = eval(yVarShort + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar ^= yCharValue;
		value = eval(yVarShort + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment char : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment char : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortXorAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar ^= xShortValue;
		IValue value = eval(xVarShort + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment short : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar ^= yShortValue;
		value = eval(xVarShort + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment short : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar ^= xShortValue;
		value = eval(yVarShort + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar ^= yShortValue;
		value = eval(yVarShort + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment short : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment short : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortXorAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar ^= xIntValue;
		IValue value = eval(xVarShort + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment int : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar ^= yIntValue;
		value = eval(xVarShort + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment int : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar ^= xIntValue;
		value = eval(yVarShort + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar ^= yIntValue;
		value = eval(yVarShort + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment int : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment int : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}

	public void testShortXorAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		short tmpxVar = xVarShortValue;
		tmpxVar ^= xLongValue;
		IValue value = eval(xVarShort + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment long : wrong type : ", "short", typeName);
		short shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		tmpxVar ^= yLongValue;
		value = eval(xVarShort + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment long : wrong result : ", tmpxVar, shortValue);
		value = eval(xVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpxVar, shortValue);

		short tmpyVar = yVarShortValue;
		tmpyVar ^= xLongValue;
		value = eval(yVarShort + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);

		tmpyVar ^= yLongValue;
		value = eval(yVarShort + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("short xorAssignment long : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short xorAssignment long : wrong result : ", tmpyVar, shortValue);
		value = eval(yVarShort);
		typeName = value.getReferenceTypeName();
		assertEquals("short local variable value : wrong type : ", "short", typeName);
		shortValue = ((IJavaPrimitiveValue)value).getShortValue();
		assertEquals("short local variable value : wrong result : ", tmpyVar, shortValue);
		} finally {
		end();
		}
	}


}
