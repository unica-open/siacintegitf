/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.documenti;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.documenti.DocumentiSvcDictionary;
import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseRequest;

@XmlType(namespace = DocumentiSvcDictionary.NAMESPACE)
public class ElaboraDocumento extends BaseRequest implements ElaboraDocumentoRequestInterface {
	
	private String contenutoDocumento;
	private String codiceTipoDocumento;

	@Override
	public String getContenutoDocumento() {
		return contenutoDocumento;
	}

	public void setContenutoDocumento(String contenutoDocumento) {
		this.contenutoDocumento = contenutoDocumento;
	}

	public String getCodiceTipoDocumento() {
		return codiceTipoDocumento;
	}

	public void setCodiceTipoDocumento(String codiceTipoDocumento) {
		this.codiceTipoDocumento = codiceTipoDocumento;
	}
}
