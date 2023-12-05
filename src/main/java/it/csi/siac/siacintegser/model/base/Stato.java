/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Stato extends EntitaCodificataBase {
	public Stato() {
		super();
	}

	private static final long serialVersionUID = 7075703597915541129L;

}
