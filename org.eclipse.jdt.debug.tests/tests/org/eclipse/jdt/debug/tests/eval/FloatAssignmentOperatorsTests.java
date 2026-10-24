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

public class FloatAssignmentOperatorsTests extends Tests {

	public FloatAssignmentOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests",37,1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// float += {byte, char, short, int, long, float, double}

	public void testFloatPlusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xByteValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yByteValue;
		value = eval(xVarFloat + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xByteValue;
		value = eval(yVarFloat + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yByteValue;
		value = eval(yVarFloat + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xCharValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yCharValue;
		value = eval(xVarFloat + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xCharValue;
		value = eval(yVarFloat + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yCharValue;
		value = eval(yVarFloat + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xShortValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yShortValue;
		value = eval(xVarFloat + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xShortValue;
		value = eval(yVarFloat + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yShortValue;
		value = eval(yVarFloat + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xIntValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yIntValue;
		value = eval(xVarFloat + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xIntValue;
		value = eval(yVarFloat + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yIntValue;
		value = eval(yVarFloat + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xLongValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yLongValue;
		value = eval(xVarFloat + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xLongValue;
		value = eval(yVarFloat + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yLongValue;
		value = eval(yVarFloat + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xFloatValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yFloatValue;
		value = eval(xVarFloat + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xFloatValue;
		value = eval(yVarFloat + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yFloatValue;
		value = eval(yVarFloat + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar += xDoubleValue;
		IValue value = eval(xVarFloat + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment double : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar += yDoubleValue;
		value = eval(xVarFloat + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar += xDoubleValue;
		value = eval(yVarFloat + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar += yDoubleValue;
		value = eval(yVarFloat + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plusAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plusAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	// float -= {byte, char, short, int, long, float, double}

	public void testFloatMinusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xByteValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yByteValue;
		value = eval(xVarFloat + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xByteValue;
		value = eval(yVarFloat + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yByteValue;
		value = eval(yVarFloat + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xCharValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yCharValue;
		value = eval(xVarFloat + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xCharValue;
		value = eval(yVarFloat + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yCharValue;
		value = eval(yVarFloat + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xShortValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yShortValue;
		value = eval(xVarFloat + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xShortValue;
		value = eval(yVarFloat + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yShortValue;
		value = eval(yVarFloat + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xIntValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yIntValue;
		value = eval(xVarFloat + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xIntValue;
		value = eval(yVarFloat + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yIntValue;
		value = eval(yVarFloat + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xLongValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yLongValue;
		value = eval(xVarFloat + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xLongValue;
		value = eval(yVarFloat + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yLongValue;
		value = eval(yVarFloat + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xFloatValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yFloatValue;
		value = eval(xVarFloat + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xFloatValue;
		value = eval(yVarFloat + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yFloatValue;
		value = eval(yVarFloat + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar -= xDoubleValue;
		IValue value = eval(xVarFloat + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment double : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar -= yDoubleValue;
		value = eval(xVarFloat + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar -= xDoubleValue;
		value = eval(yVarFloat + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar -= yDoubleValue;
		value = eval(yVarFloat + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minusAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minusAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	// float *= {byte, char, short, int, long, float, double}

	public void testFloatMultiplyAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xByteValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yByteValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xByteValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yByteValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xCharValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yCharValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xCharValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yCharValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xShortValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yShortValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xShortValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yShortValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xIntValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yIntValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xIntValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yIntValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xLongValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yLongValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xLongValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yLongValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xFloatValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yFloatValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xFloatValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yFloatValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar *= xDoubleValue;
		IValue value = eval(xVarFloat + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment double : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar *= yDoubleValue;
		value = eval(xVarFloat + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar *= xDoubleValue;
		value = eval(yVarFloat + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar *= yDoubleValue;
		value = eval(yVarFloat + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiplyAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiplyAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	// float /= {byte, char, short, int, long, float, double}

	public void testFloatDivideAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xByteValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yByteValue;
		value = eval(xVarFloat + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xByteValue;
		value = eval(yVarFloat + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yByteValue;
		value = eval(yVarFloat + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xCharValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yCharValue;
		value = eval(xVarFloat + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xCharValue;
		value = eval(yVarFloat + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yCharValue;
		value = eval(yVarFloat + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xShortValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yShortValue;
		value = eval(xVarFloat + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xShortValue;
		value = eval(yVarFloat + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yShortValue;
		value = eval(yVarFloat + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xIntValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yIntValue;
		value = eval(xVarFloat + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xIntValue;
		value = eval(yVarFloat + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yIntValue;
		value = eval(yVarFloat + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xLongValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yLongValue;
		value = eval(xVarFloat + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xLongValue;
		value = eval(yVarFloat + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yLongValue;
		value = eval(yVarFloat + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xFloatValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yFloatValue;
		value = eval(xVarFloat + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xFloatValue;
		value = eval(yVarFloat + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yFloatValue;
		value = eval(yVarFloat + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar /= xDoubleValue;
		IValue value = eval(xVarFloat + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment double : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar /= yDoubleValue;
		value = eval(xVarFloat + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar /= xDoubleValue;
		value = eval(yVarFloat + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar /= yDoubleValue;
		value = eval(yVarFloat + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divideAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divideAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	// float %= {byte, char, short, int, long, float, double}

	public void testFloatRemainderAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xByteValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yByteValue;
		value = eval(xVarFloat + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment byte : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xByteValue;
		value = eval(yVarFloat + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yByteValue;
		value = eval(yVarFloat + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment byte : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xCharValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yCharValue;
		value = eval(xVarFloat + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment char : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xCharValue;
		value = eval(yVarFloat + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yCharValue;
		value = eval(yVarFloat + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment char : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xShortValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yShortValue;
		value = eval(xVarFloat + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment short : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xShortValue;
		value = eval(yVarFloat + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yShortValue;
		value = eval(yVarFloat + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment short : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xIntValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yIntValue;
		value = eval(xVarFloat + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment int : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xIntValue;
		value = eval(yVarFloat + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yIntValue;
		value = eval(yVarFloat + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment int : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xLongValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yLongValue;
		value = eval(xVarFloat + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment long : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xLongValue;
		value = eval(yVarFloat + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yLongValue;
		value = eval(yVarFloat + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment long : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xFloatValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yFloatValue;
		value = eval(xVarFloat + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment float : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xFloatValue;
		value = eval(yVarFloat + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yFloatValue;
		value = eval(yVarFloat + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment float : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		float tmpxVar = xVarFloatValue;
		tmpxVar %= xDoubleValue;
		IValue value = eval(xVarFloat + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment double : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		tmpxVar %= yDoubleValue;
		value = eval(xVarFloat + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment double : wrong result : ", tmpxVar, floatValue, 0);
		value = eval(xVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpxVar, floatValue, 0);

		float tmpyVar = yVarFloatValue;
		tmpyVar %= xDoubleValue;
		value = eval(yVarFloat + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);

		tmpyVar %= yDoubleValue;
		value = eval(yVarFloat + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainderAssignment double : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainderAssignment double : wrong result : ", tmpyVar, floatValue, 0);
		value = eval(yVarFloat);
		typeName = value.getReferenceTypeName();
		assertEquals("float local variable value : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float local variable value : wrong result : ", tmpyVar, floatValue, 0);
		} finally {
		end();
		}
	}


}
