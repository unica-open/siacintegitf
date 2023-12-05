/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Recapito extends EntitaBase {
	private static final long serialVersionUID = -2355865569540840764L;

	private String sedime;
	private String indirizzo;
	private String numeroCivico;
	private String cap;
	private String comune;
	private String provincia;
	private String codiceIstatComune;
	private String codiceNazione;
	private String descrizioneNazione;

	public String getSedime() {
		return sedime;
	}

	public void setSedime(String sedime) {
		this.sedime = sedime;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCodiceNazione() {
		return codiceNazione;
	}

	public void setCodiceNazione(String codiceNazione) {
		this.codiceNazione = codiceNazione;
	}

	public String getDescrizioneNazione() {
		return descrizioneNazione;
	}

	public void setDescrizioneNazione(String descrizioneNazione) {
		this.descrizioneNazione = descrizioneNazione;
	}

	@Override
	public String getCodice() {
		return null;
	}

//	@Override
//	public void setCodice(String codice) {
//		// Codice non presente
//	}
//
	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getCodiceIstatComune() {
		return codiceIstatComune;
	}

	public void setCodiceIstatComune(String codiceIstatComune) {
		this.codiceIstatComune = codiceIstatComune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
