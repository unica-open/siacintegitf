/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.soggetto;

import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.BaseRicercaResponse;
import it.csi.siac.siacintegser.model.integ.Soggetto;

public abstract class BaseRicercaSoggettiResponse extends BaseRicercaResponse {
	private List<Soggetto> soggetti;

	public List<Soggetto> getSoggetti() {
		return soggetti;
	}

	public void setSoggetti(List<Soggetto> soggetti) {
		this.soggetti = soggetti;
	}

	public void clearSoggetti() {
		this.soggetti = new ArrayList<Soggetto>();
	}

	@Override
	public Integer getTotaleRisultati() {
		return soggetti != null ? soggetti.size() : 0;
	}
}
