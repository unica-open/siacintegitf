/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.gestione;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseRequest;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;
import it.csi.siac.siacintegser.model.custom.oopp.Provvedimento;
import it.csi.siac.siacintegser.model.integ.StrutturaAmministrativa;
import it.csi.siac.siacintegser.model.integ.TipoAmbito;

@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public abstract class BaseProgettoOOPP extends BaseRequest {

	private String numero;
	private String descrizione;
	private TipoAmbito tipoAmbito;
	private BigDecimal valoreComplessivo;
	private String cup;
	private String rup;
	private StrutturaAmministrativa strutturaAmministrativa;
	private Provvedimento provvedimento;
	private String note;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getValoreComplessivo() {
		return valoreComplessivo;
	}

	public void setValoreComplessivo(BigDecimal valoreComplessivo) {
		this.valoreComplessivo = valoreComplessivo;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getRup() {
		return rup;
	}

	public void setRup(String rup) {
		this.rup = rup;
	}

	public StrutturaAmministrativa getStrutturaAmministrativa() {
		return strutturaAmministrativa;
	}

	public void setStrutturaAmministrativa(StrutturaAmministrativa strutturaAmministrativa) {
		this.strutturaAmministrativa = strutturaAmministrativa;
	}

	public Provvedimento getProvvedimento() {
		return provvedimento;
	}

	public void setProvvedimento(Provvedimento provvedimento) {
		this.provvedimento = provvedimento;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public TipoAmbito getTipoAmbito() {
		return tipoAmbito;
	}

	public void setTipoAmbito(TipoAmbito tipoAmbito) {
		this.tipoAmbito = tipoAmbito;
	}
}
