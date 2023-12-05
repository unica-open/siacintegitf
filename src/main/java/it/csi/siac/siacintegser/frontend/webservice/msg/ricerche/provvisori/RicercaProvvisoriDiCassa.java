/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.provvisori;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataRequest;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.enumeration.SiNoEnum;
import it.csi.siac.siacintegser.model.enumeration.SiNoIndifferenteEnum;
import it.csi.siac.siacintegser.model.enumeration.TipoProvvisorioDiCassa;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaProvvisoriDiCassa extends RicercaPaginataRequest {

	private Integer numeroQuietanza;
	private String descrizioneCausale;
	
	private Date dataDa;
	private Date dataA;
	
	private BigDecimal importoDa;
	private BigDecimal importoA;
	
	
	private TipoProvvisorioDiCassa tipoProvvisorioDiCassa;
	private SiNoIndifferenteEnum annullato;
	private SiNoEnum daRegolarizzare;
	
	private Integer numeroProvvisorio;
	
	public Integer getNumeroQuietanza() {
		return numeroQuietanza;
	}
	public Integer getNumeroProvvisorio() {
		return numeroProvvisorio;
	}
	public void setNumeroProvvisorio(Integer numeroProvvisorio) {
		this.numeroProvvisorio = numeroProvvisorio;
	}
	public void setNumeroQuietanza(Integer numeroQuietanza) {
		this.numeroQuietanza = numeroQuietanza;
	}
	public String getDescrizioneCausale() {
		return descrizioneCausale;
	}
	public void setDescrizioneCausale(String descrizioneCausale) {
		this.descrizioneCausale = descrizioneCausale;
	}
	public Date getDataDa() {
		return dataDa;
	}
	public void setDataDa(Date dataDa) {
		this.dataDa = dataDa;
	}
	public Date getDataA() {
		return dataA;
	}
	public void setDataA(Date dataA) {
		this.dataA = dataA;
	}
	public BigDecimal getImportoDa() {
		return importoDa;
	}
	public void setImportoDa(BigDecimal importoDa) {
		this.importoDa = importoDa;
	}
	public BigDecimal getImportoA() {
		return importoA;
	}
	public void setImportoA(BigDecimal importoA) {
		this.importoA = importoA;
	}
	public TipoProvvisorioDiCassa getTipoProvvisorioDiCassa() {
		return tipoProvvisorioDiCassa;
	}
	public void setTipoProvvisorioDiCassa(
			TipoProvvisorioDiCassa tipoProvvisorioDiCassa) {
		this.tipoProvvisorioDiCassa = tipoProvvisorioDiCassa;
	}
	public SiNoIndifferenteEnum getAnnullato() {
		return annullato;
	}
	public void setAnnullato(SiNoIndifferenteEnum annullato) {
		this.annullato = annullato;
	}
	public SiNoEnum getDaRegolarizzare() {
		return daRegolarizzare;
	}
	public void setDaRegolarizzare(SiNoEnum daRegolarizzare) {
		this.daRegolarizzare = daRegolarizzare;
	}
	
}
