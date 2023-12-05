/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public abstract class MessaggioBase extends EntitaCodificataBase {

	private static final long serialVersionUID = 3952784451524097519L;


	protected MessaggioBase() {
		super();
	}

	public MessaggioBase(String codice, String descrizione) {
		super(codice, descrizione);
	}

	@Override
	public String toString() {
		return String.format("<%s> %s", codice, descrizione);
	}

}
