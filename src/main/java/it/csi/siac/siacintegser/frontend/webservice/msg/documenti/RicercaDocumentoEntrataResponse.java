/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.documenti;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.documenti.DocumentiSvcDictionary;
import it.csi.siac.siacintegser.model.integ.DocumentoEntrata;


@XmlType(namespace = DocumentiSvcDictionary.NAMESPACE)
public class RicercaDocumentoEntrataResponse extends BaseRicercaDocumentoResponse {
	
	private List<DocumentoEntrata> documentiEntrata = new ArrayList<DocumentoEntrata>();

	/**
	 * @return the documentiEntrata
	 */
	public List<DocumentoEntrata> getDocumentiEntrata() {
		return documentiEntrata;
	}

	/**
	 * @param documentiEntrata the documentiEntrata to set
	 */
	public void setDocumentiEntrata(List<DocumentoEntrata> documentiEntrata) {
		this.documentiEntrata = documentiEntrata;
	}

	
}
