/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;
import it.csi.siac.siacintegser.model.ricerche.RicercheDataDictionary;

@XmlType(namespace = RicercheDataDictionary.NAMESPACE)
public class Documento extends EntitaCodificataBase {
	public Documento() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2144892858101733911L;

	private Integer annoDocumento;
	private String numeroDocumento;
	private String tipoDocumento;
	private String codiceSoggetto;
	private BigDecimal importoDocumento;
	private BigDecimal importoNettoDocumento;
	private BigDecimal arrotondamento;

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
	 * @param numeroRepertorio
	 *            the numeroRepertorio to set
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
	 * @param dataRepertorio
	 *            the dataRepertorio to set
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
	 * @param registroRepertorio
	 *            the registroRepertorio to set
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
	 * @param annoRepertorio
	 *            the annoRepertorio to set
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
	 * @param numeroDocumento
	 *            the numeroDocumento to set
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

	/**
	 * @return the importoDocumento
	 */
	public BigDecimal getImportoDocumento() {
		return importoDocumento;
	}

	/**
	 * @param importoDocumento
	 *            the importoDocumento to set
	 */
	public void setImportoDocumento(BigDecimal importoDocumento) {
		this.importoDocumento = importoDocumento;
	}

	/**
	 * @return the importoNettoDocumento
	 */
	public BigDecimal getImportoNettoDocumento() {
		return importoNettoDocumento;
	}

	/**
	 * @param importoNettoDocumento
	 *            the importoNettoDocumento to set
	 */
	public void setImportoNettoDocumento(BigDecimal importoNettoDocumento) {
		this.importoNettoDocumento = importoNettoDocumento;
	}

	/**
	 * @return the arrotondamento
	 */
	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	/**
	 * @param arrotondamento
	 *            the arrotondamento to set
	 */
	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}

}
