/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Messaggio extends MessaggioBase {

	private static final long serialVersionUID = 6760007679845305881L;

	public Messaggio() {
		super();
	}


	public Messaggio(String codice, String descrizione) {
		super(codice, descrizione);
	}

}
