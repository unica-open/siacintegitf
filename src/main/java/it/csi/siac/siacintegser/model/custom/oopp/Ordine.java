/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Ordine extends EntitaCodificataBase {
	public Ordine() {
		super();
	}

	private static final long serialVersionUID = 9032907433725733845L;

	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
