/*******************************************************************************
 *  Copyright (c) 2002, 2008 IBM Corporation and others.
 *
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.debug.tests.eval;

import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.debug.core.IJavaPrimitiveValue;
import org.eclipse.jdt.internal.debug.core.model.JDIObjectValue;

public class FloatOperatorsTests extends Tests {

	public FloatOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests", 18, 1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// float + {byte, char, short, int, long, float, double}

	public void testFloatPlusByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus byte : wrong result : ", xFloatValue + yByteValue, floatValue, 0);

		value = eval(yFloat + plusOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus byte : wrong result : ", yFloatValue + xByteValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus char : wrong result : ", xFloatValue + yCharValue, floatValue, 0);

		value = eval(yFloat + plusOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus char : wrong result : ", yFloatValue + xCharValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus short : wrong result : ", xFloatValue + yShortValue, floatValue, 0);

		value = eval(yFloat + plusOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus short : wrong result : ", yFloatValue + xShortValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus int : wrong result : ", xFloatValue + yIntValue, floatValue, 0);

		value = eval(yFloat + plusOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus int : wrong result : ", yFloatValue + xIntValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus long : wrong result : ", xFloatValue + yLongValue, floatValue, 0);

		value = eval(yFloat + plusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus long : wrong result : ", yFloatValue + xLongValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus float : wrong result : ", xFloatValue + yFloatValue, floatValue, 0);

		value = eval(yFloat + plusOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float plus float : wrong result : ", yFloatValue + xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float plus double : wrong result : ", xFloatValue + yDoubleValue, doubleValue, 0);

		value = eval(yFloat + plusOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float plus double : wrong result : ", yFloatValue + xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatPlusString() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + plusOp + yString); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float plus java.lang.String : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("float plus java.lang.String : wrong result : ", xFloatValue + yStringValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yFloat + plusOp + xString); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float plus java.lang.String : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("float plus java.lang.String : wrong result : ", yFloatValue + xStringValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	// float - {byte, char, short, int, long, float, double}

	public void testFloatMinusByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus byte : wrong result : ", xFloatValue - yByteValue, floatValue, 0);

		value = eval(yFloat + minusOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus byte : wrong result : ", yFloatValue - xByteValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus char : wrong result : ", xFloatValue - yCharValue, floatValue, 0);

		value = eval(yFloat + minusOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus char : wrong result : ", yFloatValue - xCharValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus short : wrong result : ", xFloatValue - yShortValue, floatValue, 0);

		value = eval(yFloat + minusOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus short : wrong result : ", yFloatValue - xShortValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus int : wrong result : ", xFloatValue - yIntValue, floatValue, 0);

		value = eval(yFloat + minusOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus int : wrong result : ", yFloatValue - xIntValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus long : wrong result : ", xFloatValue - yLongValue, floatValue, 0);

		value = eval(yFloat + minusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus long : wrong result : ", yFloatValue - xLongValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus float : wrong result : ", xFloatValue - yFloatValue, floatValue, 0);

		value = eval(yFloat + minusOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float minus float : wrong result : ", yFloatValue - xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMinusDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + minusOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float minus double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float minus double : wrong result : ", xFloatValue - yDoubleValue, doubleValue, 0);

		value = eval(yFloat + minusOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float minus double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float minus double : wrong result : ", yFloatValue - xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// float * {byte, char, short, int, long, float, double}

	public void testFloatMultiplyByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply byte : wrong result : ", xFloatValue * yByteValue, floatValue, 0);

		value = eval(yFloat + multiplyOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply byte : wrong result : ", yFloatValue * xByteValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply char : wrong result : ", xFloatValue * yCharValue, floatValue, 0);

		value = eval(yFloat + multiplyOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply char : wrong result : ", yFloatValue * xCharValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply short : wrong result : ", xFloatValue * yShortValue, floatValue, 0);

		value = eval(yFloat + multiplyOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply short : wrong result : ", yFloatValue * xShortValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply int : wrong result : ", xFloatValue * yIntValue, floatValue, 0);

		value = eval(yFloat + multiplyOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply int : wrong result : ", yFloatValue * xIntValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply long : wrong result : ", xFloatValue * yLongValue, floatValue, 0);

		value = eval(yFloat + multiplyOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply long : wrong result : ", yFloatValue * xLongValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply float : wrong result : ", xFloatValue * yFloatValue, floatValue, 0);

		value = eval(yFloat + multiplyOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float multiply float : wrong result : ", yFloatValue * xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatMultiplyDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + multiplyOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float multiply double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float multiply double : wrong result : ", xFloatValue * yDoubleValue, doubleValue, 0);

		value = eval(yFloat + multiplyOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float multiply double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float multiply double : wrong result : ", yFloatValue * xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// float / {byte, char, short, int, long, float, double}

	public void testFloatDivideByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide byte : wrong result : ", xFloatValue / yByteValue, floatValue, 0);

		value = eval(yFloat + divideOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide byte : wrong result : ", yFloatValue / xByteValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide char : wrong result : ", xFloatValue / yCharValue, floatValue, 0);

		value = eval(yFloat + divideOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide char : wrong result : ", yFloatValue / xCharValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide short : wrong result : ", xFloatValue / yShortValue, floatValue, 0);

		value = eval(yFloat + divideOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide short : wrong result : ", yFloatValue / xShortValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide int : wrong result : ", xFloatValue / yIntValue, floatValue, 0);

		value = eval(yFloat + divideOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide int : wrong result : ", yFloatValue / xIntValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide long : wrong result : ", xFloatValue / yLongValue, floatValue, 0);

		value = eval(yFloat + divideOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide long : wrong result : ", yFloatValue / xLongValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide float : wrong result : ", xFloatValue / yFloatValue, floatValue, 0);

		value = eval(yFloat + divideOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float divide float : wrong result : ", yFloatValue / xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatDivideDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + divideOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float divide double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float divide double : wrong result : ", xFloatValue / yDoubleValue, doubleValue, 0);

		value = eval(yFloat + divideOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float divide double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float divide double : wrong result : ", yFloatValue / xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// float % {byte, char, short, int, long, float, double}

	public void testFloatRemainderByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder byte : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder byte : wrong result : ", xFloatValue % yByteValue, floatValue, 0);

		value = eval(yFloat + remainderOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder byte : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder byte : wrong result : ", yFloatValue % xByteValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder char : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder char : wrong result : ", xFloatValue % yCharValue, floatValue, 0);

		value = eval(yFloat + remainderOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder char : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder char : wrong result : ", yFloatValue % xCharValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder short : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder short : wrong result : ", xFloatValue % yShortValue, floatValue, 0);

		value = eval(yFloat + remainderOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder short : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder short : wrong result : ", yFloatValue % xShortValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder int : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder int : wrong result : ", xFloatValue % yIntValue, floatValue, 0);

		value = eval(yFloat + remainderOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder int : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder int : wrong result : ", yFloatValue % xIntValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder long : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder long : wrong result : ", xFloatValue % yLongValue, floatValue, 0);

		value = eval(yFloat + remainderOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder long : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder long : wrong result : ", yFloatValue % xLongValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder float : wrong result : ", xFloatValue % yFloatValue, floatValue, 0);

		value = eval(yFloat + remainderOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("float remainder float : wrong result : ", yFloatValue % xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testFloatRemainderDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + remainderOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float remainder double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float remainder double : wrong result : ", xFloatValue % yDoubleValue, doubleValue, 0);

		value = eval(yFloat + remainderOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float remainder double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("float remainder double : wrong result : ", yFloatValue % xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// float > {byte, char, short, int, long, float, double}

	public void testFloatGreaterByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater byte : wrong result : ", xFloatValue > yByteValue, booleanValue);

		value = eval(yFloat + greaterOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater byte : wrong result : ", yFloatValue > xByteValue, booleanValue);

		value = eval(xFloat + greaterOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater byte : wrong result : ", xFloatValue > xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater char : wrong result : ", xFloatValue > yCharValue, booleanValue);

		value = eval(yFloat + greaterOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater char : wrong result : ", yFloatValue > xCharValue, booleanValue);

		value = eval(xFloat + greaterOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater char : wrong result : ", xFloatValue > xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater short : wrong result : ", xFloatValue > yShortValue, booleanValue);

		value = eval(yFloat + greaterOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater short : wrong result : ", yFloatValue > xShortValue, booleanValue);

		value = eval(xFloat + greaterOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater short : wrong result : ", xFloatValue > xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater int : wrong result : ", xFloatValue > yIntValue, booleanValue);

		value = eval(yFloat + greaterOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater int : wrong result : ", yFloatValue > xIntValue, booleanValue);

		value = eval(xFloat + greaterOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater int : wrong result : ", xFloatValue > xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater long : wrong result : ", xFloatValue > yLongValue, booleanValue);

		value = eval(yFloat + greaterOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater long : wrong result : ", yFloatValue > xLongValue, booleanValue);

		value = eval(xFloat + greaterOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater long : wrong result : ", xFloatValue > xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater float : wrong result : ", xFloatValue > yFloatValue, booleanValue);

		value = eval(yFloat + greaterOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater float : wrong result : ", yFloatValue > xFloatValue, booleanValue);

		value = eval(xFloat + greaterOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater float : wrong result : ", xFloatValue > xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greater double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater double : wrong result : ", xFloatValue > yDoubleValue, booleanValue);

		value = eval(yFloat + greaterOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater double : wrong result : ", yFloatValue > xDoubleValue, booleanValue);

		value = eval(xFloat + greaterOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greater double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greater double : wrong result : ", xFloatValue > xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// float >= {byte, char, short, int, long, float, double}

	public void testFloatGreaterEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual byte : wrong result : ", xFloatValue >= yByteValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual byte : wrong result : ", yFloatValue >= xByteValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual byte : wrong result : ", xFloatValue >= xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual char : wrong result : ", xFloatValue >= yCharValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual char : wrong result : ", yFloatValue >= xCharValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual char : wrong result : ", xFloatValue >= xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual short : wrong result : ", xFloatValue >= yShortValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual short : wrong result : ", yFloatValue >= xShortValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual short : wrong result : ", xFloatValue >= xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual int : wrong result : ", xFloatValue >= yIntValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual int : wrong result : ", yFloatValue >= xIntValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual int : wrong result : ", xFloatValue >= xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual long : wrong result : ", xFloatValue >= yLongValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual long : wrong result : ", yFloatValue >= xLongValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual long : wrong result : ", xFloatValue >= xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual float : wrong result : ", xFloatValue >= yFloatValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual float : wrong result : ", yFloatValue >= xFloatValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual float : wrong result : ", xFloatValue >= xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatGreaterEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + greaterEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual double : wrong result : ", xFloatValue >= yDoubleValue, booleanValue);

		value = eval(yFloat + greaterEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual double : wrong result : ", yFloatValue >= xDoubleValue, booleanValue);

		value = eval(xFloat + greaterEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float greaterEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float greaterEqual double : wrong result : ", xFloatValue >= xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// float < {byte, char, short, int, long, float, double}

	public void testFloatLessByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less byte : wrong result : ", xFloatValue < yByteValue, booleanValue);

		value = eval(yFloat + lessOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less byte : wrong result : ", yFloatValue < xByteValue, booleanValue);

		value = eval(xFloat + lessOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less byte : wrong result : ", xFloatValue < xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less char : wrong result : ", xFloatValue < yCharValue, booleanValue);

		value = eval(yFloat + lessOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less char : wrong result : ", yFloatValue < xCharValue, booleanValue);

		value = eval(xFloat + lessOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less char : wrong result : ", xFloatValue < xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less short : wrong result : ", xFloatValue < yShortValue, booleanValue);

		value = eval(yFloat + lessOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less short : wrong result : ", yFloatValue < xShortValue, booleanValue);

		value = eval(xFloat + lessOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less short : wrong result : ", xFloatValue < xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less int : wrong result : ", xFloatValue < yIntValue, booleanValue);

		value = eval(yFloat + lessOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less int : wrong result : ", yFloatValue < xIntValue, booleanValue);

		value = eval(xFloat + lessOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less int : wrong result : ", xFloatValue < xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less long : wrong result : ", xFloatValue < yLongValue, booleanValue);

		value = eval(yFloat + lessOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less long : wrong result : ", yFloatValue < xLongValue, booleanValue);

		value = eval(xFloat + lessOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less long : wrong result : ", xFloatValue < xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less float : wrong result : ", xFloatValue < yFloatValue, booleanValue);

		value = eval(yFloat + lessOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less float : wrong result : ", yFloatValue < xFloatValue, booleanValue);

		value = eval(xFloat + lessOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less float : wrong result : ", xFloatValue < xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float less double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less double : wrong result : ", xFloatValue < yDoubleValue, booleanValue);

		value = eval(yFloat + lessOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less double : wrong result : ", yFloatValue < xDoubleValue, booleanValue);

		value = eval(xFloat + lessOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float less double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float less double : wrong result : ", xFloatValue < xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// float <= {byte, char, short, int, long, float, double}

	public void testFloatLessEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual byte : wrong result : ", xFloatValue <= yByteValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual byte : wrong result : ", yFloatValue <= xByteValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual byte : wrong result : ", xFloatValue <= xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual char : wrong result : ", xFloatValue <= yCharValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual char : wrong result : ", yFloatValue <= xCharValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual char : wrong result : ", xFloatValue <= xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual short : wrong result : ", xFloatValue <= yShortValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual short : wrong result : ", yFloatValue <= xShortValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual short : wrong result : ", xFloatValue <= xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual int : wrong result : ", xFloatValue <= yIntValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual int : wrong result : ", yFloatValue <= xIntValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual int : wrong result : ", xFloatValue <= xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual long : wrong result : ", xFloatValue <= yLongValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual long : wrong result : ", yFloatValue <= xLongValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual long : wrong result : ", xFloatValue <= xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual float : wrong result : ", xFloatValue <= yFloatValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual float : wrong result : ", yFloatValue <= xFloatValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual float : wrong result : ", xFloatValue <= xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatLessEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + lessEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual double : wrong result : ", xFloatValue <= yDoubleValue, booleanValue);

		value = eval(yFloat + lessEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual double : wrong result : ", yFloatValue <= xDoubleValue, booleanValue);

		value = eval(xFloat + lessEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float lessEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float lessEqual double : wrong result : ", xFloatValue <= xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// float == {byte, char, short, int, long, float, double}

	public void testFloatEqualEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual byte : wrong result : ", xFloatValue == yByteValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual byte : wrong result : ", yFloatValue == xByteValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual byte : wrong result : ", xFloatValue == xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatEqualEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual char : wrong result : ", xFloatValue == yCharValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual char : wrong result : ", yFloatValue == xCharValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual char : wrong result : ", xFloatValue == xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatEqualEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual short : wrong result : ", xFloatValue == yShortValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual short : wrong result : ", yFloatValue == xShortValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual short : wrong result : ", xFloatValue == xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatEqualEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual int : wrong result : ", xFloatValue == yIntValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual int : wrong result : ", yFloatValue == xIntValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual int : wrong result : ", xFloatValue == xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatEqualEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual long : wrong result : ", xFloatValue == yLongValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual long : wrong result : ", yFloatValue == xLongValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual long : wrong result : ", xFloatValue == xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatEqualEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual float : wrong result : ", xFloatValue == yFloatValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual float : wrong result : ", yFloatValue == xFloatValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual float : wrong result : ", true, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatEqualEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + equalEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual double : wrong result : ", xFloatValue == yDoubleValue, booleanValue);

		value = eval(yFloat + equalEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual double : wrong result : ", yFloatValue == xDoubleValue, booleanValue);

		value = eval(xFloat + equalEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float equalEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float equalEqual double : wrong result : ", xFloatValue == xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// float != {byte, char, short, int, long, float, double}

	public void testFloatNotEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual byte : wrong result : ", xFloatValue != yByteValue, booleanValue);

		value = eval(yFloat + notEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual byte : wrong result : ", yFloatValue != xByteValue, booleanValue);

		value = eval(xFloat + notEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual byte : wrong result : ", xFloatValue != xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatNotEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual char : wrong result : ", xFloatValue != yCharValue, booleanValue);

		value = eval(yFloat + notEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual char : wrong result : ", yFloatValue != xCharValue, booleanValue);

		value = eval(xFloat + notEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual char : wrong result : ", xFloatValue != xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatNotEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual short : wrong result : ", xFloatValue != yShortValue, booleanValue);

		value = eval(yFloat + notEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual short : wrong result : ", yFloatValue != xShortValue, booleanValue);

		value = eval(xFloat + notEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual short : wrong result : ", xFloatValue != xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatNotEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual int : wrong result : ", xFloatValue != yIntValue, booleanValue);

		value = eval(yFloat + notEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual int : wrong result : ", yFloatValue != xIntValue, booleanValue);

		value = eval(xFloat + notEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual int : wrong result : ", xFloatValue != xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatNotEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual long : wrong result : ", xFloatValue != yLongValue, booleanValue);

		value = eval(yFloat + notEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual long : wrong result : ", yFloatValue != xLongValue, booleanValue);

		value = eval(xFloat + notEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual long : wrong result : ", xFloatValue != xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatNotEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual float : wrong result : ", xFloatValue != yFloatValue, booleanValue);

		value = eval(yFloat + notEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual float : wrong result : ", yFloatValue != xFloatValue, booleanValue);

		value = eval(xFloat + notEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual float : wrong result : ", false, booleanValue);
		} finally {
		end();
		}
	}

	public void testFloatNotEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xFloat + notEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("float notEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual double : wrong result : ", xFloatValue != yDoubleValue, booleanValue);

		value = eval(yFloat + notEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual double : wrong result : ", yFloatValue != xDoubleValue, booleanValue);

		value = eval(xFloat + notEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("float notEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("float notEqual double : wrong result : ", xFloatValue != xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// + float

	public void testPlusFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(plusOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("plus float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("plus float : wrong result : ", + xFloatValue, floatValue, 0);

		value = eval(plusOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("plus float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("plus float : wrong result : ", + yFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	// - float

	public void testMinusFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(minusOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("minus float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("minus float : wrong result : ", - xFloatValue, floatValue, 0);

		value = eval(minusOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("minus float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("minus float : wrong result : ", - yFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}


}
