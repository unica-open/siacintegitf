/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class StrutturaAmministrativa extends EntitaCodificataBase {
	private static final long serialVersionUID = 7075703597915541129L;

//	private String codiceCDR;
//	private String descrizioneCDR;
//	private String codiceTipoStrutturaCDR;
	private String codiceTipoStruttura;
	
	
//
//	/**
//	 * @return the codiceCDR
//	 */
//	public String getCodiceCDR() {
//		return codiceCDR;
//	}
//
//	/**
//	 * @param codiceCDR the codiceCDR to set
//	 */
//	public void setCodiceCDR(String codiceCDR) {
//		this.codiceCDR = codiceCDR;
//	}
//
//	/**
//	 * @return the descrizioneCDR
//	 */
//	public String getDescrizioneCDR() {
//		return descrizioneCDR;
//	}

//	/**
//	 * @param descrizioneCDR the descrizioneCDR to set
//	 */
//	public void setDescrizioneCDR(String descrizioneCDR) {
//		this.descrizioneCDR = descrizioneCDR;
//	}
//
//	/**
//	 * @return the codiceTipoStrutturaCDR
//	 */
//	public String getCodiceTipoStrutturaCDR() {
//		return codiceTipoStrutturaCDR;
//	}
//
//	/**
//	 * @param codiceTipoStrutturaCDR the codiceTipoStrutturaCDR to set
//	 */
//	public void setCodiceTipoStrutturaCDR(String codiceTipoStrutturaCDR) {
//		this.codiceTipoStrutturaCDR = codiceTipoStrutturaCDR;
//	}

	/**
	 * @return the codiceTipoStruttura
	 */
	public String getCodiceTipoStruttura() {
		return codiceTipoStruttura;
	}

	/**
	 * @param codiceTipoStruttura the codiceTipoStruttura to set
	 */
	public void setCodiceTipoStruttura(String codiceTipoStruttura) {
		this.codiceTipoStruttura = codiceTipoStruttura;
	}
	

	
}
