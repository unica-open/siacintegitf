/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Cofog extends EntitaCodificataBase {
	public Cofog() {
		super();
	}

	private static final long serialVersionUID = 3330893060220720298L;

	public Cofog(String codice, String descrizione) {
		super(codice, descrizione);
	}
}
