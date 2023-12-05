/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Liquidazione extends EntitaCodificataBase { public Liquidazione() { super(); } 

	/**
	 * 
	 */
	private static final long serialVersionUID = 7495662023947296588L;
	private Integer anno;
	private BigDecimal numero;

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public BigDecimal getNumero() {
		return numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

}
