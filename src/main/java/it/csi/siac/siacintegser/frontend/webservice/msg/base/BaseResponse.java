/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.base;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.Ente;
import it.csi.siac.siacintegser.model.base.Errore;
import it.csi.siac.siacintegser.model.base.Esito;
import it.csi.siac.siacintegser.model.base.Messaggio;
import it.csi.siac.siacintegser.model.integ.INTEGDataDictionary;

@XmlType(namespace = INTEGDataDictionary.NAMESPACE)
public abstract class BaseResponse {
	private Ente ente;
	private Esito esito = Esito.SUCCESSO;
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	private List<Errore> errori = new ArrayList<Errore>();

	
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Esito getEsito() {
		return esito;
	}

	public void setEsito(Esito esito) {
		this.esito = esito;
	}

	public List<Errore> getErrori() {
		return errori;
	}

	public void setErrori(List<Errore> errori) {
		this.errori = errori;
	}

	public void addErrore(Errore errore) {
		errori.add(errore);
	}

	public boolean hasErrori() {
		return !errori.isEmpty();
	}

	
	public void addErrori(List<Errore> errori) {
		this.errori.addAll(errori);
	}

	public List<Messaggio> getMessaggi() {
		return messaggi;
	}

	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}

	public boolean hasMessaggio() {
		return !messaggi.isEmpty();
	}

	public void addMessaggio(Messaggio messaggio) {
		messaggi.add(messaggio);
	}
	
	public void addMessaggi(List<Messaggio> messaggi) {
		this.messaggi.addAll(messaggi);
	}
}
