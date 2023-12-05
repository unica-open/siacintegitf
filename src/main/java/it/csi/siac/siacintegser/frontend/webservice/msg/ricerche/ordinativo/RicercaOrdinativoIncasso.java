/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataRequest;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaOrdinativoIncasso extends RicercaPaginataRequest {

	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	private String codiceTipoProvvedimento;
	private String codiceStruttura;
	private String codiceTipoStruttura; 
	/**
	 * @return the annoProvvedimento
	 */
	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}
	/**
	 * @param annoProvvedimento the annoProvvedimento to set
	 */
	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}
	/**
	 * @return the numeroProvvedimento
	 */
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}
	/**
	 * @param numeroProvvedimento the numeroProvvedimento to set
	 */
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}
	/**
	 * @return the codiceTipoProvvedimento
	 */
	public String getCodiceTipoProvvedimento() {
		return codiceTipoProvvedimento;
	}
	/**
	 * @param codiceTipoProvvedimento the codiceTipoProvvedimento to set
	 */
	public void setCodiceTipoProvvedimento(String codiceTipoProvvedimento) {
		this.codiceTipoProvvedimento = codiceTipoProvvedimento;
	}
	/**
	 * @return the codiceStruttura
	 */
	public String getCodiceStruttura() {
		return codiceStruttura;
	}
	/**
	 * @param codiceStruttura the codiceStruttura to set
	 */
	public void setCodiceStruttura(String codiceStruttura) {
		this.codiceStruttura = codiceStruttura;
	}
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
