/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Liquidazione extends EntitaBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	private String codice;

	private Integer numeroLiquidazione;
	private Integer annoLiquidazione;

	private Integer annoImpegno;
	private Integer numeroImpegno;
	private Integer numeroSubImpegno;
	private BigDecimal importoLiquidazione;
	

	
	@Override
	public String getCodice() {
		return codice;
	}

	@Override
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the numeroLiquidazione
	 */
	public Integer getNumeroLiquidazione() {
		return numeroLiquidazione;
	}

	/**
	 * @param numeroLiquidazione
	 *            the numeroLiquidazione to set
	 */
	public void setNumeroLiquidazione(Integer numeroLiquidazione) {
		this.numeroLiquidazione = numeroLiquidazione;
	}

	/**
	 * @return the annoLiquidazione
	 */
	public Integer getAnnoLiquidazione() {
		return annoLiquidazione;
	}

	/**
	 * @param annoLiquidazione
	 *            the annoLiquidazione to set
	 */
	public void setAnnoLiquidazione(Integer annoLiquidazione) {
		this.annoLiquidazione = annoLiquidazione;
	}

	/**
	 * @return the annoImpegno
	 */
	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	/**
	 * @param annoImpegno
	 *            the annoImpegno to set
	 */
	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	/**
	 * @return the numeroImpegno
	 */
	public Integer getNumeroImpegno() {
		return numeroImpegno;
	}

	/**
	 * @param numeroImpegno
	 *            the numeroImpegno to set
	 */
	public void setNumeroImpegno(Integer numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	/**
	 * @return the numeroSubImpegno
	 */
	public Integer getNumeroSubImpegno() {
		return numeroSubImpegno;
	}

	/**
	 * @param numeroSubImpegno
	 *            the numeroSubImpegno to set
	 */
	public void setNumeroSubImpegno(Integer numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}

	/**
	 * @return the importoLiquidazione
	 */
	public BigDecimal getImportoLiquidazione() {
		return importoLiquidazione;
	}

	/**
	 * @param importoLiquidazione
	 *            the importoLiquidazione to set
	 */
	public void setImportoLiquidazione(BigDecimal importoLiquidazione) {
		this.importoLiquidazione = importoLiquidazione;
	}

}
