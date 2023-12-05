/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/


package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class StrutturaAmministrativa extends EntitaCodificataBase {
	public StrutturaAmministrativa() {
		super();
	}

	private static final long serialVersionUID = 7075703597915541129L;

	private String codiceTipoStruttura;

	/**
	 * @return the codiceTipoStruttura
	 */
	public String getCodiceTipoStruttura() {
		return codiceTipoStruttura;
	}

	/**
	 * @param codiceTipoStruttura
	 *            the codiceTipoStruttura to set
	 */
	public void setCodiceTipoStruttura(String codiceTipoStruttura) {
		this.codiceTipoStruttura = codiceTipoStruttura;
	}

}
