/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class PianoDeiContiFinanziario extends EntitaCodificataBase {
	
	private static final long serialVersionUID = 7075703597915541129L;

	public PianoDeiContiFinanziario() {
		super();
	}
	
	
	public PianoDeiContiFinanziario(String classifCode, String classifDesc) {
		super(classifCode, classifDesc);
	}

}
