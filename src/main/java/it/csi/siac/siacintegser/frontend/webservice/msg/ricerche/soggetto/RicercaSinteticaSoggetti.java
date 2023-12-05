/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.soggetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.base.Stato;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaSinteticaSoggetti extends BaseRicercaSoggetti {
	private String denominazione;
	private Stato stato;

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
}
