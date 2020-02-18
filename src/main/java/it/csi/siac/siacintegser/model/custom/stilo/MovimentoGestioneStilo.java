/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.stilo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.Capitolo;
import it.csi.siac.siacintegser.model.integ.Categoria;
import it.csi.siac.siacintegser.model.integ.ClassificatoreGenerico;
import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;
import it.csi.siac.siacintegser.model.integ.Macroaggregato;
import it.csi.siac.siacintegser.model.integ.Missione;
import it.csi.siac.siacintegser.model.integ.PianoDeiContiFinanziario;
import it.csi.siac.siacintegser.model.integ.Programma;
import it.csi.siac.siacintegser.model.integ.TipoFinanziamento;
import it.csi.siac.siacintegser.model.integ.Tipologia;
import it.csi.siac.siacintegser.model.integ.Titolo;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class MovimentoGestioneStilo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4272177589984709293L;
	
	private String tipoMovimentoGestione;
	private BigDecimal numeroImpegno;
	private BigDecimal numeroAccertamento;
	private BigDecimal numeroSubImpegno;
	private BigDecimal numeroSubAccertamento;
	private Integer numeroModifica;
	
	private BigDecimal importoInizialeImpegno;
	private BigDecimal importoAttualeImpegno;
	private BigDecimal importoInizialeAccertamento;
	private BigDecimal importoAttualeAccertamento;
	private BigDecimal importoInizialeSubImpegno;
	private BigDecimal importoAttualeSubImpegno;
	private BigDecimal importoInizialeSubAccertamento;
	private BigDecimal importoAttualeSubAccertamento;
	private BigDecimal importoModifica;
	
	private String descrizioneImpegno;
	private String descrizioneAccertamento;
	private String descrizioneSubImpegno;
	private String descrizioneSubAccertamento;
	private String descrizioneModifica;

	private Integer annoCompetenza;
	private Integer annoCompetenzaSubImpegno;
	private Integer annoCompetenzaSubAccertamento;
	private Integer annoCompetenzaModifica;
	
	
	
	private Capitolo capitolo;
	private Macroaggregato macroaggregato;
	private PianoDeiContiFinanziario pianoDeiContiFinanziario;
	private TipoFinanziamento tipoFinanziamento;
	private Programma programma;
	private Missione missione;
	private Titolo titolo;
	private ClassificatoreGenerico cofog;
	private ClassificatoreGenerico gsa;
	private ClassificatoreGenerico naturaRicorrente;
	private ClassificatoreGenerico codUE;
	private Categoria categoria;
	private Tipologia tipologia;
	
	private VincoliStilo vincoli;
	
	private String cup;
	private String cig;
	private String motivoAssenzaCig;
	private String codiceSoggetto;
	private String classeSoggetto;
	
	
	
	/**
	 * @return the vincoli
	 */
	public VincoliStilo getVincoli() {
		return vincoli;
	}
	/**
	 * @param vincoli the vincoli to set
	 */
	public void setVincoli(VincoliStilo vincoli) {
		this.vincoli = vincoli;
	}
	/**
	 * @return the tipoMovimento
	 */
	public String getTipoMovimentoGestione() {
		return tipoMovimentoGestione;
	}
	/**
	 * @param tipoMovimento the tipoMovimento to set
	 */
	public void setTipoMovimentoGestione(String tipoMovimentoGestione) {
		this.tipoMovimentoGestione = tipoMovimentoGestione;
	}
	/**
	 * @return the numeroImpegno
	 */
	public BigDecimal getNumeroImpegno() {
		return numeroImpegno;
	}
	/**
	 * @param numeroImpegno the numeroImpegno to set
	 */
	public void setNumeroImpegno(BigDecimal numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}
	/**
	 * @return the numeroAccertamento
	 */
	public BigDecimal getNumeroAccertamento() {
		return numeroAccertamento;
	}
	/**
	 * @param numeroAccertamento the numeroAccertamento to set
	 */
	public void setNumeroAccertamento(BigDecimal numeroAccertamento) {
		this.numeroAccertamento = numeroAccertamento;
	}
	/**
	 * @return the numeroSubImpegno
	 */
	public BigDecimal getNumeroSubImpegno() {
		return numeroSubImpegno;
	}
	/**
	 * @param numeroSubImpegno the numeroSubImpegno to set
	 */
	public void setNumeroSubImpegno(BigDecimal numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}
	/**
	 * @return the numeroSubAccertamento
	 */
	public BigDecimal getNumeroSubAccertamento() {
		return numeroSubAccertamento;
	}
	/**
	 * @param numeroSubAccertamento the numeroSubAccertamento to set
	 */
	public void setNumeroSubAccertamento(BigDecimal numeroSubAccertamento) {
		this.numeroSubAccertamento = numeroSubAccertamento;
	}
	
	/**
	 * @return the importoInizialeImpegno
	 */
	public BigDecimal getImportoInizialeImpegno() {
		return importoInizialeImpegno;
	}
	/**
	 * @param importoInizialeImpegno the importoInizialeImpegno to set
	 */
	public void setImportoInizialeImpegno(BigDecimal importoInizialeImpegno) {
		this.importoInizialeImpegno = importoInizialeImpegno;
	}
	/**
	 * @return the importoAttualeImpegno
	 */
	public BigDecimal getImportoAttualeImpegno() {
		return importoAttualeImpegno;
	}
	/**
	 * @param importoAttualeImpegno the importoAttualeImpegno to set
	 */
	public void setImportoAttualeImpegno(BigDecimal importoAttualeImpegno) {
		this.importoAttualeImpegno = importoAttualeImpegno;
	}
	/**
	 * @return the importoInizialeAccertamento
	 */
	public BigDecimal getImportoInizialeAccertamento() {
		return importoInizialeAccertamento;
	}
	/**
	 * @param importoInizialeAccertamento the importoInizialeAccertamento to set
	 */
	public void setImportoInizialeAccertamento(BigDecimal importoInizialeAccertamento) {
		this.importoInizialeAccertamento = importoInizialeAccertamento;
	}
	/**
	 * @return the importoAttualeAccertamento
	 */
	public BigDecimal getImportoAttualeAccertamento() {
		return importoAttualeAccertamento;
	}
	/**
	 * @param importoAttualeAccertamento the importoAttualeAccertamento to set
	 */
	public void setImportoAttualeAccertamento(BigDecimal importoAttualeAccertamento) {
		this.importoAttualeAccertamento = importoAttualeAccertamento;
	}
	/**
	 * @return the importoInizialeSubImpegno
	 */
	public BigDecimal getImportoInizialeSubImpegno() {
		return importoInizialeSubImpegno;
	}
	/**
	 * @param importoInizialeSubImpegno the importoInizialeSubImpegno to set
	 */
	public void setImportoInizialeSubImpegno(BigDecimal importoInizialeSubImpegno) {
		this.importoInizialeSubImpegno = importoInizialeSubImpegno;
	}
	/**
	 * @return the importoAttualeSubImpegno
	 */
	public BigDecimal getImportoAttualeSubImpegno() {
		return importoAttualeSubImpegno;
	}
	/**
	 * @param importoAttualeSubImpegno the importoAttualeSubImpegno to set
	 */
	public void setImportoAttualeSubImpegno(BigDecimal importoAttualeSubImpegno) {
		this.importoAttualeSubImpegno = importoAttualeSubImpegno;
	}
	/**
	 * @return the importoInizialeSubAccertamento
	 */
	public BigDecimal getImportoInizialeSubAccertamento() {
		return importoInizialeSubAccertamento;
	}
	/**
	 * @param importoInizialeSubAccertamento the importoInizialeSubAccertamento to set
	 */
	public void setImportoInizialeSubAccertamento(BigDecimal importoInizialeSubAccertamento) {
		this.importoInizialeSubAccertamento = importoInizialeSubAccertamento;
	}
	/**
	 * @return the importoAttualeSubAccertamento
	 */
	public BigDecimal getImportoAttualeSubAccertamento() {
		return importoAttualeSubAccertamento;
	}
	/**
	 * @param importoAttualeSubAccertamento the importoAttualeSubAccertamento to set
	 */
	public void setImportoAttualeSubAccertamento(BigDecimal importoAttualeSubAccertamento) {
		this.importoAttualeSubAccertamento = importoAttualeSubAccertamento;
	}
	/**
	 * @return the importoModifica
	 */
	public BigDecimal getImportoModifica() {
		return importoModifica;
	}
	/**
	 * @param importoModifica the importoModifica to set
	 */
	public void setImportoModifica(BigDecimal importoModifica) {
		this.importoModifica = importoModifica;
	}
	/**
	 * @return the descrizioneImpegno
	 */
	public String getDescrizioneImpegno() {
		return descrizioneImpegno;
	}
	/**
	 * @param descrizioneImpegno the descrizioneImpegno to set
	 */
	public void setDescrizioneImpegno(String descrizioneImpegno) {
		this.descrizioneImpegno = descrizioneImpegno;
	}
	/**
	 * @return the descrizioneAccertamento
	 */
	public String getDescrizioneAccertamento() {
		return descrizioneAccertamento;
	}
	/**
	 * @param descrizioneAccertamento the descrizioneAccertamento to set
	 */
	public void setDescrizioneAccertamento(String descrizioneAccertamento) {
		this.descrizioneAccertamento = descrizioneAccertamento;
	}
	/**
	 * @return the descrizioneSubImpegno
	 */
	public String getDescrizioneSubImpegno() {
		return descrizioneSubImpegno;
	}
	/**
	 * @param descrizioneSubImpegno the descrizioneSubImpegno to set
	 */
	public void setDescrizioneSubImpegno(String descrizioneSubImpegno) {
		this.descrizioneSubImpegno = descrizioneSubImpegno;
	}
	/**
	 * @return the descrizioneSubAccertamento
	 */
	public String getDescrizioneSubAccertamento() {
		return descrizioneSubAccertamento;
	}
	/**
	 * @param descrizioneSubAccertamento the descrizioneSubAccertamento to set
	 */
	public void setDescrizioneSubAccertamento(String descrizioneSubAccertamento) {
		this.descrizioneSubAccertamento = descrizioneSubAccertamento;
	}
	/**
	 * @return the descrizioneModifica
	 */
	public String getDescrizioneModifica() {
		return descrizioneModifica;
	}
	/**
	 * @param descrizioneModifica the descrizioneModifica to set
	 */
	public void setDescrizioneModifica(String descrizioneModifica) {
		this.descrizioneModifica = descrizioneModifica;
	}
	/**
	 * @return the numeroModifica
	 */
	public Integer getNumeroModifica() {
		return numeroModifica;
	}
	/**
	 * @param numeroModifica the numeroModifica to set
	 */
	public void setNumeroModifica(Integer numeroModifica) {
		this.numeroModifica = numeroModifica;
	}
	/**
	 * @return the macroaggregato
	 */
	public Macroaggregato getMacroaggregato() {
		return macroaggregato;
	}
	/**
	 * @param macroaggregato the macroaggregato to set
	 */
	public void setMacroaggregato(Macroaggregato macroaggregato) {
		this.macroaggregato = macroaggregato;
	}
	/**
	 * @return the capitolo
	 */
	public Capitolo getCapitolo() {
		return capitolo;
	}
	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}
	/**
	 * @return the pianoDeiContiFinanziario
	 */
	public PianoDeiContiFinanziario getPianoDeiContiFinanziario() {
		return pianoDeiContiFinanziario;
	}
	/**
	 * @param pianoDeiContiFinanziario the pianoDeiContiFinanziario to set
	 */
	public void setPianoDeiContiFinanziario(PianoDeiContiFinanziario pianoDeiContiFinanziario) {
		this.pianoDeiContiFinanziario = pianoDeiContiFinanziario;
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
	/**
	 * @return the programma
	 */
	public Programma getProgramma() {
		return programma;
	}
	/**
	 * @param programma the programma to set
	 */
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}
	/**
	 * @return the missione
	 */
	public Missione getMissione() {
		return missione;
	}
	/**
	 * @param missione the missione to set
	 */
	public void setMissione(Missione missione) {
		this.missione = missione;
	}
	/**
	 * @return the titolo
	 */
	public Titolo getTitolo() {
		return titolo;
	}
	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(Titolo titolo) {
		this.titolo = titolo;
	}
	/**
	 * @return the cofog
	 */
	public ClassificatoreGenerico getCofog() {
		return cofog;
	}
	/**
	 * @param cofog the cofog to set
	 */
	public void setCofog(ClassificatoreGenerico cofog) {
		this.cofog = cofog;
	}
	/**
	 * @return the gsa
	 */
	public ClassificatoreGenerico getGsa() {
		return gsa;
	}
	/**
	 * @param gsa the gsa to set
	 */
	public void setGsa(ClassificatoreGenerico gsa) {
		this.gsa = gsa;
	}
	
	/**
	 * @return the annoCompetenza
	 */
	public Integer getAnnoCompetenza() {
		return annoCompetenza;
	}
	/**
	 * @param annoCompetenza the annoCompetenza to set
	 */
	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}
	/**
	 * @return the annoCompetenzaSubImpegno
	 */
	public Integer getAnnoCompetenzaSubImpegno() {
		return annoCompetenzaSubImpegno;
	}
	/**
	 * @param annoCompetenzaSubImpegno the annoCompetenzaSubImpegno to set
	 */
	public void setAnnoCompetenzaSubImpegno(Integer annoCompetenzaSubImpegno) {
		this.annoCompetenzaSubImpegno = annoCompetenzaSubImpegno;
	}
	/**
	 * @return the annoCompetenzaSubAccertamento
	 */
	public Integer getAnnoCompetenzaSubAccertamento() {
		return annoCompetenzaSubAccertamento;
	}
	/**
	 * @param annoCompetenzaSubAccertamento the annoCompetenzaSubAccertamento to set
	 */
	public void setAnnoCompetenzaSubAccertamento(Integer annoCompetenzaSubAccertamento) {
		this.annoCompetenzaSubAccertamento = annoCompetenzaSubAccertamento;
	}
	/**
	 * @return the annoCompetenzaModifica
	 */
	public Integer getAnnoCompetenzaModifica() {
		return annoCompetenzaModifica;
	}
	/**
	 * @param annoCompetenzaModifica the annoCompetenzaModifica to set
	 */
	public void setAnnoCompetenzaModifica(Integer annoCompetenzaModifica) {
		this.annoCompetenzaModifica = annoCompetenzaModifica;
	}
	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the tipologia
	 */
	public Tipologia getTipologia() {
		return tipologia;
	}
	/**
	 * @param tipologia the tipologia to set
	 */
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}
	/**
	 * @return the codUE
	 */
	public ClassificatoreGenerico getCodUE() {
		return codUE;
	}
	/**
	 * @param codUE the codUE to set
	 */
	public void setCodUE(ClassificatoreGenerico codUE) {
		this.codUE = codUE;
	}
	/**
	 * @return the naturaRicorrente
	 */
	public ClassificatoreGenerico getNaturaRicorrente() {
		return naturaRicorrente;
	}
	/**
	 * @param naturaRicorrente the naturaRicorrente to set
	 */
	public void setNaturaRicorrente(ClassificatoreGenerico naturaRicorrente) {
		this.naturaRicorrente = naturaRicorrente;
	}
	/**
	 * @return the cup
	 */
	public String getCup() {
		return cup;
	}
	/**
	 * @return the cig
	 */
	public String getCig() {
		return cig;
	}
	/**
	 * @return the motivoAssenzaCig
	 */
	public String getMotivoAssenzaCig() {
		return motivoAssenzaCig;
	}
	/**
	 * @return the codiceSoggetto
	 */
	public String getCodiceSoggetto() {
		return codiceSoggetto;
	}
	/**
	 * @return the classeSoggetto
	 */
	public String getClasseSoggetto() {
		return classeSoggetto;
	}
	/**
	 * @param cup the cup to set
	 */
	public void setCup(String cup) {
		this.cup = cup;
	}
	/**
	 * @param cig the cig to set
	 */
	public void setCig(String cig) {
		this.cig = cig;
	}
	/**
	 * @param motivoAssenzaCig the motivoAssenzaCig to set
	 */
	public void setMotivoAssenzaCig(String motivoAssenzaCig) {
		this.motivoAssenzaCig = motivoAssenzaCig;
	}
	/**
	 * @param codiceSoggetto the codiceSoggetto to set
	 */
	public void setCodiceSoggetto(String codiceSoggetto) {
		this.codiceSoggetto = codiceSoggetto;
	}
	/**
	 * @param classeSoggetto the classeSoggetto to set
	 */
	public void setClasseSoggetto(String classeSoggetto) {
		this.classeSoggetto = classeSoggetto;
	}


}
