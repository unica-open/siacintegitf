/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public class CapitoloEntrataGestione extends Capitolo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449086744042159841L;

	
	private Tipologia tipologia;
	private Categoria categoria;
	private List<ImportoCapitoloEntrataGestione> listaImportiCapitoloEG;

	/**
	 * @return the tipologia
	 */
	public Tipologia getTipologia() {
		return tipologia;
	}

	/**
	 * @param tipologia
	 *            the tipologia to set
	 */
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria
	 *            the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the importiCapitoloEG
	 */
	public List<ImportoCapitoloEntrataGestione> getListaImportiCapitoloEG() {
		return listaImportiCapitoloEG;
	}

	/**
	 * @param importiCapitoloEG the importiCapitoloEG to set
	 */
	public void setListaImportiCapitoloEG(
			List<ImportoCapitoloEntrataGestione> listaImportiCapitoloEG) {
		this.listaImportiCapitoloEG = listaImportiCapitoloEG;
	}

	/**
	 * @return the importiEG
	 */

}
