/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.documenti;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataRequest;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public abstract class BaseRicercaDocumento extends RicercaPaginataRequest {

	private Integer annoDocumento;
	private String numeroDocumento;
	private String tipoDocumento;
	private String codiceSoggetto;
	
	private String numeroRepertorio; 
	private Date dataRepertorio;
	private String registroRepertorio;
	private Integer annoRepertorio;
	
	

	/**
	 * @return the numeroRepertorio
	 */
	public String getNumeroRepertorio() {
		return numeroRepertorio;
	}

	/**
	 * @param numeroRepertorio the numeroRepertorio to set
	 */
	public void setNumeroRepertorio(String numeroRepertorio) {
		this.numeroRepertorio = numeroRepertorio;
	}

	/**
	 * @return the dataRepertorio
	 */
	public Date getDataRepertorio() {
		return dataRepertorio;
	}

	/**
	 * @param dataRepertorio the dataRepertorio to set
	 */
	public void setDataRepertorio(Date dataRepertorio) {
		this.dataRepertorio = dataRepertorio;
	}

	/**
	 * @return the registroRepertorio
	 */
	public String getRegistroRepertorio() {
		return registroRepertorio;
	}

	/**
	 * @param registroRepertorio the registroRepertorio to set
	 */
	public void setRegistroRepertorio(String registroRepertorio) {
		this.registroRepertorio = registroRepertorio;
	}

	/**
	 * @return the annoRepertorio
	 */
	public Integer getAnnoRepertorio() {
		return annoRepertorio;
	}

	/**
	 * @param annoRepertorio the annoRepertorio to set
	 */
	public void setAnnoRepertorio(Integer annoRepertorio) {
		this.annoRepertorio = annoRepertorio;
	}

	/**
	 * @return the annoDocumento
	 */
	public Integer getAnnoDocumento() {
		return annoDocumento;
	}

	/**
	 * @param annoDocumento
	 *            the annoDocumento to set
	 */
	public void setAnnoDocumento(Integer annoDocumento) {
		this.annoDocumento = annoDocumento;
	}



	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento
	 *            the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the codiceSoggetto
	 */
	public String getCodiceSoggetto() {
		return codiceSoggetto;
	}

	/**
	 * @param codiceSoggetto
	 *            the codiceSoggetto to set
	 */
	public void setCodiceSoggetto(String codiceSoggetto) {
		this.codiceSoggetto = codiceSoggetto;
	}

}
