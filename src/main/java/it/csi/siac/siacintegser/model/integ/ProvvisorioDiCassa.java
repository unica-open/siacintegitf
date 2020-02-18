/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;
import it.csi.siac.siacintegser.model.enumeration.SiNoEnum;
import it.csi.siac.siacintegser.model.enumeration.TipoProvvisorioDiCassa;
import it.csi.siac.siacintegser.model.ricerche.RicercheDataDictionary;

@XmlType(namespace = RicercheDataDictionary.NAMESPACE)
public class ProvvisorioDiCassa extends EntitaCodificataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -668291817795934968L;

	private Integer numero;
	// descrizione causale
	private String causale;
	private Date data;
	private BigDecimal importo;
	private BigDecimal importoDaRegolarizzare;
	private BigDecimal importoDaEmettere;
	private Integer anno;
	
	
	public BigDecimal getImportoDaRegolarizzare() {
		return importoDaRegolarizzare;
	}
	public void setImportoDaRegolarizzare(BigDecimal importoDaRegolarizzare) {
		this.importoDaRegolarizzare = importoDaRegolarizzare;
	}
	public BigDecimal getImportoDaEmettere() {
		return importoDaEmettere;
	}
	public void setImportoDaEmettere(BigDecimal importoDaEmettere) {
		this.importoDaEmettere = importoDaEmettere;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	private SiNoEnum annullato;
	private TipoProvvisorioDiCassa tipoProvvisorioDiCassa;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCausale() {
		return causale;
	}
	public void setCausale(String causale) {
		this.causale = causale;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public SiNoEnum getAnnullato() {
		return annullato;
	}
	public void setAnnullato(SiNoEnum annullato) {
		this.annullato = annullato;
	}
	public TipoProvvisorioDiCassa getTipoProvvisorioDiCassa() {
		return tipoProvvisorioDiCassa;
	}
	public void setTipoProvvisorioDiCassa(
			TipoProvvisorioDiCassa tipoProvvisorioDiCassa) {
		this.tipoProvvisorioDiCassa = tipoProvvisorioDiCassa;
	}
	
}
