/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.OrdinativoIncasso;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaOrdinativoIncassoResponse extends RicercaPaginataResponse {

	private List<OrdinativoIncasso> ordinativiIncasso = new ArrayList<OrdinativoIncasso>();

	/**
	 * @return the ordinativiIncasso
	 */
	public List<OrdinativoIncasso> getOrdinativiIncasso() {
		return ordinativiIncasso;
	}

	/**
	 * @param ordinativiIncasso the ordinativiIncasso to set
	 */
	public void setOrdinativiIncasso(List<OrdinativoIncasso> ordinativiIncasso) {
		this.ordinativiIncasso = ordinativiIncasso;
	}

	
	
}
