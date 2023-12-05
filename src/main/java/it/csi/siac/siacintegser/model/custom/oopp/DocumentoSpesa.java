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

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;
import it.csi.siac.siacintegser.model.integ.Soggetto;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class DocumentoSpesa extends EntitaCodificataBase {
	public DocumentoSpesa() {
		super();
	}

	private static final long serialVersionUID = 3947613972173565082L;

	private Integer anno;
	private String numero;
	private String descrizione;
	private String tipo;
	private BigDecimal importo;
	private BigDecimal importoNetto;
	private BigDecimal arrotondamento;
	private String numeroRepertorio;
	private String registroRepertorio;
	private Soggetto soggetto;
	private Date dataEmissione;

	@XmlElementWrapper(name = "elencoCig")
	@XmlElement(name = "cig")
	private List<String> elencoCig;

	@XmlElementWrapper(name = "ordini")
	@XmlElement(name = "ordine")
	private List<Ordine> elencoOrdini = new ArrayList<Ordine>();

	@XmlElementWrapper(name = "mandati")
	@XmlElement(name = "mandato")
	private List<Mandato> elencoMandati = new ArrayList<Mandato>();

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public BigDecimal getImportoNetto() {
		return importoNetto;
	}

	public void setImportoNetto(BigDecimal importoNetto) {
		this.importoNetto = importoNetto;
	}

	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}

	public String getRegistroRepertorio() {
		return registroRepertorio;
	}

	public void setRegistroRepertorio(String registroRepertorio) {
		this.registroRepertorio = registroRepertorio;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	@XmlTransient
	public List<Ordine> getElencoOrdini() {
		return elencoOrdini;
	}

	public void setElencoOrdini(List<Ordine> elencoOrdini) {
		this.elencoOrdini = elencoOrdini;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumeroRepertorio() {
		return numeroRepertorio;
	}

	public void setNumeroRepertorio(String numeroRepertorio) {
		this.numeroRepertorio = numeroRepertorio;
	}

	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@XmlTransient
	public List<Mandato> getElencoMandati() {
		return elencoMandati;
	}

	public void setElencoMandati(List<Mandato> elencoMandati) {
		this.elencoMandati = elencoMandati;
	}

	@XmlTransient
	public List<String> getElencoCig() {
		return elencoCig;
	}

	public void setElencoCig(List<String> elencoCig) {
		this.elencoCig = elencoCig;
	}

}
