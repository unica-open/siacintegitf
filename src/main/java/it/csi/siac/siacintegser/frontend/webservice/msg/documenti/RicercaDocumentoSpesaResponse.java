/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.documenti;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.documenti.DocumentiSvcDictionary;
import it.csi.siac.siacintegser.model.integ.DocumentoSpesa;

@XmlType(namespace = DocumentiSvcDictionary.NAMESPACE)
public class RicercaDocumentoSpesaResponse extends BaseRicercaDocumentoResponse {

	private List<DocumentoSpesa> documentiSpesa = new ArrayList<DocumentoSpesa>();

	/**
	 * @return the documentiSpesa
	 */
	public List<DocumentoSpesa> getDocumentiSpesa() {
		return documentiSpesa;
	}

	/**
	 * @param documentiSpesa the documentiSpesa to set
	 */
	public void setDocumentiSpesa(List<DocumentoSpesa> documentiSpesa) {
		this.documentiSpesa = documentiSpesa;
	}


}
