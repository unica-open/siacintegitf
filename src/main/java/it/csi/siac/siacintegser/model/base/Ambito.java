/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.base;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public enum Ambito {
	X(""), RIC("ricerche"), GES("gestione"), DOC("documenti");

	private static Map<String, Ambito> reverseEnumMap = null;

	static {
		reverseEnumMap = new HashMap<String, Ambito>();

		for (Ambito elem : Ambito.class.getEnumConstants())
			reverseEnumMap.put(elem.getLabel(), elem);
	}

	Ambito(String label) { 
		this.label = label;
	}

	private String label;

	public String getLabel() {
		return label;
	}

	public static Ambito byLabel(String label) {
		return reverseEnumMap.get(label);
	}
}