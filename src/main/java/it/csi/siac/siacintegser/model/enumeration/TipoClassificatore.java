/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.enumeration;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;


@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public enum TipoClassificatore {
	
	CDR("CDR", "Direzione"),
	CDC("CDC", "Settore"),
	
	;
	
	private String codice;
	private String descrizione;
	
	private TipoClassificatore(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
}