/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class SubAccertamento extends MovimentoGestione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	private	Integer numeroSubAccertamento;
	private	Integer annoSubAccertamento;
	
	private BigDecimal disponibilitaIncassare;
	/**
	 * @return the numeroSubAccertamento
	 */
	public Integer getNumeroSubAccertamento() {
		return numeroSubAccertamento;
	}
	/**
	 * @param numeroSubAccertamento the numeroSubAccertamento to set
	 */
	public void setNumeroSubAccertamento(Integer numeroSubAccertamento) {
		this.numeroSubAccertamento = numeroSubAccertamento;
	}
	/**
	 * @return the annoSubAccertamento
	 */
	public Integer getAnnoSubAccertamento() {
		return annoSubAccertamento;
	}
	/**
	 * @param annoSubAccertamento the annoSubAccertamento to set
	 */
	public void setAnnoSubAccertamento(Integer annoSubAccertamento) {
		this.annoSubAccertamento = annoSubAccertamento;
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
