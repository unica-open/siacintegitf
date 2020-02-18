/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class SubImpegno extends MovimentoGestione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	private	Integer numeroSubImpegno;
	private	Integer annoSubImpegno;
	private BigDecimal disponibilitaLiquidare;
	/**
	 * @return the numeroSubImpegno
	 */
	public Integer getNumeroSubImpegno() {
		return numeroSubImpegno;
	}
	/**
	 * @param numeroSubImpegno the numeroSubImpegno to set
	 */
	public void setNumeroSubImpegno(Integer numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}
	/**
	 * @return the annoSubImpegno
	 */
	public Integer getAnnoSubImpegno() {
		return annoSubImpegno;
	}
	/**
	 * @param annoSubImpegno the annoSubImpegno to set
	 */
	public void setAnnoSubImpegno(Integer annoSubImpegno) {
		this.annoSubImpegno = annoSubImpegno;
	}
	/**
	 * @return the disponibilitaLiquidare
	 */
	public BigDecimal getDisponibilitaLiquidare() {
		return disponibilitaLiquidare;
	}
	/**
	 * @param disponibilitaLiquidare the disponibilitaLiquidare to set
	 */
	public void setDisponibilitaLiquidare(BigDecimal disponibilitaLiquidare) {
		this.disponibilitaLiquidare = disponibilitaLiquidare;
	}
	

	
}
