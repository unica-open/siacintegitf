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
import it.csi.siac.siacintegser.model.integ.Impegno;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaImpegnoResponse extends RicercaPaginataResponse {
	private List<Impegno> impegni = new ArrayList<Impegno>();


	/**
	 * @return the impegni
	 */
	public List<Impegno> getImpegni() {
		return impegni;
	}

	/**
	 * @param impegni
	 *            the impegni to set
	 */
	public void setImpegni(List<Impegno> impegni) {
		this.impegni = impegni;
	}

	

}
