/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;
import it.csi.siac.siacintegser.model.integ.StrutturaAmministrativa;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Provvedimento extends EntitaBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7578125284928682442L;
	private Integer anno;
	private Integer numero;
	private String codiceTipo;
	private StrutturaAmministrativa strutturaAmministrativa;
	private Date dataEsecutivita;

	@Override
	public String getCodice() {
		return null;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public String getCodiceTipo() {
		return codiceTipo;
	}

	public void setCodiceTipo(String codiceTipo) {
		this.codiceTipo = codiceTipo;
	}

	public StrutturaAmministrativa getStrutturaAmministrativa() {
		return strutturaAmministrativa;
	}

	public void setStrutturaAmministrativa(StrutturaAmministrativa strutturaAmministrativa) {
		this.strutturaAmministrativa = strutturaAmministrativa;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return strutturaAmministrativa == null ?
				String.format("%s/%s/%s/-", anno, numero, codiceTipo) :
				String.format("%s/%s/%s/%s-%s", anno, numero, codiceTipo, strutturaAmministrativa.getCodice(), strutturaAmministrativa.getCodiceTipoStruttura());
	}

	public Date getDataEsecutivita() {
		return dataEsecutivita;
	}

	public void setDataEsecutivita(Date dataEsecutivita) {
		this.dataEsecutivita = dataEsecutivita;
	}
}
