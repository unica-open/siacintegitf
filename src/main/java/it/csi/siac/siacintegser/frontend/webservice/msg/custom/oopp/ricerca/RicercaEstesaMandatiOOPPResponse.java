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
import it.csi.siac.siacintegser.model.custom.oopp.Mandato;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaEstesaMandatiOOPPResponse extends BaseResponse {

	@XmlElementWrapper(name="mandati")
	@XmlElement(name = "mandato")
	private List<Mandato> elencoMandati = new ArrayList<Mandato>();
	private Integer numeroTotaleMandatiTrovati;

	@XmlTransient
	public List<Mandato> getElencoMandati() {
		return elencoMandati;
	}

	public void setElencoMandati(List<Mandato> elencoMandati) {
		this.elencoMandati = elencoMandati;
	}

	public Integer getNumeroTotaleMandatiTrovati() {
		return numeroTotaleMandatiTrovati;
	}

	public void setNumeroTotaleMandatiTrovati(Integer numeroTotaleMandatiTrovati) {
		this.numeroTotaleMandatiTrovati = numeroTotaleMandatiTrovati;
	}

}
