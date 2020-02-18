/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class ImportoCapitoloEntrataGestione extends Importo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6328917973636073689L;

	private BigDecimal stanziamento;
	private BigDecimal stanziamentoCassa;
	private BigDecimal stanziamentoResiduo;
	private BigDecimal disponibilitaAccertare;

	/**
	 * @return the stanziamento
	 */
	public BigDecimal getStanziamento() {
		return stanziamento;
	}

	/**
	 * @param stanziamento
	 *            the stanziamento to set
	 */
	public void setStanziamento(BigDecimal stanziamento) {
		this.stanziamento = stanziamento;
	}

	/**
	 * @return the stanziamentoCassa
	 */
	public BigDecimal getStanziamentoCassa() {
		return stanziamentoCassa;
	}

	/**
	 * @param stanziamentoCassa
	 *            the stanziamentoCassa to set
	 */
	public void setStanziamentoCassa(BigDecimal stanziamentoCassa) {
		this.stanziamentoCassa = stanziamentoCassa;
	}

	/**
	 * @return the stanziamentoResiduo
	 */
	public BigDecimal getStanziamentoResiduo() {
		return stanziamentoResiduo;
	}

	/**
	 * @param stanziamentoResiduo
	 *            the stanziamentoResiduo to set
	 */
	public void setStanziamentoResiduo(BigDecimal stanziamentoResiduo) {
		this.stanziamentoResiduo = stanziamentoResiduo;
	}

	/**
	 * @return the disponibilitaIncassare
	 */
	public BigDecimal getDisponibilitaAccertare() {
		return disponibilitaAccertare;
	}

	/**
	 * @param disponibilitaIncassare the disponibilitaIncassare to set
	 */
	public void setDisponibilitaAccertare(BigDecimal disponibilitaAccertare) {
		this.disponibilitaAccertare = disponibilitaAccertare;
	}


}
