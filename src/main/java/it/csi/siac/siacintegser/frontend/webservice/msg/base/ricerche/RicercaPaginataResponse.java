/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public abstract class RicercaPaginataResponse extends BaseRicercaResponse {
	private Integer totaleRisultati;

	@Override
	public Integer getTotaleRisultati() {
		return totaleRisultati;
	}

	public void setTotaleRisultati(Integer totaleRisultati) {
		this.totaleRisultati = totaleRisultati;
	}
}
