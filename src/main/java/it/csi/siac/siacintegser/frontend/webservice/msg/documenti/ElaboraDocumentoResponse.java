/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.documenti;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.documenti.DocumentiSvcDictionary;
import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;


@XmlType(namespace = DocumentiSvcDictionary.NAMESPACE)
public class ElaboraDocumentoResponse extends BaseResponse implements ElaboraDocumentoResponseInterface {
	
	private String responseElaborazione;

	public String getResponseElaborazione() {
		return responseElaborazione;
	}

	public void setResponseElaborazione(String responseElaborazione) {
		this.responseElaborazione = responseElaborazione;
	}

}
