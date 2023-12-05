/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Sede extends EntitaBase {

	private static final long serialVersionUID = -7021853922518931817L;

	private String descrizione;
	private Recapito recapito;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Recapito getRecapito() {
		return recapito;
	}

	public void setRecapito(Recapito recapito) {
		this.recapito = recapito;
	}

	@Override
	public String getCodice() {
		return null;
	}

//	@Override
//	public void setCodice(String codice) {
//		// Codice non presente
//	}

}
