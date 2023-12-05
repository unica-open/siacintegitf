/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.liquidazione;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.Liquidazione;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaLiquidazioneResponse extends RicercaPaginataResponse {

	private List<Liquidazione> liquidazioni = new ArrayList<Liquidazione>();
	
	/**
	 * @return the liquidazioni
	 */
	public List<Liquidazione> getLiquidazioni() {
		return liquidazioni;
	}

	/**
	 * @param liquidazioni the liquidazioni to set
	 */
	public void setLiquidazioni(List<Liquidazione> liquidazioni) {
		this.liquidazioni = liquidazioni;
	}


}
