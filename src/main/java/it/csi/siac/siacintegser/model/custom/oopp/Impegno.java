/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Impegno extends MovimentoGestione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1736772203241874441L;
	
	private String subNumero;

	public String getSubNumero() {
		return subNumero;
	}

	public void setSubNumero(String subNumero) {
		this.subNumero = subNumero;
	}
}
