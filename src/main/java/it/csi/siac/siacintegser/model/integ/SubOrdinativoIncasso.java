/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class SubOrdinativoIncasso extends Ordinativo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7833253425139013637L;

	private Integer annoAccertamento;
	private Integer numeroAccertamento;
	
	private BigDecimal importo;


	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}

	/**
	 * @param importo
	 *            the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
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
	
	
}
