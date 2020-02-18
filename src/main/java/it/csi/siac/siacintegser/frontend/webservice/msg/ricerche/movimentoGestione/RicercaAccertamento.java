/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaAccertamento extends RicercaMovimentoGestione {

	private Integer annoAccertamento;
	private Integer numeroAccertamento;
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
