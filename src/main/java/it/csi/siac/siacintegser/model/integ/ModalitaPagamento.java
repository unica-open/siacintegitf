/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class ModalitaPagamento extends EntitaCodificataBase {
	public ModalitaPagamento() {
		super();
	}

	private static final long serialVersionUID = 7118655033512838539L;

	private String codiceTipoAccredito;
	private String descrizioneTipoAccredito;
	private Sede sede;

	public String getCodiceTipoAccredito() {
		return codiceTipoAccredito;
	}

	public void setCodiceTipoAccredito(String codiceTipoAccredito) {
		this.codiceTipoAccredito = codiceTipoAccredito;
	}

	public String getDescrizioneTipoAccredito() {
		return descrizioneTipoAccredito;
	}

	public void setDescrizioneTipoAccredito(String descrizioneTipoAccredito) {
		this.descrizioneTipoAccredito = descrizioneTipoAccredito;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}
