/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseRequest;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaMovimentiGestioneOOPP extends BaseRequest {

	private String cup;
	private String codiceProgetto;
	private String cig;

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getCodiceProgetto() {
		return codiceProgetto;
	}

	public void setCodiceProgetto(String codiceProgetto) {
		this.codiceProgetto = codiceProgetto;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

}
