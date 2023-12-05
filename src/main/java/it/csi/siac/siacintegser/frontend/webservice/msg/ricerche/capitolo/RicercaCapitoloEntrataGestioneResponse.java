/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.capitolo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.CapitoloEntrataGestione;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaCapitoloEntrataGestioneResponse extends RicercaCapitoloResponse {

	private List<CapitoloEntrataGestione> capitoliEntrataGestione = new ArrayList<CapitoloEntrataGestione>();

	/**
	 * @return the capitoliEntrataGestione
	 */
	public List<CapitoloEntrataGestione> getCapitoliEntrataGestione() {
		return capitoliEntrataGestione;
	}

	/**
	 * @param capitoliEntrataGestione
	 *            the capitoliEntrataGestione to set
	 */
	public void setCapitoliEntrataGestione(List<CapitoloEntrataGestione> capitoliEntrataGestione) {
		this.capitoliEntrataGestione = capitoliEntrataGestione;
	}

	@Override
	public Integer getTotaleRisultati() {
		return capitoliEntrataGestione.size();
	}

}
