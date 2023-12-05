/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class TipoAmbito extends EntitaCodificataBase {
	public TipoAmbito() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5507853192769628083L;

	public TipoAmbito(String codice, String descrizione) {
		super(codice, descrizione);
	}

}
