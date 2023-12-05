/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class NaturaRicorrente extends EntitaCodificataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7876462476585686189L;

	public NaturaRicorrente() {
		super();
	}
	

	public NaturaRicorrente(String classifCode, String classifDesc) {
		super(classifCode, classifDesc);
	}

}
