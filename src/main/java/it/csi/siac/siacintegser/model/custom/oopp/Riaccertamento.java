/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaBase;
import it.csi.siac.siacintegser.model.integ.StrutturaAmministrativa;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Riaccertamento extends EntitaBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8560866453906246887L;
	
	private Integer annoBilancio;
	private Integer anno;
	private Integer numero;
	private String codiceTipo;

	/*
	<riaccertamento>
	<annoBilancio>2021</annoBilancio>
	<anno>2022</anno>
	<numero>4785345</numero>
	<tipo>REIMP</tipo>
</riaccertamento>



anzi .. in realtà sarebbe così
flagDaReanno=S -- > il movimento di riaccertamento è nato nell'annoBilancio in cui è nato il movimento corrente, anno e numero  = annoRiaccertato, numeroRiaccertato

se flagDaReanno=N  , flagDaRiaccertamento=S, il movimento corrente  è nato da un movimento dell'annoBilancio-1, rispetto all'anno in cui è nato lui, anno e numero= annoRiaccertato, numeroRiaccertato

se flagDaReanno,flagDaRiacceramento=N --> non esiste movimento di riaccertamento


ok allora se vogliamo metterlo .. partendo dal movimento corrente .. devi cercare il min su siac_t_movgest, siac_bil, siac_t_periodo.anno

min di siac_t_periodo.anno .. per intenderci

ovviamente di movimenti in stato !='A'

una volta che l'hai trovato fai ,, sai che è quello in caso di REANNO, -1 in caso di REIMP




	*/
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

	public Integer getAnnoBilancio() {
		return annoBilancio;
	}

	public void setAnnoBilancio(Integer annoBilancio) {
		this.annoBilancio = annoBilancio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
