/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Ordinativo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8040938548903253113L;
	
	private Integer numeroOrdinativo;
	private Integer numeroCapitolo;
	private String codiceSoggetto;
	private String denominazioneSoggetto;
	private Date dataEmissione;
	private Date dataQuietanza;
	private String codiceStato;
	
	
	/**
	 * @return the codiceStato
	 */
	public String getCodiceStato() {
		return codiceStato;
	}

	/**
	 * @param codiceStato the codiceStato to set
	 */
	public void setCodiceStato(String codiceStato) {
		this.codiceStato = codiceStato;
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
	 * @return the codiceSoggetto
	 */
	public String getCodiceSoggetto() {
		return codiceSoggetto;
	}

	/**
	 * @param codiceSoggetto the codiceSoggetto to set
	 */
	public void setCodiceSoggetto(String codiceSoggetto) {
		this.codiceSoggetto = codiceSoggetto;
	}

	/**
	 * @return the denominazioneSoggetto
	 */
	public String getDenominazioneSoggetto() {
		return denominazioneSoggetto;
	}

	/**
	 * @param denominazioneSoggetto the denominazioneSoggetto to set
	 */
	public void setDenominazioneSoggetto(String denominazioneSoggetto) {
		this.denominazioneSoggetto = denominazioneSoggetto;
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
	 * @return the dataQuietanza
	 */
	public Date getDataQuietanza() {
		return dataQuietanza;
	}

	/**
	 * @param dataQuietanza the dataQuietanza to set
	 */
	public void setDataQuietanza(Date dataQuietanza) {
		this.dataQuietanza = dataQuietanza;
	}


}
