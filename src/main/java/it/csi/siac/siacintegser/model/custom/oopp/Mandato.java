/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.model.custom.oopp;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacintegser.model.base.EntitaCodificataBase;
import it.csi.siac.siacintegser.model.integ.Capitolo;
import it.csi.siac.siacintegser.model.integ.Soggetto;

@XmlType(namespace = OOPPDataDictionary.NAMESPACE)
public class Mandato extends EntitaCodificataBase {
	public Mandato() {
		super();
	}

	private static final long serialVersionUID = 9081910419449556446L;

	private Integer anno;
	private BigDecimal numero;
	private String codiceSubOrdinativo;
	private BigDecimal importo;
	private Soggetto creditore;
	private Date dataEmissione;
	private Date dataQuietanza;
	private Liquidazione liquidazione;
	private Impegno impegno;
	private Provvedimento provvedimento;
	private Capitolo capitolo;
	private Integer annoEsercizio;
	private String cig;
	private String cup;
	

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public BigDecimal getNumero() {
		return numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public Soggetto getCreditore() {
		return creditore;
	}

	public void setCreditore(Soggetto creditore) {
		this.creditore = creditore;
	}

	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public Provvedimento getProvvedimento() {
		return provvedimento;
	}

	public void setProvvedimento(Provvedimento provvedimento) {
		this.provvedimento = provvedimento;
	}

	public Capitolo getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public String getCodiceSubOrdinativo() {
		return codiceSubOrdinativo;
	}

	public void setCodiceSubOrdinativo(String codiceSubOrdinativo) {
		this.codiceSubOrdinativo = codiceSubOrdinativo;
	}

	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	public Date getDataQuietanza() {
		return dataQuietanza;
	}

	public void setDataQuietanza(Date dataQuietanza) {
		this.dataQuietanza = dataQuietanza;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

}
