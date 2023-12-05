/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class LiquidazioneAtti extends Liquidazione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6527645148399591530L;

	private Integer annoEsercizio;
	private Integer numeroLiquidazionePrecedente;
	
	private Provvedimento atto;
	
	private String beneficiario;

	private Integer numeroCapitolo;
	private Integer numeroArticolo;
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
	 * @return the numeroLiquidazionePrecedente
	 */
	public Integer getNumeroLiquidazionePrecedente() {
		return numeroLiquidazionePrecedente;
	}
	/**
	 * @param numeroLiquidazionePrecedente the numeroLiquidazionePrecedente to set
	 */
	public void setNumeroLiquidazionePrecedente(Integer numeroLiquidazionePrecedente) {
		this.numeroLiquidazionePrecedente = numeroLiquidazionePrecedente;
	}
	/**
	 * @return the atto
	 */
	public Provvedimento getAtto() {
		return atto;
	}
	/**
	 * @param atto the atto to set
	 */
	public void setAtto(Provvedimento atto) {
		this.atto = atto;
	}
	
	/**
	 * @return the beneficiario
	 */
	public String getBeneficiario() {
		return beneficiario;
	}
	/**
	 * @param beneficiario the beneficiario to set
	 */
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
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

}
