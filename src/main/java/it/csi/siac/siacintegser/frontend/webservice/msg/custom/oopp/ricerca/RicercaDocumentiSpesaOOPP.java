/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseRequest;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaDocumentiSpesaOOPP extends BaseRequest {

	private Integer annoDocumento;
	private String cig;
	private Integer annoImpegno;
	private BigDecimal numeroImpegno;
	private BigDecimal numeroMandato;

	public Integer getAnnoDocumento() {
		return annoDocumento;
	}

	public void setAnnoDocumento(Integer annoDocumento) {
		this.annoDocumento = annoDocumento;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public BigDecimal getNumeroImpegno() {
		return numeroImpegno;
	}

	public void setNumeroImpegno(BigDecimal numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	public BigDecimal getNumeroMandato() {
		return numeroMandato;
	}

	public void setNumeroMandato(BigDecimal numeroMandato) {
		this.numeroMandato = numeroMandato;
	}

}
