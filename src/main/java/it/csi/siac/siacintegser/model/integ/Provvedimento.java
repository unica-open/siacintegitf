/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class Provvedimento extends EntitaBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;
	
	private String codice;
	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	private String statoProvvedimento;
	private String codiceTipoProvvedimento;
	private StrutturaAmministrativa sac;

	/**
	 * @return the annoProvvedimento
	 */
	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	/**
	 * @param annoProvvedimento
	 *            the annoProvvedimento to set
	 */
	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	/**
	 * @return the numeroProvvedimento
	 */
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	/**
	 * @param numeroProvvedimento
	 *            the numeroProvvedimento to set
	 */
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	/**
	 * @return the statoProvvedimento
	 */
	public String getStatoProvvedimento() {
		return statoProvvedimento;
	}

	/**
	 * @param statoProvvedimento
	 *            the statoProvvedimento to set
	 */
	public void setStatoProvvedimento(String statoProvvedimento) {
		this.statoProvvedimento = statoProvvedimento;
	}

	/**
	 * @return the sac
	 */
	public StrutturaAmministrativa getSac() {
		return sac;
	}

	/**
	 * @param sac
	 *            the sac to set
	 */
	public void setSac(StrutturaAmministrativa sac) {
		this.sac = sac;
	}

	
	
	@Override
	public String getCodice() {
//		return String.format("%d-%d-%s-%s", annoProvvedimento, numeroProvvedimento, "FIXME",
//				sac != null ? sac.getCodice() : NULL_CODING);
		return codice;
	}

//	@Override
//	public void setCodice(String codice) {
//		this.codice = codice;
//	}

	/**
	 * @return the codiceTipoAtto
	 */
	public String getCodiceTipoProvvedimento() {
		return codiceTipoProvvedimento;
	}

	/**
	 * @param codiceTipoAtto the codiceTipoAtto to set
	 */
	public void setCodiceTipoProvvedimento(String codiceTipoProvvedimento) {
		this.codiceTipoProvvedimento = codiceTipoProvvedimento;
	}

	

}
