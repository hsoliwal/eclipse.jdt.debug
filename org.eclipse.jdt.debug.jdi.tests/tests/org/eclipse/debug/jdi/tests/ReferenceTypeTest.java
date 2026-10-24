/*******************************************************************************
 * Copyright (c) 2000, 2015 IBM Corporation and others.
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
package org.eclipse.debug.jdi.tests;

import static org.junit.Assert.assertNotEquals;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import com.sun.jdi.Field;
import com.sun.jdi.IntegerValue;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;

/**
 * Tests for JDI com.sun.jdi.ReferenceType
 * and JDWP Type command set.
 */
public class ReferenceTypeTest extends AbstractJDITest {

	private final List<ReferenceType> fTypes = new LinkedList<>();

	// These must match what is done in localSetUp
	private final boolean[] fSystemClassLoader = { true, true, false, false };
	private final boolean[] fHasMethods = { true, false, true, true };
	private final boolean[] fIsAbstract = { false, false, false, true };
	private final boolean[] fIsFinal = { false, true, false, false };
	private final boolean[] fIsStatic = { false, false, false, false };
	private final String[] fTypeName =
		{
			"java.lang.Object",
			"java.lang.String[]",
			"org.eclipse.debug.jdi.tests.program.MainClass",
			"org.eclipse.debug.jdi.tests.program.Printable" };
	private final int fObjectIndex = 0;
	private final int fMainClassIndex = 2;

	/**
	 * Creates a new test.
	 */
	public ReferenceTypeTest() {
		super();
	}

	public ReferenceTypeTest(String name) {
		super(name);
	}
	/**
	 * Init the fields that are used by this test only.
	 */
	@Override
	public void localSetUp() {
		// Get all kinds of reference type
		fTypes.add(getSystemType());
		fTypes.add(getArrayType());
		fTypes.add(getMainClass());
		fTypes.add(getInterfaceType());
	}
	/**
	 * Run all tests and output to standard output.
	 */
	public static void main(java.lang.String[] args) {
		new ReferenceTypeTest().runSuite(args);
	}
	/**
	 * Test JDI allFields().
	 */
	public void testJDIAllFields() {
		Iterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			Iterator<?> all = type.allFields().iterator();
			int i = 0;
			while (all.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				assertTrue("1." + type.name() + "." + i++, all.next() instanceof Field); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
	/**
	 * Test JDI allMethods().
	 */
	public void testJDIAllMethods() {
		Iterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			Iterator<?> all = type.allMethods().iterator();
			int i = 0;
			while (all.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				assertTrue("1." + type.name() + "." + i++, all.next() instanceof Method); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
	/**
	 * Test JDI classLoader() and JDWP 'Type - Get class loader'.
	 */
	public void testJDIClassLoader() {
		for (int i = 0; i < fTypes.size(); ++i) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = fTypes.get(i);
			ObjectReference classLoader = type.classLoader();
			assertEquals("1." + i, (classLoader == null), fSystemClassLoader[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI classObject().
	 */
	public void testJDIClassObject() {
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			assertNotNull(type.name(), type.classObject());
		}
	}
	/**
	 * Test JDI equals() and hashCode().
	 */
	public void testJDIEquality() {
		ReferenceType other =
			fVM.classesByName("java.lang.String").get(0);
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			assertTrue("1." + type.name() + ".1", type.equals(type)); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			assertFalse("1." + type.name() + ".2", type.equals(other)); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			@SuppressWarnings("unlikely-arg-type")
			boolean wrongClass = type.equals(fVM);
			assertFalse("1." + type.name() + ".3", wrongClass); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			assertFalse("1." + type.name() + ".4", type.equals(new Object())); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			assertFalse("1." + type.name() + ".5", type.equals(null)); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			assertNotEquals("1." + type.name() + ".6", type.hashCode(), other.hashCode()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI failedToInitialize().
	 */
	public void testJDIFailedToInitialize() {
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			assertFalse("1." + type.name(), type.failedToInitialize()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI fieldByName(String).
	 */
	public void testJDIFieldByName() {
		// NB: This tests the class type only, it should test the others too
		ReferenceType type = fTypes.get(fMainClassIndex);
		Field field = type.fieldByName("fObject");
		assertNotNull("1." + type.name(), field); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
	}
	/**
	 * Test JDI fields() and JDWP 'Type - Get Fields'.
	 */
	public void testJDIFields() {
		Iterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			Iterator<?> fields = type.fields().iterator();
			int i = 0;
			while (fields.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				assertTrue("1." + i++ +"." + type.name(), fields.next() instanceof Field); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
	/**
	 * Test JDI getValue(Field) and JDWP 'Type - Get Fields Values'.
	 */
	public void testJDIGetValue() {
		// NB: This tests the class type only, it should test the others too
		ReferenceType type = fTypes.get(fMainClassIndex);
		Field field = type.fieldByName("fInt");
		assertNotNull("1." + type.name(), field); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		assertTrue("2." + type.name(), type.getValue(field) instanceof IntegerValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
	}
	/**
	 * Test JDI getValues(List) and JDWP 'Type - Get Fields Values'.
	 */
	public void testJDIGetValues() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		// NB: This tests the class type only, it should test the others too
		ReferenceType type = fTypes.get(fMainClassIndex);

		// Get field values
		List<?> fields = type.fields();
		ListIterator<?> iterator = fields.listIterator();
		List<Field> staticFields = new LinkedList<>();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			Field field = (Field) iterator.next();
			if (field.isStatic()) {
				staticFields.add(field);
			}
		}
		Map<?, ?> values = type.getValues(staticFields);
		assertEquals("1." + type.name(), 24, values.size()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		// Get value of field fInt in MainClass
		Field field = staticFields.get(0);
		int i = 0;
		while (!field.name().equals("fInt")) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			field = staticFields.get(++i);
		}

		// Ensure it is an integer value
		assertTrue("2." + type.name(), values.get(field) instanceof IntegerValue); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
	}
	/**
	 * Test JDI isAbstract().
	 */
	public void testJDIIsAbstract() {
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			if (type.name().equals("org.eclipse.debug.jdi.tests.program.Printable")) {
				assertTrue("1." + type.name(), type.isAbstract()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			} else {
				assertFalse("2." + type.name(), type.isAbstract()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
	/**
	 * Test JDI isFinal().
	 */
	public void testJDIIsFinal() {
		for (int i = 0; i < fTypes.size(); ++i) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = fTypes.get(i);
			assertEquals("1." + i, type.isFinal(), fIsFinal[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI isInitialized().
	 */
	public void testJDIIsInitialized() {
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			assertTrue("1." + type.name(), type.isInitialized()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI isPrepared().
	 */
	public void testJDIIsPrepared() {
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			assertTrue("1." + type.name(), type.isPrepared()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI isStatic().
	 */
	public void testJDIIsStatic() {
		ListIterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			assertFalse("1." + type.name(), type.isStatic()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI isVerified().
	 */
	public void testJDIIsVerified() {
		for (int i = 0; i < fTypes.size(); ++i) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if (i != fObjectIndex) {
				ReferenceType type = fTypes.get(i);
				assertTrue("1." + type.name(), type.isVerified()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
	/**
	 * Test JDI methods() and JDWP 'Type - Get Methods'.
	 */
	public void testJDIMethods() {
		for (int i = 0; i < fTypes.size(); ++i) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = fTypes.get(i);
			List<?> methods = type.methods();
			assertNotEquals("" + i, methods.isEmpty(), fHasMethods[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI methodsByName(String) and methodsByName(String, String).
	 */
	public void testJDIMethodsByName() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		Iterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();

			// methodsByName(String)
			Iterator<?> methods = type.methodsByName("run").iterator();
			while (methods.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				assertTrue("1." + type.name(), methods.next() instanceof Method); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
			assertEquals("2", 0, type.methodsByName("fraz").size());

			// methodsByName(String, String)
			methods = type.methodsByName("run", "()V").iterator();
			while (methods.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				assertTrue("3." + type.name(), methods.next() instanceof Method); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
			assertEquals("4", 0, type.methodsByName("fraz", "()Z").size());
		}
	}
	/**
	 * Test JDI isAbstract(), isFinal() and isStatic()
	 * and JDWP 'Type - Get modifiers'.
	 */
	public void testJDIModifiers() {
		for (int i = 0; i < fTypes.size(); ++i) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = fTypes.get(i);
			if (i != 2) {
				// i == 2 corresponds to an ArrayType, isAbstract() is undefined
				assertEquals("1." + i, type.isAbstract(), fIsAbstract[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
			assertEquals("2." + i, type.isFinal(), fIsFinal[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			assertEquals("3." + i, type.isStatic(), fIsStatic[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI name() and JDWP 'Type - Get signature'.
	 */
	public void testJDIName() {
		for (int i = 0; i < fTypes.size(); ++i) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = fTypes.get(i);
			assertEquals("" + i, type.name(), fTypeName[i]); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}
	/**
	 * Test JDI nestedTypes().
	 */
	public void testJDINestedTypes() {
		// NB: This tests the class type only, it should test the others too
		ReferenceType type = getClass("org.eclipse.debug.jdi.tests.program.OtherClass");
		assertNotNull("1." + type.name(), type); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		List<?> nestedTypes = type.nestedTypes();
		assertEquals("2." + type.name(), 1, nestedTypes.size()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		assertTrue("3." + type.name(), nestedTypes.get(0) instanceof ReferenceType); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
	}
	/**
	 * Test JDI visibleFields().
	 */
	public void testJDIVisibleFields() {
		Iterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			List<?> all = type.allFields();
			Iterator<?> visible = type.visibleFields().iterator();
			while (visible.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				Field next = (Field) visible.next();
				assertTrue("1." + type.name() + "." + next.name(), all.contains(next)); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
	/**
	 * Test JDI visibleMethods().
	 */
	public void testJDIVisibleMethods() {
		Iterator<ReferenceType> iterator = fTypes.listIterator();
		while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			ReferenceType type = iterator.next();
			List<?> all = type.allMethods();
			Iterator<?> visible = type.visibleMethods().iterator();
			while (visible.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				Method next = (Method) visible.next();
				assertTrue("1." + type.name() + "." + next.name(), all.contains(next)); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			}
		}
	}
}
