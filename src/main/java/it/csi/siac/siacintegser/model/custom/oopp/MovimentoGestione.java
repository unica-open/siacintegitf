/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.Capitolo;
import it.csi.siac.siacintegser.model.integ.ClasseSoggetto;
import it.csi.siac.siacintegser.model.integ.Cofog;
import it.csi.siac.siacintegser.model.integ.NaturaRicorrente;
import it.csi.siac.siacintegser.model.integ.PianoDeiContiFinanziario;
import it.csi.siac.siacintegser.model.integ.Soggetto;
import it.csi.siac.siacintegser.model.integ.TransazioneUnioneEuropea;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class MovimentoGestione extends BaseMovimentoGestione {

	private static final long serialVersionUID = -8418823162649643956L;

	private Integer annoBilancio;
	private BigDecimal importoIniziale;
	private BigDecimal importoAttuale;
	private String motivoAssenzaCig;
	private TransazioneUnioneEuropea transazioneUnioneEuropeaEntrata;
	private TransazioneUnioneEuropea transazioneUnioneEuropeaSpesa;
	private Capitolo capitolo;
	private Soggetto soggetto;
	private ClasseSoggetto classeSoggetto;
	private NaturaRicorrente naturaRicorrenteEntrata;
	private NaturaRicorrente naturaRicorrenteSpesa;
	private PianoDeiContiFinanziario pianoDeiContiFinanziario;
	private Boolean rilevanteGsa;
	private Boolean prenotazioneImpegno;
	private Provvedimento provvedimento;
	private Riaccertamento riaccertamento;
	private Cofog cofog;
	
	@XmlElementWrapper(name="vincoliImpegno")
	@XmlElement(name="vincoloImpegno")
	private List<Vincolo> elencoVincoliImpegno = new ArrayList<Vincolo>();
	
	private String cig;
	private String cup;
	private Ridcoi ridcoi;

	@XmlElementWrapper(name="subMovimentiGestione")
	@XmlElement(name="subMovimentoGestione")
	private List<SubMovimentoGestione> elencoSubMovimentiGestione = new ArrayList<SubMovimentoGestione>();

	
	public Capitolo getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}

	public BigDecimal getImportoIniziale() {
		return importoIniziale;
	}

	public void setImportoIniziale(BigDecimal importoIniziale) {
		this.importoIniziale = importoIniziale;
	}

	public BigDecimal getImportoAttuale() {
		return importoAttuale;
	}

	public void setImportoAttuale(BigDecimal importoAttuale) {
		this.importoAttuale = importoAttuale;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	public ClasseSoggetto getClasseSoggetto() {
		return classeSoggetto;
	}

	public void setClasseSoggetto(ClasseSoggetto classeSoggetto) {
		this.classeSoggetto = classeSoggetto;
	}

	@XmlTransient
	public List<Vincolo> getElencoVincoliImpegno() {
		return elencoVincoliImpegno;
	}

	public void setElencoVincoliImpegno(List<Vincolo> elencoVincoliImpegno) {
		this.elencoVincoliImpegno = elencoVincoliImpegno;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public TransazioneUnioneEuropea getTransazioneUnioneEuropeaEntrata() {
		return transazioneUnioneEuropeaEntrata;
	}

	public void setTransazioneUnioneEuropeaEntrata(TransazioneUnioneEuropea transazioneUnioneEuropeaEntrata) {
		this.transazioneUnioneEuropeaEntrata = transazioneUnioneEuropeaEntrata;
	}

	public TransazioneUnioneEuropea getTransazioneUnioneEuropeaSpesa() {
		return transazioneUnioneEuropeaSpesa;
	}

	public void setTransazioneUnioneEuropeaSpesa(TransazioneUnioneEuropea transazioneUnioneEuropeaSpesa) {
		this.transazioneUnioneEuropeaSpesa = transazioneUnioneEuropeaSpesa;
	}

	public String getMotivoAssenzaCig() {
		return motivoAssenzaCig;
	}

	public void setMotivoAssenzaCig(String motivoAssenzaCig) {
		this.motivoAssenzaCig = motivoAssenzaCig;
	}

	public NaturaRicorrente getNaturaRicorrenteEntrata() {
		return naturaRicorrenteEntrata;
	}

	public void setNaturaRicorrenteEntrata(NaturaRicorrente naturaRicorrenteEntrata) {
		this.naturaRicorrenteEntrata = naturaRicorrenteEntrata;
	}

	public NaturaRicorrente getNaturaRicorrenteSpesa() {
		return naturaRicorrenteSpesa;
	}

	public void setNaturaRicorrenteSpesa(NaturaRicorrente naturaRicorrenteSpesa) {
		this.naturaRicorrenteSpesa = naturaRicorrenteSpesa;
	}

	public PianoDeiContiFinanziario getPianoDeiContiFinanziario() {
		return pianoDeiContiFinanziario;
	}

	public void setPianoDeiContiFinanziario(PianoDeiContiFinanziario pianoDeiContiFinanziario) {
		this.pianoDeiContiFinanziario = pianoDeiContiFinanziario;
	}

	public Boolean getRilevanteGsa() {
		return rilevanteGsa;
	}

	public void setRilevanteGsa(Boolean rilevanteGsa) {
		this.rilevanteGsa = rilevanteGsa;
	}

	public Provvedimento getProvvedimento() {
		return provvedimento;
	}

	public void setProvvedimento(Provvedimento provvedimento) {
		this.provvedimento = provvedimento;
	}

	public Riaccertamento getRiaccertamento() {
		return riaccertamento;
	}

	public void setRiaccertamento(Riaccertamento riaccertamento) {
		this.riaccertamento = riaccertamento;
	}

	@XmlTransient
	public List<SubMovimentoGestione> getElencoSubMovimentiGestione() {
		return elencoSubMovimentiGestione;
	}

	public void setElencoSubMovimentiGestione(List<SubMovimentoGestione> elencoSubMovimentiGestione) {
		this.elencoSubMovimentiGestione = elencoSubMovimentiGestione;
	}

	public Integer getAnnoBilancio() {
		return annoBilancio;
	}

	public void setAnnoBilancio(Integer annoBilancio) {
		this.annoBilancio = annoBilancio;
	}

	public Cofog getCofog() {
		return cofog;
	}

	public void setCofog(Cofog cofog) {
		this.cofog = cofog;
	}

	public Ridcoi getRidcoi() {
		return ridcoi;
	}

	public void setRidcoi(Ridcoi ridcoi) {
		this.ridcoi = ridcoi;
	}

	public Boolean getPrenotazioneImpegno() {
		return prenotazioneImpegno;
	}

	public void setPrenotazioneImpegno(Boolean prenotazioneImpegno) {
		this.prenotazioneImpegno = prenotazioneImpegno;
	}

}
