/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.custom.stilo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.custom.stilo.StiloSvcDictionary;
import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;
import it.csi.siac.siacintegser.model.custom.stilo.MovimentoGestioneStilo;

@XmlType(namespace = StiloSvcDictionary.NAMESPACE)
public class RicercaMovimentoGestioneStiloResponse extends BaseResponse {
	
	private List<MovimentoGestioneStilo> movimentiGestione = new ArrayList<MovimentoGestioneStilo>();

	/**
	 * @return the movimentiGestione
	 */
	public List<MovimentoGestioneStilo> getMovimentiGestione() {
		return movimentiGestione;
	}

	/**
	 * @param movimentiGestione the movimentiGestione to set
	 */
	public void setMovimentiGestione(List<MovimentoGestioneStilo> movimentiGestione) {
		this.movimentiGestione = movimentiGestione;
	}

	

}
