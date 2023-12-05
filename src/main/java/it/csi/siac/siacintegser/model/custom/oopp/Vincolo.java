/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Vincolo extends BaseMovimentoGestione {

	private static final long serialVersionUID = 8837450931162396709L;

	private BigDecimal importo;

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
}
