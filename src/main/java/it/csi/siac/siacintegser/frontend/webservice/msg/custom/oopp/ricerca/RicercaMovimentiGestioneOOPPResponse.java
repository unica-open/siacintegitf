/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.custom.oopp.MovimentoGestione;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaMovimentiGestioneOOPPResponse extends BaseResponse {

	@XmlElementWrapper(name="movimentiGestione")
	@XmlElement(name="movimentoGestione")
	private List<MovimentoGestione> elencoMovimentoGestione = new ArrayList<MovimentoGestione>();

	@XmlTransient
	public List<MovimentoGestione> getElencoMovimentoGestione() {
		return elencoMovimentoGestione;
	}

	public void setElencoMovimentoGestione(List<MovimentoGestione> elencoMovimentoGestione) {
		this.elencoMovimentoGestione = elencoMovimentoGestione;
	}

}
