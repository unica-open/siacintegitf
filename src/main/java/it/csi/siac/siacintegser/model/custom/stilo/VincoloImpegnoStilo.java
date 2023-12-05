/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.stilo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class VincoloImpegnoStilo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2112341419713132511L;
	private Integer annoAccertamento;
	private BigDecimal importo;
	private String tipo;
	private BigDecimal numeroAccertamento;
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
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	
	
}
