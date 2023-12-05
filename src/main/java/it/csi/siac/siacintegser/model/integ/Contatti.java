/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Contatti extends EntitaBase {
	private static final long serialVersionUID = -2355865569540840764L;

	private String telefono;
	private String cellulare;
	private String fax;
	private String email;
	private String pec;

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPec() {
		return pec;
	}

	public void setPec(String pec) {
		this.pec = pec;
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
