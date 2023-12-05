/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.capitolo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.CapitoloUscitaGestione;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaCapitoloUscitaGestioneResponse extends RicercaCapitoloResponse {

	private List<CapitoloUscitaGestione> capitoliUscitaGestione = new ArrayList<CapitoloUscitaGestione>();


	/**
	 * @return the capitoliUscitaGestione
	 */
	public List<CapitoloUscitaGestione> getCapitoliUscitaGestione() {
		return capitoliUscitaGestione;
	}

	/**
	 * @param capitoliUscitaGestione
	 *            the capitoliUscitaGestione to set
	 */
	public void setCapitoliUscitaGestione(
			List<CapitoloUscitaGestione> capitoliUscitaGestione) {
		this.capitoliUscitaGestione = capitoliUscitaGestione;
	}

	@Override
	public Integer getTotaleRisultati() {
		return capitoliUscitaGestione.size();
	}



}
