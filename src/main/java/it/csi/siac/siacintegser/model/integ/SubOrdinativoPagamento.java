/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class SubOrdinativoPagamento extends Ordinativo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7833253425139013637L;
	
	private Integer annoImpegno;
	private Integer numeroImpegno;
	private Integer annoLiquidazione;
	private Integer numeroLiquidazione;
	private BigDecimal importo;

	
	
	/**
	 * @return the annoLiquidazione
	 */
	public Integer getAnnoLiquidazione() {
		return annoLiquidazione;
	}

	/**
	 * @param annoLiquidazione the annoLiquidazione to set
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
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}

	/**
	 * @param importo
	 *            the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
}
