/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class TransazioneUnioneEuropea extends EntitaCodificataBase {
	public TransazioneUnioneEuropea() {
		super();
	}

	public TransazioneUnioneEuropea(String classifCode, String classifDesc) {
		super(classifCode, classifDesc);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5868053602618851007L;

}
