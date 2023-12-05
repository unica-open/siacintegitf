/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.ricerche.RicercheDataDictionary;

@XmlType(namespace = RicercheDataDictionary.NAMESPACE)
public class Ordine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -668291817795934968L;
	
	private String numeroOrdine;
	
	

	/**
	 * @return the numeroOrdine
	 */
	public String getNumeroOrdine() {
		return numeroOrdine;
	}

	/**
	 * @param numeroOrdine the numeroOrdine to set
	 */
	public void setNumeroOrdine(String numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}



}
