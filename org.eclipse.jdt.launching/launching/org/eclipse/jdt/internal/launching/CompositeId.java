/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
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
package org.eclipse.jdt.internal.launching;

import java.util.ArrayList;

/**
 * Utility class for id's made of multiple Strings
 */
public class CompositeId {
	private final String[] fParts;

	public CompositeId(String[] parts) {
		fParts= parts;
	}

	public static CompositeId fromString(String idString) {
		ArrayList<String> parts= new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
		int commaIndex= idString.indexOf(',');
		while (commaIndex > 0) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			int length= Integer.parseInt(idString.substring(0, commaIndex));
			String part= idString.substring(commaIndex+1, commaIndex+1+length);
			parts.add(part);
			idString= idString.substring(commaIndex+1+length);
			commaIndex= idString.indexOf(',');
		}
		String[] result= parts.toArray(new String[parts.size()]);
		return new CompositeId(result);
	}

	@Override
	public String toString() {
		StringBuilder buf= new StringBuilder(); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
		for (int i= 0; i < fParts.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			buf.append(fParts[i].length()); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append(','); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append(fParts[i]); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		}
		return buf.toString();
	}

	public String get(int index) {
		return fParts[index];
	}

	public int getPartCount() {
		return fParts.length;
	}
}
