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

public class CharAssignmentOperatorsTests extends Tests {

	public CharAssignmentOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests",37,1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// char += {byte, char, short, int, long, float, double}

	public void testCharPlusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xByteValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yByteValue;
		value = eval(xVarChar + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xByteValue;
		value = eval(yVarChar + plusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yByteValue;
		value = eval(yVarChar + plusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharPlusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xCharValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yCharValue;
		value = eval(xVarChar + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xCharValue;
		value = eval(yVarChar + plusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yCharValue;
		value = eval(yVarChar + plusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharPlusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xShortValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yShortValue;
		value = eval(xVarChar + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xShortValue;
		value = eval(yVarChar + plusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yShortValue;
		value = eval(yVarChar + plusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharPlusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xIntValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yIntValue;
		value = eval(xVarChar + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xIntValue;
		value = eval(yVarChar + plusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yIntValue;
		value = eval(yVarChar + plusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharPlusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xLongValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yLongValue;
		value = eval(xVarChar + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xLongValue;
		value = eval(yVarChar + plusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yLongValue;
		value = eval(yVarChar + plusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharPlusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xFloatValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment float : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yFloatValue;
		value = eval(xVarChar + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xFloatValue;
		value = eval(yVarChar + plusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yFloatValue;
		value = eval(yVarChar + plusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharPlusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar += xDoubleValue;
		IValue value = eval(xVarChar + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment double : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar += yDoubleValue;
		value = eval(xVarChar + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar += xDoubleValue;
		value = eval(yVarChar + plusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar += yDoubleValue;
		value = eval(yVarChar + plusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char plusAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char plusAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char -= {byte, char, short, int, long, float, double}

	public void testCharMinusAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xByteValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yByteValue;
		value = eval(xVarChar + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xByteValue;
		value = eval(yVarChar + minusAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yByteValue;
		value = eval(yVarChar + minusAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMinusAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xCharValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yCharValue;
		value = eval(xVarChar + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xCharValue;
		value = eval(yVarChar + minusAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yCharValue;
		value = eval(yVarChar + minusAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMinusAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xShortValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yShortValue;
		value = eval(xVarChar + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xShortValue;
		value = eval(yVarChar + minusAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yShortValue;
		value = eval(yVarChar + minusAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMinusAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xIntValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yIntValue;
		value = eval(xVarChar + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xIntValue;
		value = eval(yVarChar + minusAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yIntValue;
		value = eval(yVarChar + minusAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMinusAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xLongValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yLongValue;
		value = eval(xVarChar + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xLongValue;
		value = eval(yVarChar + minusAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yLongValue;
		value = eval(yVarChar + minusAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMinusAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xFloatValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment float : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yFloatValue;
		value = eval(xVarChar + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xFloatValue;
		value = eval(yVarChar + minusAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yFloatValue;
		value = eval(yVarChar + minusAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMinusAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar -= xDoubleValue;
		IValue value = eval(xVarChar + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment double : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar -= yDoubleValue;
		value = eval(xVarChar + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar -= xDoubleValue;
		value = eval(yVarChar + minusAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar -= yDoubleValue;
		value = eval(yVarChar + minusAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char minusAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char minusAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char *= {byte, char, short, int, long, float, double}

	public void testCharMultiplyAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xByteValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yByteValue;
		value = eval(xVarChar + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xByteValue;
		value = eval(yVarChar + multiplyAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yByteValue;
		value = eval(yVarChar + multiplyAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMultiplyAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xCharValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yCharValue;
		value = eval(xVarChar + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xCharValue;
		value = eval(yVarChar + multiplyAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yCharValue;
		value = eval(yVarChar + multiplyAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMultiplyAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xShortValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yShortValue;
		value = eval(xVarChar + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xShortValue;
		value = eval(yVarChar + multiplyAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yShortValue;
		value = eval(yVarChar + multiplyAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMultiplyAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xIntValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yIntValue;
		value = eval(xVarChar + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xIntValue;
		value = eval(yVarChar + multiplyAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yIntValue;
		value = eval(yVarChar + multiplyAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMultiplyAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xLongValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yLongValue;
		value = eval(xVarChar + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xLongValue;
		value = eval(yVarChar + multiplyAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yLongValue;
		value = eval(yVarChar + multiplyAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMultiplyAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xFloatValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment float : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yFloatValue;
		value = eval(xVarChar + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xFloatValue;
		value = eval(yVarChar + multiplyAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yFloatValue;
		value = eval(yVarChar + multiplyAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharMultiplyAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar *= xDoubleValue;
		IValue value = eval(xVarChar + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment double : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar *= yDoubleValue;
		value = eval(xVarChar + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar *= xDoubleValue;
		value = eval(yVarChar + multiplyAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar *= yDoubleValue;
		value = eval(yVarChar + multiplyAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char multiplyAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char multiplyAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char /= {byte, char, short, int, long, float, double}

	public void testCharDivideAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xByteValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yByteValue;
		value = eval(xVarChar + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xByteValue;
		value = eval(yVarChar + divideAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yByteValue;
		value = eval(yVarChar + divideAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharDivideAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xCharValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yCharValue;
		value = eval(xVarChar + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xCharValue;
		value = eval(yVarChar + divideAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yCharValue;
		value = eval(yVarChar + divideAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharDivideAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xShortValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yShortValue;
		value = eval(xVarChar + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xShortValue;
		value = eval(yVarChar + divideAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yShortValue;
		value = eval(yVarChar + divideAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharDivideAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xIntValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yIntValue;
		value = eval(xVarChar + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xIntValue;
		value = eval(yVarChar + divideAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yIntValue;
		value = eval(yVarChar + divideAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharDivideAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xLongValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yLongValue;
		value = eval(xVarChar + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xLongValue;
		value = eval(yVarChar + divideAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yLongValue;
		value = eval(yVarChar + divideAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharDivideAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xFloatValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment float : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yFloatValue;
		value = eval(xVarChar + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xFloatValue;
		value = eval(yVarChar + divideAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yFloatValue;
		value = eval(yVarChar + divideAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharDivideAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar /= xDoubleValue;
		IValue value = eval(xVarChar + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment double : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar /= yDoubleValue;
		value = eval(xVarChar + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar /= xDoubleValue;
		value = eval(yVarChar + divideAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar /= yDoubleValue;
		value = eval(yVarChar + divideAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char divideAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char divideAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char %= {byte, char, short, int, long, float, double}

	public void testCharRemainderAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xByteValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yByteValue;
		value = eval(xVarChar + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xByteValue;
		value = eval(yVarChar + remainderAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yByteValue;
		value = eval(yVarChar + remainderAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRemainderAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xCharValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yCharValue;
		value = eval(xVarChar + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xCharValue;
		value = eval(yVarChar + remainderAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yCharValue;
		value = eval(yVarChar + remainderAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRemainderAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xShortValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yShortValue;
		value = eval(xVarChar + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xShortValue;
		value = eval(yVarChar + remainderAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yShortValue;
		value = eval(yVarChar + remainderAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRemainderAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xIntValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yIntValue;
		value = eval(xVarChar + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xIntValue;
		value = eval(yVarChar + remainderAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yIntValue;
		value = eval(yVarChar + remainderAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRemainderAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xLongValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yLongValue;
		value = eval(xVarChar + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xLongValue;
		value = eval(yVarChar + remainderAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yLongValue;
		value = eval(yVarChar + remainderAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRemainderAssignmentFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xFloatValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment float : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yFloatValue;
		value = eval(xVarChar + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment float : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xFloatValue;
		value = eval(yVarChar + remainderAssignmentOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yFloatValue;
		value = eval(yVarChar + remainderAssignmentOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment float : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment float : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRemainderAssignmentDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar %= xDoubleValue;
		IValue value = eval(xVarChar + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment double : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar %= yDoubleValue;
		value = eval(xVarChar + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment double : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar %= xDoubleValue;
		value = eval(yVarChar + remainderAssignmentOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar %= yDoubleValue;
		value = eval(yVarChar + remainderAssignmentOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char remainderAssignment double : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char remainderAssignment double : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char <<= {byte, char, short, int, long, float, double}

	public void testCharLeftShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar <<= xByteValue;
		IValue value = eval(xVarChar + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar <<= yByteValue;
		value = eval(xVarChar + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar <<= xByteValue;
		value = eval(yVarChar + leftShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar <<= yByteValue;
		value = eval(yVarChar + leftShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharLeftShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar <<= xCharValue;
		IValue value = eval(xVarChar + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar <<= yCharValue;
		value = eval(xVarChar + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar <<= xCharValue;
		value = eval(yVarChar + leftShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar <<= yCharValue;
		value = eval(yVarChar + leftShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharLeftShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar <<= xShortValue;
		IValue value = eval(xVarChar + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar <<= yShortValue;
		value = eval(xVarChar + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar <<= xShortValue;
		value = eval(yVarChar + leftShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar <<= yShortValue;
		value = eval(yVarChar + leftShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharLeftShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar <<= xIntValue;
		IValue value = eval(xVarChar + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar <<= yIntValue;
		value = eval(xVarChar + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar <<= xIntValue;
		value = eval(yVarChar + leftShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar <<= yIntValue;
		value = eval(yVarChar + leftShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharLeftShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar <<= xLongValue;
		IValue value = eval(xVarChar + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar <<= yLongValue;
		value = eval(xVarChar + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar <<= xLongValue;
		value = eval(yVarChar + leftShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar <<= yLongValue;
		value = eval(yVarChar + leftShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char leftShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char leftShiftAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char >>= {byte, char, short, int, long, float, double}

	public void testCharRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>= xByteValue;
		IValue value = eval(xVarChar + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>= yByteValue;
		value = eval(xVarChar + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>= xByteValue;
		value = eval(yVarChar + rightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>= yByteValue;
		value = eval(yVarChar + rightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>= xCharValue;
		IValue value = eval(xVarChar + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>= yCharValue;
		value = eval(xVarChar + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>= xCharValue;
		value = eval(yVarChar + rightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>= yCharValue;
		value = eval(yVarChar + rightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>= xShortValue;
		IValue value = eval(xVarChar + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>= yShortValue;
		value = eval(xVarChar + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>= xShortValue;
		value = eval(yVarChar + rightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>= yShortValue;
		value = eval(yVarChar + rightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>= xIntValue;
		IValue value = eval(xVarChar + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>= yIntValue;
		value = eval(xVarChar + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>= xIntValue;
		value = eval(yVarChar + rightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>= yIntValue;
		value = eval(yVarChar + rightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>= xLongValue;
		IValue value = eval(xVarChar + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>= yLongValue;
		value = eval(xVarChar + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>= xLongValue;
		value = eval(yVarChar + rightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>= yLongValue;
		value = eval(yVarChar + rightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char rightShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char rightShiftAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char >>>= {byte, char, short, int, long, float, double}

	public void testCharUnsignedRightShiftAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>>= xByteValue;
		IValue value = eval(xVarChar + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>>= yByteValue;
		value = eval(xVarChar + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>>= xByteValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>>= yByteValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharUnsignedRightShiftAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>>= xCharValue;
		IValue value = eval(xVarChar + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>>= yCharValue;
		value = eval(xVarChar + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>>= xCharValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>>= yCharValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharUnsignedRightShiftAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>>= xShortValue;
		IValue value = eval(xVarChar + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>>= yShortValue;
		value = eval(xVarChar + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>>= xShortValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>>= yShortValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharUnsignedRightShiftAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>>= xIntValue;
		IValue value = eval(xVarChar + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>>= yIntValue;
		value = eval(xVarChar + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>>= xIntValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>>= yIntValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharUnsignedRightShiftAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar >>>= xLongValue;
		IValue value = eval(xVarChar + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar >>>= yLongValue;
		value = eval(xVarChar + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar >>>= xLongValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar >>>= yLongValue;
		value = eval(yVarChar + unsignedRightShiftAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char unsignedRightShiftAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char unsignedRightShiftAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char |= {byte, char, short, int, long, float, double}

	public void testCharOrAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar |= xByteValue;
		IValue value = eval(xVarChar + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar |= yByteValue;
		value = eval(xVarChar + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar |= xByteValue;
		value = eval(yVarChar + orAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar |= yByteValue;
		value = eval(yVarChar + orAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharOrAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar |= xCharValue;
		IValue value = eval(xVarChar + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar |= yCharValue;
		value = eval(xVarChar + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar |= xCharValue;
		value = eval(yVarChar + orAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar |= yCharValue;
		value = eval(yVarChar + orAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharOrAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar |= xShortValue;
		IValue value = eval(xVarChar + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar |= yShortValue;
		value = eval(xVarChar + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar |= xShortValue;
		value = eval(yVarChar + orAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar |= yShortValue;
		value = eval(yVarChar + orAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharOrAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar |= xIntValue;
		IValue value = eval(xVarChar + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar |= yIntValue;
		value = eval(xVarChar + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar |= xIntValue;
		value = eval(yVarChar + orAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar |= yIntValue;
		value = eval(yVarChar + orAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharOrAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar |= xLongValue;
		IValue value = eval(xVarChar + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar |= yLongValue;
		value = eval(xVarChar + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar |= xLongValue;
		value = eval(yVarChar + orAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar |= yLongValue;
		value = eval(yVarChar + orAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char orAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char orAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char &= {byte, char, short, int, long, float, double}

	public void testCharAndAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar &= xByteValue;
		IValue value = eval(xVarChar + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar &= yByteValue;
		value = eval(xVarChar + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar &= xByteValue;
		value = eval(yVarChar + andAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar &= yByteValue;
		value = eval(yVarChar + andAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharAndAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar &= xCharValue;
		IValue value = eval(xVarChar + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar &= yCharValue;
		value = eval(xVarChar + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar &= xCharValue;
		value = eval(yVarChar + andAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar &= yCharValue;
		value = eval(yVarChar + andAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharAndAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar &= xShortValue;
		IValue value = eval(xVarChar + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar &= yShortValue;
		value = eval(xVarChar + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar &= xShortValue;
		value = eval(yVarChar + andAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar &= yShortValue;
		value = eval(yVarChar + andAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharAndAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar &= xIntValue;
		IValue value = eval(xVarChar + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar &= yIntValue;
		value = eval(xVarChar + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar &= xIntValue;
		value = eval(yVarChar + andAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar &= yIntValue;
		value = eval(yVarChar + andAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharAndAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar &= xLongValue;
		IValue value = eval(xVarChar + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar &= yLongValue;
		value = eval(xVarChar + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar &= xLongValue;
		value = eval(yVarChar + andAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar &= yLongValue;
		value = eval(yVarChar + andAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char andAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char andAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	// char ^= {byte, char, short, int, long, float, double}

	public void testCharXorAssignmentByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar ^= xByteValue;
		IValue value = eval(xVarChar + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment byte : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar ^= yByteValue;
		value = eval(xVarChar + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment byte : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar ^= xByteValue;
		value = eval(yVarChar + xorAssignmentOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar ^= yByteValue;
		value = eval(yVarChar + xorAssignmentOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment byte : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment byte : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharXorAssignmentChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar ^= xCharValue;
		IValue value = eval(xVarChar + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment char : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar ^= yCharValue;
		value = eval(xVarChar + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment char : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar ^= xCharValue;
		value = eval(yVarChar + xorAssignmentOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar ^= yCharValue;
		value = eval(yVarChar + xorAssignmentOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment char : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment char : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharXorAssignmentShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar ^= xShortValue;
		IValue value = eval(xVarChar + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment short : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar ^= yShortValue;
		value = eval(xVarChar + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment short : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar ^= xShortValue;
		value = eval(yVarChar + xorAssignmentOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar ^= yShortValue;
		value = eval(yVarChar + xorAssignmentOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment short : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment short : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharXorAssignmentInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar ^= xIntValue;
		IValue value = eval(xVarChar + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment int : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar ^= yIntValue;
		value = eval(xVarChar + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment int : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar ^= xIntValue;
		value = eval(yVarChar + xorAssignmentOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar ^= yIntValue;
		value = eval(yVarChar + xorAssignmentOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment int : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment int : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}

	public void testCharXorAssignmentLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		char tmpxVar = xVarCharValue;
		tmpxVar ^= xLongValue;
		IValue value = eval(xVarChar + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment long : wrong type : ", "char", typeName);
		char charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		tmpxVar ^= yLongValue;
		value = eval(xVarChar + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment long : wrong result : ", tmpxVar, charValue);
		value = eval(xVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpxVar, charValue);

		char tmpyVar = yVarCharValue;
		tmpyVar ^= xLongValue;
		value = eval(yVarChar + xorAssignmentOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);

		tmpyVar ^= yLongValue;
		value = eval(yVarChar + xorAssignmentOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("char xorAssignment long : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char xorAssignment long : wrong result : ", tmpyVar, charValue);
		value = eval(yVarChar);
		typeName = value.getReferenceTypeName();
		assertEquals("char local variable value : wrong type : ", "char", typeName);
		charValue = ((IJavaPrimitiveValue)value).getCharValue();
		assertEquals("char local variable value : wrong result : ", tmpyVar, charValue);
		} finally {
		end();
		}
	}


}
