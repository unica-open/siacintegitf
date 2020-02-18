/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class MovimentoGestione extends EntitaCodificataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	private Boolean parereFinanziario;
	private BigDecimal importo;
	
	private String cig;
	private String cup;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	private String codiceSoggetto;
	private Provvedimento provvedimento;
	private PianoDeiContiFinanziario pdc;
	


	/**
	 * @return the pdc
	 */
	public PianoDeiContiFinanziario getPdc() {
		return pdc;
	}

	/**
	 * @param pdc
	 *            the pdc to set
	 */
	public void setPdc(PianoDeiContiFinanziario pdc) {
		this.pdc = pdc;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione
	 *            the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the parereFinanziario
	 */
	public Boolean getParereFinanziario() {
		return parereFinanziario;
	}

	/**
	 * @param parereFinanziario
	 *            the parereFinanziario to set
	 */
	public void setParereFinanziario(Boolean parereFinanziario) {
		this.parereFinanziario = parereFinanziario;
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

	/**
	 * @return the cig
	 */
	public String getCig() {
		return cig;
	}

	/**
	 * @param cig
	 *            the cig to set
	 */
	public void setCig(String cig) {
		this.cig = cig;
	}

	/**
	 * @return the cup
	 */
	public String getCup() {
		return cup;
	}

	/**
	 * @param cup
	 *            the cup to set
	 */
	public void setCup(String cup) {
		this.cup = cup;
	}

	/**
	 * @return the numeroCapitolo
	 */
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	/**
	 * @param numeroCapitolo
	 *            the numeroCapitolo to set
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
	 * @param numeroArticolo
	 *            the numeroArticolo to set
	 */
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	/**
	 * @return the numeroUEB
	 */
	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	/**
	 * @param numeroUEB
	 *            the numeroUEB to set
	 */
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
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
	 * @return the provvedimento
	 */
	public Provvedimento getProvvedimento() {
		return provvedimento;
	}

	/**
	 * @param provvedimento
	 *            the provvedimento to set
	 */
	public void setProvvedimento(Provvedimento provvedimento) {
		this.provvedimento = provvedimento;
	}


}
