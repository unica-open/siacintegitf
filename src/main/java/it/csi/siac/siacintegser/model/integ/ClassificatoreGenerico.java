/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class ClassificatoreGenerico extends EntitaCodificataBase {
	public ClassificatoreGenerico() {
		super();
	}

	private static final long serialVersionUID = 7075703597915541129L;

	private String tipoCodifica;

	public String getTipoCodifica() {
		return tipoCodifica;
	}

	public void setTipoCodifica(String tipoCodifica) {
		this.tipoCodifica = tipoCodifica;
	}
}
