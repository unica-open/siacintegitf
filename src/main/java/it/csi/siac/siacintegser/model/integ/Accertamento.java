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
public class Accertamento extends MovimentoGestione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	private Integer numeroAccertamento;
	private Integer annoAccertamento;
	
	private Integer annoAccertamentoOrigine;
	private Integer numAccertamentoOrigine;
	
	private Integer annoAccertamentoRiaccertato;
	private Integer numAccertamentoRiaccertato;
	
	private BigDecimal disponibilitaIncassare;
	
	private List<SubAccertamento> subAccertamenti = new ArrayList<SubAccertamento>();

	/**
	 * @return the numeroAccertamento
	 */
	public Integer getNumeroAccertamento() {
		return numeroAccertamento;
	}

	/**
	 * @param numeroAccertamento the numeroAccertamento to set
	 */
	public void setNumeroAccertamento(Integer numeroAccertamento) {
		this.numeroAccertamento = numeroAccertamento;
	}

	/**
	 * @return the annoAccertamento
	 */
	public Integer getAnnoAccertamento() {
		return annoAccertamento;
	}

	/**
	 * @param annoAccertamento the annoAccertamento to set
	 */
	public void setAnnoAccertamento(Integer annoAccertamento) {
		this.annoAccertamento = annoAccertamento;
	}

	/**
	 * @return the annoAccertamentoOrigine
	 */
	public Integer getAnnoAccertamentoOrigine() {
		return annoAccertamentoOrigine;
	}

	/**
	 * @param annoAccertamentoOrigine the annoAccertamentoOrigine to set
	 */
	public void setAnnoAccertamentoOrigine(Integer annoAccertamentoOrigine) {
		this.annoAccertamentoOrigine = annoAccertamentoOrigine;
	}

	/**
	 * @return the numAccertamentoOrigine
	 */
	public Integer getNumAccertamentoOrigine() {
		return numAccertamentoOrigine;
	}

	/**
	 * @param numAccertamentoOrigine the numAccertamentoOrigine to set
	 */
	public void setNumAccertamentoOrigine(Integer numAccertamentoOrigine) {
		this.numAccertamentoOrigine = numAccertamentoOrigine;
	}

	/**
	 * @return the annoAccertamentoRiaccertato
	 */
	public Integer getAnnoAccertamentoRiaccertato() {
		return annoAccertamentoRiaccertato;
	}

	/**
	 * @param annoAccertamentoRiaccertato the annoAccertamentoRiaccertato to set
	 */
	public void setAnnoAccertamentoRiaccertato(Integer annoAccertamentoRiaccertato) {
		this.annoAccertamentoRiaccertato = annoAccertamentoRiaccertato;
	}

	/**
	 * @return the numAccertamentoRiaccertato
	 */
	public Integer getNumAccertamentoRiaccertato() {
		return numAccertamentoRiaccertato;
	}

	/**
	 * @param numAccertamentoRiaccertato the numAccertamentoRiaccertato to set
	 */
	public void setNumAccertamentoRiaccertato(Integer numAccertamentoRiaccertato) {
		this.numAccertamentoRiaccertato = numAccertamentoRiaccertato;
	}

	/**
	 * @return the subAccertamento
	 */
	public List<SubAccertamento> getSubAccertamenti() {
		return subAccertamenti;
	}

	/**
	 * @param subAccertamento the subAccertamento to set
	 */
	public void setSubAccertamenti(List<SubAccertamento> subAccertamenti) {
		this.subAccertamenti = subAccertamenti;
	}

	/**
	 * @return the disponibilitaIncassare
	 */
	public BigDecimal getDisponibilitaIncassare() {
		return disponibilitaIncassare;
	}

	/**
	 * @param disponibilitaIncassare the disponibilitaIncassare to set
	 */
	public void setDisponibilitaIncassare(BigDecimal disponibilitaIncassare) {
		this.disponibilitaIncassare = disponibilitaIncassare;
	}

	
	

}
