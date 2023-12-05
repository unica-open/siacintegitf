/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.custom.oopp.DocumentoSpesa;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaDocumentiSpesaOOPPResponse extends BaseResponse {

	@XmlElementWrapper(name = "documentiSpesa")
	@XmlElement(name = "documentoSpesa")
	private List<DocumentoSpesa> elencoDocumentiSpesa = new ArrayList<DocumentoSpesa>();
	private Integer numeroTotaleDocumentiSpesaTrovati;

	@XmlTransient
	public List<DocumentoSpesa> getElencoDocumentiSpesa() {
		return elencoDocumentiSpesa;
	}

	public void setElencoDocumentiSpesa(List<DocumentoSpesa> elencoDocumentiSpesa) {
		this.elencoDocumentiSpesa = elencoDocumentiSpesa;
	}

	public Integer getNumeroTotaleDocumentiSpesaTrovati() {
		return numeroTotaleDocumentiSpesaTrovati;
	}

	public void setNumeroTotaleDocumentiSpesaTrovati(Integer numeroTotaleDocumentiSpesaTrovati) {
		this.numeroTotaleDocumentiSpesaTrovati = numeroTotaleDocumentiSpesaTrovati;
	}

}
