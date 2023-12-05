/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.integ;

/**
 * Caratteristiche del Data Dictionary di INTEGRAZIONE. 
 * Contiene la versione corrente del dd
 * 
 * 
 * @author 1513
 * 
 */
public interface INTEGDataDictionary {

	String VERSION = "1.0";
	String NAME = "integ";
	String NAMESPACE = "http://siac.csi.it/" + INTEGDataDictionary.NAME + "/data/" + INTEGDataDictionary.VERSION;
}
