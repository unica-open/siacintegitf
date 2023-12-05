/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class OrdinativoIncasso extends Ordinativo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6527645148399591530L;

	private List<SubOrdinativoIncasso> quoteIncasso = new ArrayList<SubOrdinativoIncasso>();

	/**
	 * @return the quoteIncasso
	 */
	public List<SubOrdinativoIncasso> getQuoteIncasso() {
		return quoteIncasso;
	}

	/**
	 * @param quoteIncasso the quoteIncasso to set
	 */
	public void setQuoteIncasso(List<SubOrdinativoIncasso> quoteIncasso) {
		this.quoteIncasso = quoteIncasso;
	}

	

}
