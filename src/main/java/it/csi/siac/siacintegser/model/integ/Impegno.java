/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Impegno extends MovimentoGestione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	private Integer numeroImpegno;
	private Integer annoImpegno;
	
	private Integer annoImpegnoOrigine;
	private Integer numImpegnoOrigine;
	
	private Integer annoImpegnoRiaccertato;
	private Integer numImpegnoRiaccertato;
	
	private BigDecimal disponibilitaLiquidare;
	
	private List<SubImpegno> subImpegni = new ArrayList<SubImpegno>();
	
	String tipoImpegno;
	
	
	/**
	 * @return the numeroImpegno
	 */
	public Integer getNumeroImpegno() {
		return numeroImpegno;
	}

	/**
	 * @param numeroImpegno
	 *            the numeroImpegno to set
	 */
	public void setNumeroImpegno(Integer numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	/**
	 * @return the annoImpegno
	 */
	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	/**
	 * @param annoImpegno
	 *            the annoImpegno to set
	 */
	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	/**
	 * @return the subImpegni
	 */
	public List<SubImpegno> getSubImpegni() {
		return subImpegni;
	}

	/**
	 * @param subImpegni
	 *            the subImpegni to set
	 */
	public void setSubImpegni(List<SubImpegno> subImpegni) {
		this.subImpegni = subImpegni;
	}

	/**
	 * @return the annoImpegnoOrigine
	 */
	public Integer getAnnoImpegnoOrigine() {
		return annoImpegnoOrigine;
	}

	/**
	 * @param annoImpegnoOrigine the annoImpegnoOrigine to set
	 */
	public void setAnnoImpegnoOrigine(Integer annoImpegnoOrigine) {
		this.annoImpegnoOrigine = annoImpegnoOrigine;
	}

	/**
	 * @return the numImpegnoOrigine
	 */
	public Integer getNumImpegnoOrigine() {
		return numImpegnoOrigine;
	}

	/**
	 * @param numImpegnoOrigine the numImpegnoOrigine to set
	 */
	public void setNumImpegnoOrigine(Integer numImpegnoOrigine) {
		this.numImpegnoOrigine = numImpegnoOrigine;
	}

	/**
	 * @return the annoImpegnoRiaccertato
	 */
	public Integer getAnnoImpegnoRiaccertato() {
		return annoImpegnoRiaccertato;
	}

	/**
	 * @param annoImpegnoRiaccertato the annoImpegnoRiaccertato to set
	 */
	public void setAnnoImpegnoRiaccertato(Integer annoImpegnoRiaccertato) {
		this.annoImpegnoRiaccertato = annoImpegnoRiaccertato;
	}

	/**
	 * @return the numImpegnoRiaccertato
	 */
	public Integer getNumImpegnoRiaccertato() {
		return numImpegnoRiaccertato;
	}

	/**
	 * @param numImpegnoRiaccertato the numImpegnoRiaccertato to set
	 */
	public void setNumImpegnoRiaccertato(Integer numImpegnoRiaccertato) {
		this.numImpegnoRiaccertato = numImpegnoRiaccertato;
	}

	/**
	 * @return the disponibilitaLiquidare
	 */
	public BigDecimal getDisponibilitaLiquidare() {
		return disponibilitaLiquidare;
	}

	/**
	 * @param disponibilitaLiquidare the disponibilitaLiquidare to set
	 */
	public void setDisponibilitaLiquidare(BigDecimal disponibilitaLiquidare) {
		this.disponibilitaLiquidare = disponibilitaLiquidare;
	}

	/**
	 * @return the tipoImpegno
	 */
	public String getTipoImpegno() {
		return tipoImpegno;
	}

	/**
	 * @param tipoImpegno the tipoImpegno to set
	 */
	public void setTipoImpegno(String tipoImpegno) {
		this.tipoImpegno = tipoImpegno;
	}


	
}
