/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public abstract class EntitaCodificataBase extends EntitaBase {
	private static final long serialVersionUID = 8888201782204831034L;

	protected String codice;
	protected String descrizione;

	protected EntitaCodificataBase() {
		super();
	}

	protected EntitaCodificataBase(String codice, String descrizione) {
		this();
		this.codice = codice;
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String getCodice() {
		return codice;
	}

	@Override
	public void setCodice(String codice) {
		this.codice = codice;
	}

}
