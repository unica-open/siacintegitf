/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.liquidazione;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.LiquidazioneAtti;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaEstesaLiquidazioniResponse extends BaseResponse {

	private List<LiquidazioneAtti> liquidazioni = new ArrayList<LiquidazioneAtti>();
	private Integer numeroTotaleLiqudazioniTrovate;
	
	


	/**
	 * @return the numeroTotaleLiqudazioniTrovate
	 */
	public Integer getNumeroTotaleLiqudazioniTrovate() {
		return numeroTotaleLiqudazioniTrovate;
	}

	/**
	 * @param numeroTotaleLiqudazioniTrovate the numeroTotaleLiqudazioniTrovate to set
	 */
	public void setNumeroTotaleLiqudazioniTrovate(
			Integer numeroTotaleLiqudazioniTrovate) {
		this.numeroTotaleLiqudazioniTrovate = numeroTotaleLiqudazioniTrovate;
	}

	/**
	 * @return the liquidazioni
	 */
	public List<LiquidazioneAtti> getLiquidazioni() {
		return liquidazioni;
	}

	/**
	 * @param liquidazioni the liquidazioni to set
	 */
	public void setLiquidazioni(List<LiquidazioneAtti> liquidazioni) {
		this.liquidazioni = liquidazioni;
	}
	


}
