/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.messaggio;


import java.text.MessageFormat;

import it.csi.siac.siacintegser.model.base.Messaggio;

public enum MessaggioInteg  {

	NESSUN_RISULTATO_TROVATO("INTEG_INF_0001", "Nessun risultato trovato: {0}")
	,
	;

	private final String codice;
	private final String messaggio;

	private MessaggioInteg(String codice, String messaggio) {
		this.codice = codice;
		this.messaggio = messaggio;
	}

	public String getCodice() {
		return codice;
	}

	public Messaggio getMessaggio(Object... args) {
		return new Messaggio(codice, MessageFormat.format(this.messaggio, args));
	}

}
