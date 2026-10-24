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

public class LongOperatorsTests extends Tests {

	public LongOperatorsTests(String arg) {
		super(arg);
	}

	protected void init() throws Exception {
		initializeFrame("EvalSimpleTests", 18, 1);
	}

	protected void end() throws Exception {
		destroyFrame();
	}

	// long + {byte, char, short, int, long, float, double}

	public void testLongPlusByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus byte : wrong result : ", xLongValue + yByteValue, longValue);

		value = eval(yLong + plusOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus byte : wrong result : ", yLongValue + xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus char : wrong result : ", xLongValue + yCharValue, longValue);

		value = eval(yLong + plusOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus char : wrong result : ", yLongValue + xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus short : wrong result : ", xLongValue + yShortValue, longValue);

		value = eval(yLong + plusOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus short : wrong result : ", yLongValue + xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus int : wrong result : ", xLongValue + yIntValue, longValue);

		value = eval(yLong + plusOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus int : wrong result : ", yLongValue + xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus long : wrong result : ", xLongValue + yLongValue, longValue);

		value = eval(yLong + plusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long plus long : wrong result : ", yLongValue + xLongValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongPlusFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long plus float : wrong result : ", xLongValue + yFloatValue, floatValue, 0);

		value = eval(yLong + plusOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long plus float : wrong result : ", yLongValue + xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testLongPlusDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long plus double : wrong result : ", xLongValue + yDoubleValue, doubleValue, 0);

		value = eval(yLong + plusOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long plus double : wrong result : ", yLongValue + xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	public void testLongPlusString() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + plusOp + yString); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long plus java.lang.String : wrong type : ", "java.lang.String", typeName);
		String stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("long plus java.lang.String : wrong result : ", xLongValue + yStringValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		value = eval(yLong + plusOp + xString); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long plus java.lang.String : wrong type : ", "java.lang.String", typeName);
		stringValue = ((JDIObjectValue)value).getValueString();
		assertEquals("long plus java.lang.String : wrong result : ", yLongValue + xStringValue, stringValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} finally {
		end();
		}
	}

	// long - {byte, char, short, int, long, float, double}

	public void testLongMinusByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus byte : wrong result : ", xLongValue - yByteValue, longValue);

		value = eval(yLong + minusOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus byte : wrong result : ", yLongValue - xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus char : wrong result : ", xLongValue - yCharValue, longValue);

		value = eval(yLong + minusOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus char : wrong result : ", yLongValue - xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus short : wrong result : ", xLongValue - yShortValue, longValue);

		value = eval(yLong + minusOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus short : wrong result : ", yLongValue - xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus int : wrong result : ", xLongValue - yIntValue, longValue);

		value = eval(yLong + minusOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus int : wrong result : ", yLongValue - xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus long : wrong result : ", xLongValue - yLongValue, longValue);

		value = eval(yLong + minusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long minus long : wrong result : ", yLongValue - xLongValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMinusFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long minus float : wrong result : ", xLongValue - yFloatValue, floatValue, 0);

		value = eval(yLong + minusOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long minus float : wrong result : ", yLongValue - xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testLongMinusDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + minusOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long minus double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long minus double : wrong result : ", xLongValue - yDoubleValue, doubleValue, 0);

		value = eval(yLong + minusOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long minus double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long minus double : wrong result : ", yLongValue - xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// long * {byte, char, short, int, long, float, double}

	public void testLongMultiplyByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply byte : wrong result : ", xLongValue * yByteValue, longValue);

		value = eval(yLong + multiplyOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply byte : wrong result : ", yLongValue * xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply char : wrong result : ", xLongValue * yCharValue, longValue);

		value = eval(yLong + multiplyOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply char : wrong result : ", yLongValue * xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply short : wrong result : ", xLongValue * yShortValue, longValue);

		value = eval(yLong + multiplyOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply short : wrong result : ", yLongValue * xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply int : wrong result : ", xLongValue * yIntValue, longValue);

		value = eval(yLong + multiplyOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply int : wrong result : ", yLongValue * xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply long : wrong result : ", xLongValue * yLongValue, longValue);

		value = eval(yLong + multiplyOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long multiply long : wrong result : ", yLongValue * xLongValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongMultiplyFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long multiply float : wrong result : ", xLongValue * yFloatValue, floatValue, 0);

		value = eval(yLong + multiplyOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long multiply float : wrong result : ", yLongValue * xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testLongMultiplyDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + multiplyOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long multiply double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long multiply double : wrong result : ", xLongValue * yDoubleValue, doubleValue, 0);

		value = eval(yLong + multiplyOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long multiply double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long multiply double : wrong result : ", yLongValue * xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// long / {byte, char, short, int, long, float, double}

	public void testLongDivideByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide byte : wrong result : ", xLongValue / yByteValue, longValue);

		value = eval(yLong + divideOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide byte : wrong result : ", yLongValue / xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide char : wrong result : ", xLongValue / yCharValue, longValue);

		value = eval(yLong + divideOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide char : wrong result : ", yLongValue / xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide short : wrong result : ", xLongValue / yShortValue, longValue);

		value = eval(yLong + divideOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide short : wrong result : ", yLongValue / xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide int : wrong result : ", xLongValue / yIntValue, longValue);

		value = eval(yLong + divideOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide int : wrong result : ", yLongValue / xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide long : wrong result : ", xLongValue / yLongValue, longValue);

		value = eval(yLong + divideOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long divide long : wrong result : ", yLongValue / xLongValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongDivideFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long divide float : wrong result : ", xLongValue / yFloatValue, floatValue, 0);

		value = eval(yLong + divideOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long divide float : wrong result : ", yLongValue / xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testLongDivideDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + divideOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long divide double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long divide double : wrong result : ", xLongValue / yDoubleValue, doubleValue, 0);

		value = eval(yLong + divideOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long divide double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long divide double : wrong result : ", yLongValue / xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// long % {byte, char, short, int, long, float, double}

	public void testLongRemainderByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder byte : wrong result : ", xLongValue % yByteValue, longValue);

		value = eval(yLong + remainderOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder byte : wrong result : ", yLongValue % xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder char : wrong result : ", xLongValue % yCharValue, longValue);

		value = eval(yLong + remainderOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder char : wrong result : ", yLongValue % xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder short : wrong result : ", xLongValue % yShortValue, longValue);

		value = eval(yLong + remainderOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder short : wrong result : ", yLongValue % xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder int : wrong result : ", xLongValue % yIntValue, longValue);

		value = eval(yLong + remainderOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder int : wrong result : ", yLongValue % xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder long : wrong result : ", xLongValue % yLongValue, longValue);

		value = eval(yLong + remainderOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long remainder long : wrong result : ", yLongValue % xLongValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRemainderFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder float : wrong type : ", "float", typeName);
		float floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long remainder float : wrong result : ", xLongValue % yFloatValue, floatValue, 0);

		value = eval(yLong + remainderOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder float : wrong type : ", "float", typeName);
		floatValue = ((IJavaPrimitiveValue)value).getFloatValue();
		assertEquals("long remainder float : wrong result : ", yLongValue % xFloatValue, floatValue, 0);
		} finally {
		end();
		}
	}

	public void testLongRemainderDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + remainderOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long remainder double : wrong type : ", "double", typeName);
		double doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long remainder double : wrong result : ", xLongValue % yDoubleValue, doubleValue, 0);

		value = eval(yLong + remainderOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long remainder double : wrong type : ", "double", typeName);
		doubleValue = ((IJavaPrimitiveValue)value).getDoubleValue();
		assertEquals("long remainder double : wrong result : ", yLongValue % xDoubleValue, doubleValue, 0);
		} finally {
		end();
		}
	}

	// long > {byte, char, short, int, long, float, double}

	public void testLongGreaterByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater byte : wrong result : ", xLongValue > yByteValue, booleanValue);

		value = eval(yLong + greaterOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater byte : wrong result : ", yLongValue > xByteValue, booleanValue);

		value = eval(xLong + greaterOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater byte : wrong result : ", xLongValue > xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater char : wrong result : ", xLongValue > yCharValue, booleanValue);

		value = eval(yLong + greaterOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater char : wrong result : ", yLongValue > xCharValue, booleanValue);

		value = eval(xLong + greaterOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater char : wrong result : ", xLongValue > xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater short : wrong result : ", xLongValue > yShortValue, booleanValue);

		value = eval(yLong + greaterOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater short : wrong result : ", yLongValue > xShortValue, booleanValue);

		value = eval(xLong + greaterOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater short : wrong result : ", xLongValue > xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater int : wrong result : ", xLongValue > yIntValue, booleanValue);

		value = eval(yLong + greaterOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater int : wrong result : ", yLongValue > xIntValue, booleanValue);

		value = eval(xLong + greaterOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater int : wrong result : ", xLongValue > xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater long : wrong result : ", xLongValue > yLongValue, booleanValue);

		value = eval(yLong + greaterOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater long : wrong result : ", yLongValue > xLongValue, booleanValue);

		value = eval(xLong + greaterOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater long : wrong result : ", xLongValue > xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater float : wrong result : ", xLongValue > yFloatValue, booleanValue);

		value = eval(yLong + greaterOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater float : wrong result : ", yLongValue > xFloatValue, booleanValue);

		value = eval(xLong + greaterOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater float : wrong result : ", xLongValue > xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greater double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater double : wrong result : ", xLongValue > yDoubleValue, booleanValue);

		value = eval(yLong + greaterOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater double : wrong result : ", yLongValue > xDoubleValue, booleanValue);

		value = eval(xLong + greaterOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greater double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greater double : wrong result : ", xLongValue > xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// long >= {byte, char, short, int, long, float, double}

	public void testLongGreaterEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual byte : wrong result : ", xLongValue >= yByteValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual byte : wrong result : ", yLongValue >= xByteValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual byte : wrong result : ", xLongValue >= xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual char : wrong result : ", xLongValue >= yCharValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual char : wrong result : ", yLongValue >= xCharValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual char : wrong result : ", xLongValue >= xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual short : wrong result : ", xLongValue >= yShortValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual short : wrong result : ", yLongValue >= xShortValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual short : wrong result : ", xLongValue >= xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual int : wrong result : ", xLongValue >= yIntValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual int : wrong result : ", yLongValue >= xIntValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual int : wrong result : ", xLongValue >= xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual long : wrong result : ", xLongValue >= yLongValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual long : wrong result : ", yLongValue >= xLongValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual long : wrong result : ", xLongValue >= xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual float : wrong result : ", xLongValue >= yFloatValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual float : wrong result : ", yLongValue >= xFloatValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual float : wrong result : ", xLongValue >= xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongGreaterEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + greaterEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual double : wrong result : ", xLongValue >= yDoubleValue, booleanValue);

		value = eval(yLong + greaterEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual double : wrong result : ", yLongValue >= xDoubleValue, booleanValue);

		value = eval(xLong + greaterEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long greaterEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long greaterEqual double : wrong result : ", xLongValue >= xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// long < {byte, char, short, int, long, float, double}

	public void testLongLessByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less byte : wrong result : ", xLongValue < yByteValue, booleanValue);

		value = eval(yLong + lessOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less byte : wrong result : ", yLongValue < xByteValue, booleanValue);

		value = eval(xLong + lessOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less byte : wrong result : ", xLongValue < xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less char : wrong result : ", xLongValue < yCharValue, booleanValue);

		value = eval(yLong + lessOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less char : wrong result : ", yLongValue < xCharValue, booleanValue);

		value = eval(xLong + lessOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less char : wrong result : ", xLongValue < xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less short : wrong result : ", xLongValue < yShortValue, booleanValue);

		value = eval(yLong + lessOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less short : wrong result : ", yLongValue < xShortValue, booleanValue);

		value = eval(xLong + lessOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less short : wrong result : ", xLongValue < xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less int : wrong result : ", xLongValue < yIntValue, booleanValue);

		value = eval(yLong + lessOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less int : wrong result : ", yLongValue < xIntValue, booleanValue);

		value = eval(xLong + lessOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less int : wrong result : ", xLongValue < xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less long : wrong result : ", xLongValue < yLongValue, booleanValue);

		value = eval(yLong + lessOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less long : wrong result : ", yLongValue < xLongValue, booleanValue);

		value = eval(xLong + lessOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less long : wrong result : ", xLongValue < xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less float : wrong result : ", xLongValue < yFloatValue, booleanValue);

		value = eval(yLong + lessOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less float : wrong result : ", yLongValue < xFloatValue, booleanValue);

		value = eval(xLong + lessOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less float : wrong result : ", xLongValue < xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long less double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less double : wrong result : ", xLongValue < yDoubleValue, booleanValue);

		value = eval(yLong + lessOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less double : wrong result : ", yLongValue < xDoubleValue, booleanValue);

		value = eval(xLong + lessOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long less double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long less double : wrong result : ", xLongValue < xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// long <= {byte, char, short, int, long, float, double}

	public void testLongLessEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual byte : wrong result : ", xLongValue <= yByteValue, booleanValue);

		value = eval(yLong + lessEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual byte : wrong result : ", yLongValue <= xByteValue, booleanValue);

		value = eval(xLong + lessEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual byte : wrong result : ", xLongValue <= xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual char : wrong result : ", xLongValue <= yCharValue, booleanValue);

		value = eval(yLong + lessEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual char : wrong result : ", yLongValue <= xCharValue, booleanValue);

		value = eval(xLong + lessEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual char : wrong result : ", xLongValue <= xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual short : wrong result : ", xLongValue <= yShortValue, booleanValue);

		value = eval(yLong + lessEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual short : wrong result : ", yLongValue <= xShortValue, booleanValue);

		value = eval(xLong + lessEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual short : wrong result : ", xLongValue <= xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual int : wrong result : ", xLongValue <= yIntValue, booleanValue);

		value = eval(yLong + lessEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual int : wrong result : ", yLongValue <= xIntValue, booleanValue);

		value = eval(xLong + lessEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual int : wrong result : ", xLongValue <= xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual long : wrong result : ", xLongValue <= yLongValue, booleanValue);

		value = eval(yLong + lessEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual long : wrong result : ", yLongValue <= xLongValue, booleanValue);

		value = eval(xLong + lessEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual long : wrong result : ", xLongValue <= xLongValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual float : wrong result : ", xLongValue <= yFloatValue, booleanValue);

		value = eval(yLong + lessEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual float : wrong result : ", yLongValue <= xFloatValue, booleanValue);

		value = eval(xLong + lessEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual float : wrong result : ", xLongValue <= xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongLessEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + lessEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual double : wrong result : ", xLongValue <= yDoubleValue, booleanValue);

		value = eval(yLong + lessEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual double : wrong result : ", yLongValue <= xDoubleValue, booleanValue);

		value = eval(xLong + lessEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long lessEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long lessEqual double : wrong result : ", xLongValue <= xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// long == {byte, char, short, int, long, float, double}

	public void testLongEqualEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual byte : wrong result : ", xLongValue == yByteValue, booleanValue);

		value = eval(yLong + equalEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual byte : wrong result : ", yLongValue == xByteValue, booleanValue);

		value = eval(xLong + equalEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual byte : wrong result : ", xLongValue == xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongEqualEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual char : wrong result : ", xLongValue == yCharValue, booleanValue);

		value = eval(yLong + equalEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual char : wrong result : ", yLongValue == xCharValue, booleanValue);

		value = eval(xLong + equalEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual char : wrong result : ", xLongValue == xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongEqualEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual short : wrong result : ", xLongValue == yShortValue, booleanValue);

		value = eval(yLong + equalEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual short : wrong result : ", yLongValue == xShortValue, booleanValue);

		value = eval(xLong + equalEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual short : wrong result : ", xLongValue == xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongEqualEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual int : wrong result : ", xLongValue == yIntValue, booleanValue);

		value = eval(yLong + equalEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual int : wrong result : ", yLongValue == xIntValue, booleanValue);

		value = eval(xLong + equalEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual int : wrong result : ", xLongValue == xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongEqualEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual long : wrong result : ", xLongValue == yLongValue, booleanValue);

		value = eval(yLong + equalEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual long : wrong result : ", yLongValue == xLongValue, booleanValue);

		value = eval(xLong + equalEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual long : wrong result : ", true, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongEqualEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual float : wrong result : ", xLongValue == yFloatValue, booleanValue);

		value = eval(yLong + equalEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual float : wrong result : ", yLongValue == xFloatValue, booleanValue);

		value = eval(xLong + equalEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual float : wrong result : ", xLongValue == xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongEqualEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + equalEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual double : wrong result : ", xLongValue == yDoubleValue, booleanValue);

		value = eval(yLong + equalEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual double : wrong result : ", yLongValue == xDoubleValue, booleanValue);

		value = eval(xLong + equalEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long equalEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long equalEqual double : wrong result : ", xLongValue == xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// long != {byte, char, short, int, long, float, double}

	public void testLongNotEqualByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual byte : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual byte : wrong result : ", xLongValue != yByteValue, booleanValue);

		value = eval(yLong + notEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual byte : wrong result : ", yLongValue != xByteValue, booleanValue);

		value = eval(xLong + notEqualOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual byte : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual byte : wrong result : ", xLongValue != xByteValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongNotEqualChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual char : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual char : wrong result : ", xLongValue != yCharValue, booleanValue);

		value = eval(yLong + notEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual char : wrong result : ", yLongValue != xCharValue, booleanValue);

		value = eval(xLong + notEqualOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual char : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual char : wrong result : ", xLongValue != xCharValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongNotEqualShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual short : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual short : wrong result : ", xLongValue != yShortValue, booleanValue);

		value = eval(yLong + notEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual short : wrong result : ", yLongValue != xShortValue, booleanValue);

		value = eval(xLong + notEqualOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual short : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual short : wrong result : ", xLongValue != xShortValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongNotEqualInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual int : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual int : wrong result : ", xLongValue != yIntValue, booleanValue);

		value = eval(yLong + notEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual int : wrong result : ", yLongValue != xIntValue, booleanValue);

		value = eval(xLong + notEqualOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual int : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual int : wrong result : ", xLongValue != xIntValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongNotEqualLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual long : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual long : wrong result : ", xLongValue != yLongValue, booleanValue);

		value = eval(yLong + notEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual long : wrong result : ", yLongValue != xLongValue, booleanValue);

		value = eval(xLong + notEqualOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual long : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual long : wrong result : ", false, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongNotEqualFloat() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual float : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual float : wrong result : ", xLongValue != yFloatValue, booleanValue);

		value = eval(yLong + notEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual float : wrong result : ", yLongValue != xFloatValue, booleanValue);

		value = eval(xLong + notEqualOp + xFloat); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual float : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual float : wrong result : ", xLongValue != xFloatValue, booleanValue);
		} finally {
		end();
		}
	}

	public void testLongNotEqualDouble() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + notEqualOp + yDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long notEqual double : wrong type : ", "boolean", typeName);
		boolean booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual double : wrong result : ", xLongValue != yDoubleValue, booleanValue);

		value = eval(yLong + notEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual double : wrong result : ", yLongValue != xDoubleValue, booleanValue);

		value = eval(xLong + notEqualOp + xDouble); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long notEqual double : wrong type : ", "boolean", typeName);
		booleanValue = ((IJavaPrimitiveValue)value).getBooleanValue();
		assertEquals("long notEqual double : wrong result : ", xLongValue != xDoubleValue, booleanValue);
		} finally {
		end();
		}
	}

	// long << {byte, char, short, int, long}

	public void testLongLeftShiftByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + leftShiftOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShift byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift byte : wrong result : ", xLongValue << yByteValue, longValue);

		value = eval(yLong + leftShiftOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShift byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift byte : wrong result : ", yLongValue << xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + leftShiftOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShift char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift char : wrong result : ", xLongValue << yCharValue, longValue);

		value = eval(yLong + leftShiftOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShift char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift char : wrong result : ", yLongValue << xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + leftShiftOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShift short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift short : wrong result : ", xLongValue << yShortValue, longValue);

		value = eval(yLong + leftShiftOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShift short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift short : wrong result : ", yLongValue << xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + leftShiftOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShift int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift int : wrong result : ", xLongValue << yIntValue, longValue);

		value = eval(yLong + leftShiftOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShift int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift int : wrong result : ", yLongValue << xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongLeftShiftLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + leftShiftOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long leftShift long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift long : wrong result : ", xLongValue << yLongValue, longValue);

		value = eval(yLong + leftShiftOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long leftShift long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long leftShift long : wrong result : ", yLongValue << xLongValue, longValue);
		} finally {
		end();
		}
	}

	// long >> {byte, char, short, int, long}

	public void testLongRightShiftByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + rightShiftOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShift byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift byte : wrong result : ", xLongValue >> yByteValue, longValue);

		value = eval(yLong + rightShiftOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShift byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift byte : wrong result : ", yLongValue >> xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + rightShiftOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShift char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift char : wrong result : ", xLongValue >> yCharValue, longValue);

		value = eval(yLong + rightShiftOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShift char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift char : wrong result : ", yLongValue >> xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + rightShiftOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShift short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift short : wrong result : ", xLongValue >> yShortValue, longValue);

		value = eval(yLong + rightShiftOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShift short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift short : wrong result : ", yLongValue >> xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + rightShiftOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShift int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift int : wrong result : ", xLongValue >> yIntValue, longValue);

		value = eval(yLong + rightShiftOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShift int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift int : wrong result : ", yLongValue >> xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongRightShiftLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + rightShiftOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long rightShift long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift long : wrong result : ", xLongValue >> yLongValue, longValue);

		value = eval(yLong + rightShiftOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long rightShift long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long rightShift long : wrong result : ", yLongValue >> xLongValue, longValue);
		} finally {
		end();
		}
	}

	// long >>> {byte, char, short, int, long}

	public void testLongUnsignedRightShiftByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + unsignedRightShiftOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift byte : wrong result : ", xLongValue >>> yByteValue, longValue);

		value = eval(yLong + unsignedRightShiftOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift byte : wrong result : ", yLongValue >>> xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + unsignedRightShiftOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift char : wrong result : ", xLongValue >>> yCharValue, longValue);

		value = eval(yLong + unsignedRightShiftOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift char : wrong result : ", yLongValue >>> xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + unsignedRightShiftOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift short : wrong result : ", xLongValue >>> yShortValue, longValue);

		value = eval(yLong + unsignedRightShiftOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift short : wrong result : ", yLongValue >>> xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + unsignedRightShiftOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift int : wrong result : ", xLongValue >>> yIntValue, longValue);

		value = eval(yLong + unsignedRightShiftOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift int : wrong result : ", yLongValue >>> xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongUnsignedRightShiftLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + unsignedRightShiftOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift long : wrong result : ", xLongValue >>> yLongValue, longValue);

		value = eval(yLong + unsignedRightShiftOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long unsignedRightShift long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long unsignedRightShift long : wrong result : ", yLongValue >>> xLongValue, longValue);
		} finally {
		end();
		}
	}

	// long | {byte, char, short, int, long}

	public void testLongOrByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + orOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long or byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or byte : wrong result : ", xLongValue | yByteValue, longValue);

		value = eval(yLong + orOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long or byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or byte : wrong result : ", yLongValue | xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + orOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long or char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or char : wrong result : ", xLongValue | yCharValue, longValue);

		value = eval(yLong + orOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long or char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or char : wrong result : ", yLongValue | xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + orOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long or short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or short : wrong result : ", xLongValue | yShortValue, longValue);

		value = eval(yLong + orOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long or short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or short : wrong result : ", yLongValue | xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + orOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long or int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or int : wrong result : ", xLongValue | yIntValue, longValue);

		value = eval(yLong + orOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long or int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or int : wrong result : ", yLongValue | xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongOrLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + orOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long or long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or long : wrong result : ", xLongValue | yLongValue, longValue);

		value = eval(yLong + orOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long or long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long or long : wrong result : ", yLongValue | xLongValue, longValue);
		} finally {
		end();
		}
	}

	// long & {byte, char, short, int, long}

	public void testLongAndByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + andOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long and byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and byte : wrong result : ", xLongValue & yByteValue, longValue);

		value = eval(yLong + andOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long and byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and byte : wrong result : ", yLongValue & xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + andOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long and char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and char : wrong result : ", xLongValue & yCharValue, longValue);

		value = eval(yLong + andOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long and char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and char : wrong result : ", yLongValue & xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + andOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long and short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and short : wrong result : ", xLongValue & yShortValue, longValue);

		value = eval(yLong + andOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long and short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and short : wrong result : ", yLongValue & xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + andOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long and int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and int : wrong result : ", xLongValue & yIntValue, longValue);

		value = eval(yLong + andOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long and int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and int : wrong result : ", yLongValue & xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongAndLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + andOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long and long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and long : wrong result : ", xLongValue & yLongValue, longValue);

		value = eval(yLong + andOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long and long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long and long : wrong result : ", yLongValue & xLongValue, longValue);
		} finally {
		end();
		}
	}

	// long ^ {byte, char, short, int, long}

	public void testLongXorByte() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + xorOp + yByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xor byte : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor byte : wrong result : ", xLongValue ^ yByteValue, longValue);

		value = eval(yLong + xorOp + xByte); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xor byte : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor byte : wrong result : ", yLongValue ^ xByteValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorChar() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + xorOp + yChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xor char : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor char : wrong result : ", xLongValue ^ yCharValue, longValue);

		value = eval(yLong + xorOp + xChar); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xor char : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor char : wrong result : ", yLongValue ^ xCharValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorShort() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + xorOp + yShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xor short : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor short : wrong result : ", xLongValue ^ yShortValue, longValue);

		value = eval(yLong + xorOp + xShort); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xor short : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor short : wrong result : ", yLongValue ^ xShortValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorInt() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + xorOp + yInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xor int : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor int : wrong result : ", xLongValue ^ yIntValue, longValue);

		value = eval(yLong + xorOp + xInt); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xor int : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor int : wrong result : ", yLongValue ^ xIntValue, longValue);
		} finally {
		end();
		}
	}

	public void testLongXorLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(xLong + xorOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("long xor long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor long : wrong result : ", xLongValue ^ yLongValue, longValue);

		value = eval(yLong + xorOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("long xor long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("long xor long : wrong result : ", yLongValue ^ xLongValue, longValue);
		} finally {
		end();
		}
	}

	// + long

	public void testPlusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(plusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("plus long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("plus long : wrong result : ", + xLongValue, longValue);

		value = eval(plusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("plus long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("plus long : wrong result : ", + yLongValue, longValue);
		} finally {
		end();
		}
	}

	// - long

	public void testMinusLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(minusOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("minus long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("minus long : wrong result : ", - xLongValue, longValue);

		value = eval(minusOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("minus long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("minus long : wrong result : ", - yLongValue, longValue);
		} finally {
		end();
		}
	}

	// ~ long

	public void testTwiddleLong() throws Throwable { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		try {
		init();
		IValue value = eval(twiddleOp + xLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		String typeName = value.getReferenceTypeName();
		assertEquals("twiddle long : wrong type : ", "long", typeName);
		long longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("twiddle long : wrong result : ", ~ xLongValue, longValue);

		value = eval(twiddleOp + yLong); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		typeName = value.getReferenceTypeName();
		assertEquals("twiddle long : wrong type : ", "long", typeName);
		longValue = ((IJavaPrimitiveValue)value).getLongValue();
		assertEquals("twiddle long : wrong result : ", ~ yLongValue, longValue);
		} finally {
		end();
		}
	}


}
