/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Progetto extends EntitaBase {

	private static final long serialVersionUID = 1639695899604446880L;

	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String getCodice() {
		return numero;
	}


}
