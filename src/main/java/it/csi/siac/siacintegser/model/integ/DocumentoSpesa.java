/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.ricerche.RicercheDataDictionary;

@XmlType(namespace = RicercheDataDictionary.NAMESPACE)
public class DocumentoSpesa extends Documento {

	/**
	 * 
	 */
	private static final long serialVersionUID = -668291817795934968L;
	
	
	private List<Ordine> elencoOrdini = new ArrayList<Ordine>();


	/**
	 * @return the elencoOrdini
	 */
	public List<Ordine> getElencoOrdini() {
		return elencoOrdini;
	}


	/**
	 * @param elencoOrdini the elencoOrdini to set
	 */
	public void setElencoOrdini(List<Ordine> elencoOrdini) {
		this.elencoOrdini = elencoOrdini;
	}
	
	
	

}
