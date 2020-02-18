/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Errore extends MessaggioBase {
	private static final long serialVersionUID = -8113775712241652192L;

	public Errore() {
		super();
	}

	public Errore(String codice, String descrizione) {
		super(codice, descrizione);
	}

}
