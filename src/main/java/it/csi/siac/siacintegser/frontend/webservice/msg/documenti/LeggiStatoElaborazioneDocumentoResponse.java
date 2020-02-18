/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.documenti;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.documenti.DocumentiSvcDictionary;
import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;

@XmlType(namespace = DocumentiSvcDictionary.NAMESPACE)
public class LeggiStatoElaborazioneDocumentoResponse extends BaseResponse {
	public enum StatoElaborazione {
		AVVIATA, CONCLUSA, ERRORE
	}
	
	private StatoElaborazione statoElaborazione;
	
	private String responseElaborazione;

	public StatoElaborazione getStatoElaborazione() {
		return statoElaborazione;
	}

	public void setStatoElaborazione(StatoElaborazione statoElaborazione) {
		this.statoElaborazione = statoElaborazione;
	}

	public String getResponseElaborazione() {
		return responseElaborazione;
	}

	public void setResponseElaborazione(String responseElaborazione) {
		this.responseElaborazione = responseElaborazione;
	}
}
