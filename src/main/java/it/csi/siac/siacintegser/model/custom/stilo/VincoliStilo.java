/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.stilo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class VincoliStilo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4691598040149267143L;
	
	
	private List<VincoloImpegnoStilo> vincolo;


	/**
	 * @return the vincoli
	 */
	public List<VincoloImpegnoStilo> getVincolo() {
		return vincolo;
	}


	/**
	 * @param vincoli the vincoli to set
	 */
	public void setVincolo(List<VincoloImpegnoStilo> vincolo) {
		this.vincolo = vincolo;
	}
	
	

}
