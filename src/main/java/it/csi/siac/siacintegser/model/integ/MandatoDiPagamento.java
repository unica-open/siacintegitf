/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class MandatoDiPagamento extends EntitaBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6527645148399591530L;

	private Integer annoEsercizio;
	private Integer annoOrdinativo;
	private Integer numeroOrdinativo;
	private String codiceSubOrdinativo;
	private String creditore;
	private Integer annoLiquidazione;
	private Integer numeroLiquidazione;
	private BigDecimal importoOrdinativo;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Provvedimento provvedimento;
	private Date dataEmissione;
	private Integer annoImpegno;
	private Integer numeroImpegno;
	private Integer numeroSubImpegno;

	//private Date dataQuietanza;
	//private BigDecimal importoQuietanza;



	/**
	 * @return the codiceSubOrdinativo
	 */
	public String getCodiceSubOrdinativo() {
		return codiceSubOrdinativo;
	}

	/**
	 * @param codiceSubOrdinativo the codiceSubOrdinativo to set
	 */
	public void setCodiceSubOrdinativo(String codiceSubOrdinativo) {
		this.codiceSubOrdinativo = codiceSubOrdinativo;
	}

	/**
	 * @return the creditore
	 */
	public String getCreditore() {
		return creditore;
	}

	/**
	 * @param creditore the creditore to set
	 */
	public void setCreditore(String creditore) {
		this.creditore = creditore;
	}

	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	/**
	 * @return the annoOrdinativo
	 */
	public Integer getAnnoOrdinativo() {
		return annoOrdinativo;
	}

	/**
	 * @param annoOrdinativo the annoOrdinativo to set
	 */
	public void setAnnoOrdinativo(Integer annoOrdinativo) {
		this.annoOrdinativo = annoOrdinativo;
	}

	/**
	 * @return the numeroOrdinativo
	 */
	public Integer getNumeroOrdinativo() {
		return numeroOrdinativo;
	}

	/**
	 * @param numeroOrdinativo the numeroOrdinativo to set
	 */
	public void setNumeroOrdinativo(Integer numeroOrdinativo) {
		this.numeroOrdinativo = numeroOrdinativo;
	}

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
	 * @return the numeroLiquidazione
	 */
	public Integer getNumeroLiquidazione() {
		return numeroLiquidazione;
	}

	/**
	 * @param numeroLiquidazione the numeroLiquidazione to set
	 */
	public void setNumeroLiquidazione(Integer numeroLiquidazione) {
		this.numeroLiquidazione = numeroLiquidazione;
	}


	/**
	 * @return the importoOrdinativo
	 */
	public BigDecimal getImportoOrdinativo() {
		return importoOrdinativo;
	}

	/**
	 * @param importoOrdinativo the importoOrdinativo to set
	 */
	public void setImportoOrdinativo(BigDecimal importoOrdinativo) {
		this.importoOrdinativo = importoOrdinativo;
	}

	/**
	 * @return the numeroCapitolo
	 */
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	/**
	 * @param numeroCapitolo the numeroCapitolo to set
	 */
	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	/**
	 * @return the numeroArticolo
	 */
	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}

	/**
	 * @param numeroArticolo the numeroArticolo to set
	 */
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	/**
	 * @return the provvedimento
	 */
	public Provvedimento getProvvedimento() {
		return provvedimento;
	}

	/**
	 * @param provvedimento the provvedimento to set
	 */
	public void setProvvedimento(Provvedimento provvedimento) {
		this.provvedimento = provvedimento;
	}



	/**
	 * @return the dataEmissione
	 */
	public Date getDataEmissione() {
		return dataEmissione;
	}

	/**
	 * @param dataEmissione the dataEmissione to set
	 */
	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	/**
	 * @return the annoImpegno
	 */
	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	/**
	 * @param annoImpegno the annoImpegno to set
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
	 * @param numeroImpegno the numeroImpegno to set
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
	 * @param numeroSubImpegno the numeroSubImpegno to set
	 */
	public void setNumeroSubImpegno(Integer numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}



	@Override
	public String getCodice() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void setCodice(String codice) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
