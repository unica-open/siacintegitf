/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Importo extends EntitaBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1307097179591205706L;
	
	private String codice;
	private Integer annoCompetenza;

	/**
	 * @return the annoCompetenza
	 */
	public Integer getAnnoCompetenza() {
		return annoCompetenza;
	}

	/**
	 * @param annoCompetenza the annoCompetenza to set
	 */
	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}
	
	@Override
	public String getCodice() {
		return codice;
	}

	//@Override
	public void setCodice(String codice) {
		this.codice = codice;
		
	}
	

}
