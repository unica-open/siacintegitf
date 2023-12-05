/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.integ.MandatoDiPagamento;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaEstesaOrdinativiSpesaResponse extends BaseResponse {

	private List<MandatoDiPagamento> mandatiDiPagamento = new ArrayList<MandatoDiPagamento>();

	private Integer numeroTotaleOrdinativiSpesaTrovati;
	
	
	/**
	 * @return the numeroTotaleOrdinativiSpesaTrovati
	 */
	public Integer getNumeroTotaleOrdinativiSpesaTrovati() {
		return numeroTotaleOrdinativiSpesaTrovati;
	}

	/**
	 * @param numeroTotaleOrdinativiSpesaTrovati the numeroTotaleOrdinativiSpesaTrovati to set
	 */
	public void setNumeroTotaleOrdinativiSpesaTrovati(
			Integer numeroTotaleOrdinativiSpesaTrovati) {
		this.numeroTotaleOrdinativiSpesaTrovati = numeroTotaleOrdinativiSpesaTrovati;
	}

	/**
	 * @return the mandatiDiPagamento
	 */
	public List<MandatoDiPagamento> getMandatiDiPagamento() {
		return mandatiDiPagamento;
	}

	/**
	 * @param mandatiDiPagamento the mandatiDiPagamento to set
	 */
	public void setMandatiDiPagamento(List<MandatoDiPagamento> mandatiDiPagamento) {
		this.mandatiDiPagamento = mandatiDiPagamento;
	}


	

	
	
}
