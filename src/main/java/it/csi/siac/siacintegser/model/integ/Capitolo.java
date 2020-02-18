/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Capitolo extends EntitaBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;
	
	private String codice;

	private Integer annoEsercizio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	private String descrizione;
	private String descrizioneArticolo;

	private StrutturaAmministrativa sac;

	private PianoDeiContiFinanziario pianoDeiContiFinanziario;
	private List<ClassificatoreGenerico> classificatoriGenerici;
	private Boolean rilevanteIva;
	private Titolo titolo;
	private TipoFondo tipoFondo;
	private TipoFinanziamento tipoFinanziamento;

	/**
	 * @return the titolo
	 */
	public Titolo getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo
	 *            the titolo to set
	 */
	public void setTitolo(Titolo titolo) {
		this.titolo = titolo;
	}


	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	/**
	 * @param annoEsercizio
	 *            the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
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
	 * @return the sac
	 */
	public StrutturaAmministrativa getSac() {
		return sac;
	}

	/**
	 * @param sac
	 *            the sac to set
	 */
	public void setSac(StrutturaAmministrativa sac) {
		this.sac = sac;
	}

	/**
	 * @return the pianoDeiContiFinanziario
	 */
	public PianoDeiContiFinanziario getPianoDeiContiFinanziario() {
		return pianoDeiContiFinanziario;
	}

	/**
	 * @param pianoDeiContiFinanziario
	 *            the pianoDeiContiFinanziario to set
	 */
	public void setPianoDeiContiFinanziario(
			PianoDeiContiFinanziario pianoDeiContiFinanziario) {
		this.pianoDeiContiFinanziario = pianoDeiContiFinanziario;
	}

	/**
	 * @return the classificatoriGenerici
	 */
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return classificatoriGenerici;
	}

	/**
	 * @param classificatoriGenerici
	 *            the classificatoriGenerici to set
	 */
	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> classificatoriGenerici) {
		this.classificatoriGenerici = classificatoriGenerici;
	}

	@Override
	public String getCodice() {
		return codice = String.format("%d-%d-%d", numeroCapitolo, numeroArticolo, numeroUEB);
	}

	@Override
	public void setCodice(String codice) {
		this.codice = codice;
		
	}

	/**
	 * @return the descrizioneArticolo
	 */
	public String getDescrizioneArticolo() {
		return descrizioneArticolo;
	}

	/**
	 * @param descrizioneArticolo the descrizioneArticolo to set
	 */
	public void setDescrizioneArticolo(String descrizioneArticolo) {
		this.descrizioneArticolo = descrizioneArticolo;
	}

	/**
	 * @return the rilevanteIva
	 */
	public Boolean getRilevanteIva() {
		return rilevanteIva;
	}

	/**
	 * @param rilevanteIva the rilevanteIva to set
	 */
	public void setRilevanteIva(Boolean rilevanteIva) {
		this.rilevanteIva = rilevanteIva;
	}

	/**
	 * @return the tipoFondo
	 */
	public TipoFondo getTipoFondo() {
		return tipoFondo;
	}

	/**
	 * @param tipoFondo the tipoFondo to set
	 */
	public void setTipoFondo(TipoFondo tipoFondo) {
		this.tipoFondo = tipoFondo;
	}

	/**
	 * @return the tipoFinanziamento
	 */
	public TipoFinanziamento getTipoFinanziamento() {
		return tipoFinanziamento;
	}

	/**
	 * @param tipoFinanziamento the tipoFinanziamento to set
	 */
	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
	}

	
	
	

}
