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
package org.eclipse.jdt.internal.debug.ui.actions;


import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IDebugView;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.jdt.internal.debug.ui.IJDIPreferencesConstants;
import org.eclipse.jdt.internal.debug.ui.JDIModelPresentation;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.custom.BusyIndicator;

/**
 * An action delegate that toggles the state of its viewer to
 * show/hide qualified names.
 */
public class ShowQualifiedAction extends ViewFilterAction { //FLLDCIM: MARK — T23  IMPLEMENTS

	/**
	 * @see ViewFilterAction#getPreferenceKey()
	 */
	@Override
	protected String getPreferenceKey() {
		return IJDIPreferencesConstants.PREF_SHOW_QUALIFIED_NAMES;
	}

	/**
	 * This method is not actually called - this action is not a filter. Instead
	 * it sets an attribute on the viewer's model presentation.
	 *
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
	public void run(IAction action) {
		final StructuredViewer viewer = getStructuredViewer();
		IDebugView view = getView().getAdapter(IDebugView.class);
		if (view != null) {
			IDebugModelPresentation pres = view.getPresentation(JDIDebugModel.getPluginIdentifier());
			if (pres != null) {
				pres.setAttribute(JDIModelPresentation.DISPLAY_QUALIFIED_NAMES, (getValue() ? Boolean.TRUE : Boolean.FALSE));
				BusyIndicator.showWhile(viewer.getControl().getDisplay(), new Runnable() {
					@Override
					public void run() {
						viewer.refresh(); //FLLDCIM: MARK — M21 FULL_REBUILD_TO_DELTA CALL
						IPreferenceStore store = getPreferenceStore();
						String key = getView().getSite().getId() + "." + getPreferenceKey(); //$NON-NLS-1$ //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
						store.setValue(key, getValue());
					}
				});
			}
		}
	}
}
