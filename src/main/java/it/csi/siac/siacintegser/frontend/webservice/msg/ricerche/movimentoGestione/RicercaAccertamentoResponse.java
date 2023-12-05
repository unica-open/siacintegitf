/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.Accertamento;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaAccertamentoResponse extends RicercaPaginataResponse {
	private List<Accertamento> accertamenti = new ArrayList<Accertamento>();

	/**
	 * @return the accertamenti
	 */
	public List<Accertamento> getAccertamenti() {
		return accertamenti;
	}

	/**
	 * @param accertamenti the accertamenti to set
	 */
	public void setAccertamenti(List<Accertamento> accertamenti) {
		this.accertamenti = accertamenti;
	}


}
