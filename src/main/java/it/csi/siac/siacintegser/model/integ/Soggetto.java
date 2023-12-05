/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Soggetto extends EntitaBase {
	private static final long serialVersionUID = 3461601375720661025L;

	private String codice;
	private NaturaGiuridica naturaGiuridica;
	private Sesso sesso;
	private String codiceFiscale;
	private String codiceFiscaleEstero;
	private String partitaIva;
	private String cognome;
	private String nome;
	private Date dataNascita;
	private String ragioneSociale;
	private Contatti contatti;
	private Recapito indirizzoPrincipale;
	private List<Sede> elencoSedi = new ArrayList<Sede>();
	private List<ModalitaPagamento> elencoModalitaPagamento = new ArrayList<ModalitaPagamento>();
	private List<String> codiciSoggettiCollegatiPrecedenti;
	private List<String> codiciSoggettiCollegatiSuccessivi;

	public NaturaGiuridica getNaturaGiuridica() {
		return naturaGiuridica;
	}

	public void setNaturaGiuridica(NaturaGiuridica naturaGiuridica) {
		this.naturaGiuridica = naturaGiuridica;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscaleEstero() {
		return codiceFiscaleEstero;
	}

	public void setCodiceFiscaleEstero(String codiceFiscaleEstero) {
		this.codiceFiscaleEstero = codiceFiscaleEstero;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Contatti getContatti() {
		return contatti;
	}

	public void setContatti(Contatti contatti) {
		this.contatti = contatti;
	}

	public Recapito getIndirizzoPrincipale() {
		return indirizzoPrincipale;
	}

	public void setIndirizzoPrincipale(Recapito indirizzoPrincipale) {
		this.indirizzoPrincipale = indirizzoPrincipale;
	}

	public List<Sede> getElencoSedi() {
		return elencoSedi;
	}

	public void setElencoSedi(List<Sede> elencoSedi) {
		this.elencoSedi = elencoSedi;
	}

	public List<ModalitaPagamento> getElencoModalitaPagamento() {
		return elencoModalitaPagamento;
	}

	public void setElencoModalitaPagamento(List<ModalitaPagamento> elencoModalitaPagamento) {
		this.elencoModalitaPagamento = elencoModalitaPagamento;
	}

	public List<String> getCodiciSoggettiCollegatiPrecedenti() {
		return codiciSoggettiCollegatiPrecedenti;
	}

	public void setCodiciSoggettiCollegatiPrecedenti(List<String> codiciSoggettiCollegatiPrecedenti) {
		this.codiciSoggettiCollegatiPrecedenti = codiciSoggettiCollegatiPrecedenti;
	}

	public List<String> getCodiciSoggettiCollegatiSuccessivi() {
		return codiciSoggettiCollegatiSuccessivi;
	}

	public void setCodiciSoggettiCollegatiSuccessivi(List<String> codiciSoggettiCollegatiSuccessivi) {
		this.codiciSoggettiCollegatiSuccessivi = codiciSoggettiCollegatiSuccessivi;
	}

	@Override
	public String getCodice() {
		return codice;
	}

	//@Override
	public void setCodice(String codice) {
		this.codice = codice;
	}
}
