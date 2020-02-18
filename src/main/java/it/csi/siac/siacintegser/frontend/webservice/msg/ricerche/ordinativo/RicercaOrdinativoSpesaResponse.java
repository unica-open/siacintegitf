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
import it.csi.siac.siacintegser.model.integ.OrdinativoPagamento;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaOrdinativoSpesaResponse extends RicercaPaginataResponse {

	private List<OrdinativoPagamento> ordinativiPagamento = new ArrayList<OrdinativoPagamento>();

	/**
	 * @return the ordinativiPagamento
	 */
	public List<OrdinativoPagamento> getOrdinativiPagamento() {
		return ordinativiPagamento;
	}

	/**
	 * @param ordinativiPagamento the ordinativiPagamento to set
	 */
	public void setOrdinativiPagamento(List<OrdinativoPagamento> ordinativiPagamento) {
		this.ordinativiPagamento = ordinativiPagamento;
	}


	
	
}
