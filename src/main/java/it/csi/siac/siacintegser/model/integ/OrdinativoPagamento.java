/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class OrdinativoPagamento extends Ordinativo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6527645148399591530L;

	private List<SubOrdinativoPagamento> quotePagamento= new ArrayList<SubOrdinativoPagamento>();

	
	/**
	 * @return the quotePagamento
	 */
	public List<SubOrdinativoPagamento> getQuotePagamento() {
		return quotePagamento;
	}
	/**
	 * @param quotePagamento the quotePagamento to set
	 */
	public void setQuotePagamento(List<SubOrdinativoPagamento> quotePagamento) {
		this.quotePagamento = quotePagamento;
	}




}
