/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaImpegno extends RicercaMovimentoGestione {

	private Integer annoImpegno;
	private Integer numeroImpegno;

	/**
	 * @return the numeroImpegno
	 */
	public Integer getNumeroImpegno() {
		return numeroImpegno;
	}

	/**
	 * @param numeroImpegno
	 *            the numeroImpegno to set
	 */
	public void setNumeroImpegno(Integer numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	/**
	 * @return the annoImpegno
	 */
	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	/**
	 * @param annoImpegno
	 *            the annoImpegno to set
	 */
	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

}
