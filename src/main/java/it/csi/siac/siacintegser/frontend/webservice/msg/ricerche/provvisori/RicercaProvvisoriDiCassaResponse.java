/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.provvisori;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.documenti.DocumentiSvcDictionary;
import it.csi.siac.siacintegser.frontend.webservice.msg.base.ricerche.RicercaPaginataResponse;
import it.csi.siac.siacintegser.model.integ.ProvvisorioDiCassa;


@XmlType(namespace = DocumentiSvcDictionary.NAMESPACE)
public class RicercaProvvisoriDiCassaResponse extends RicercaPaginataResponse {
	
	private List<ProvvisorioDiCassa> provvisoriDiCassa = new ArrayList<ProvvisorioDiCassa>();

	public List<ProvvisorioDiCassa> getProvvisoriDiCassa() {
		return provvisoriDiCassa;
	}

	public void setProvvisoriDiCassa(List<ProvvisorioDiCassa> provvisoriDiCassa) {
		this.provvisoriDiCassa = provvisoriDiCassa;
	}
	
}
