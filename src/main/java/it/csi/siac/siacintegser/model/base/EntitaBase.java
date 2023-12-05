/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public abstract class EntitaBase implements Serializable {
	private static final long serialVersionUID = -7533756352170112674L;

	protected static final String NULL_CODING = "X";
	
	private Stato stato;


	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public abstract String getCodice();

//	public abstract void setCodice(String codice);

}
