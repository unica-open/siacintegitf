/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public abstract class RicercaPaginataRequest extends BaseRicercaRequest {
	private Integer numeroPagina;
	private Integer numeroElementiPerPagina;

	public Integer getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(Integer numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	public Integer getNumeroElementiPerPagina() {
		return numeroElementiPerPagina;
	}

	public void setNumeroElementiPerPagina(Integer numeroElementiPerPagina) {
		this.numeroElementiPerPagina = numeroElementiPerPagina;
	}

}
