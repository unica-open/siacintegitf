/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class CapitoloUscitaGestione extends Capitolo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;


	private Missione missione;
	private Programma programma;
	private Macroaggregato macroaggregato;
	private List<ImportoCapitoloUscitaGestione> importiUG;

	
	/**
	 * @return the missione
	 */
	public Missione getMissione() {
		return missione;
	}

	/**
	 * @param missione the missione to set
	 */
	public void setMissione(Missione missione) {
		this.missione = missione;
	}

	/**
	 * @return the programma
	 */
	public Programma getProgramma() {
		return programma;
	}

	/**
	 * @param programma the programma to set
	 */
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}

	/**
	 * @return the macroaggregato
	 */
	public Macroaggregato getMacroaggregato() {
		return macroaggregato;
	}

	/**
	 * @param macroaggregato the macroaggregato to set
	 */
	public void setMacroaggregato(Macroaggregato macroaggregato) {
		this.macroaggregato = macroaggregato;
	}


	/**
	 * @return the importiUG
	 */
	public List<ImportoCapitoloUscitaGestione> getImportiUG() {
		return importiUG;
	}

	/**
	 * @param importiUG the importiUG to set
	 */
	public void setImportiUG(List<ImportoCapitoloUscitaGestione> importiUG) {
		this.importiUG = importiUG;
	}

	

}
