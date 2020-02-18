/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.util;


import java.util.HashMap;
import java.util.Map;

public final class IntegUtils {
	
	/** Costruttore privato per evitare instanziazione */
	private IntegUtils() {
		// Prevent instantiation
	}
	
	public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
		final Map<V, K> rev = new HashMap<V, K>();

		for (Map.Entry<K, V> e : map.entrySet())
			rev.put(e.getValue(), e.getKey());

		return rev;
	}

	public static <T> Map<String, T> getEnumMap(Class<T> c) {
		final Map<String, T> reverseMap = new HashMap<String, T>();

		for (T elem : c.getEnumConstants())
			reverseMap.put(elem.toString(), elem);

		return reverseMap;
	}



}
