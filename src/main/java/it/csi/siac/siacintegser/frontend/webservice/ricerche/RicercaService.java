/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.ricerche;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca.RicercaDocumentiSpesaOOPP;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca.RicercaDocumentiSpesaOOPPResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca.RicercaEstesaMandatiOOPP;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca.RicercaEstesaMandatiOOPPResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca.RicercaMovimentiGestioneOOPP;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.ricerca.RicercaMovimentiGestioneOOPPResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.RicercaDocumentoEntrata;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.RicercaDocumentoEntrataResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.RicercaDocumentoSpesa;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.RicercaDocumentoSpesaResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.capitolo.RicercaCapitoloEntrataGestione;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.capitolo.RicercaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.capitolo.RicercaCapitoloUscitaGestione;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.capitolo.RicercaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.liquidazione.RicercaEstesaLiquidazioni;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.liquidazione.RicercaEstesaLiquidazioniResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.liquidazione.RicercaLiquidazione;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.liquidazione.RicercaLiquidazioneResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione.RicercaAccertamento;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione.RicercaAccertamentoResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione.RicercaImpegno;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.movimentoGestione.RicercaImpegnoResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo.RicercaEstesaOrdinativiSpesa;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo.RicercaEstesaOrdinativiSpesaResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo.RicercaOrdinativoIncasso;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo.RicercaOrdinativoIncassoResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo.RicercaOrdinativoSpesa;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.ordinativo.RicercaOrdinativoSpesaResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.provvisori.RicercaProvvisoriDiCassa;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.provvisori.RicercaProvvisoriDiCassaResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.soggetto.RicercaDettaglioSoggetti;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.soggetto.RicercaDettaglioSoggettiResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.soggetto.RicercaSinteticaSoggetti;
import it.csi.siac.siacintegser.frontend.webservice.msg.ricerche.soggetto.RicercaSinteticaSoggettiResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.test.Test;
import it.csi.siac.siacintegser.frontend.webservice.msg.test.TestResponse;

@WebService(targetNamespace = RicercheSvcDictionary.NAMESPACE, name = "RicercaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface RicercaService {
	@WebMethod
	@WebResult TestResponse test(@WebParam Test request);

	@WebMethod
	@WebResult RicercaCapitoloUscitaGestioneResponse ricercaCapitoloUscitaGestione(@WebParam RicercaCapitoloUscitaGestione request);
	
	@WebMethod
	@WebResult RicercaCapitoloEntrataGestioneResponse ricercaCapitoloEntrataGestione(@WebParam RicercaCapitoloEntrataGestione request);
	
	@WebMethod
	@WebResult RicercaSinteticaSoggettiResponse ricercaSinteticaSoggetti(@WebParam RicercaSinteticaSoggetti request);
	
	@WebMethod
	@WebResult RicercaDettaglioSoggettiResponse ricercaDettaglioSoggetto(@WebParam RicercaDettaglioSoggetti request);
	
	@WebMethod
	@WebResult RicercaImpegnoResponse ricercaImpegno(@WebParam RicercaImpegno request);
	
	@WebMethod
	@WebResult RicercaProvvisoriDiCassaResponse ricercaProvvisoriDiCassa(@WebParam RicercaProvvisoriDiCassa request);
	
	@WebMethod
	@WebResult RicercaAccertamentoResponse ricercaAccertamento(@WebParam RicercaAccertamento request);
	
	@WebMethod
	@WebResult RicercaLiquidazioneResponse ricercaLiquidazione(@WebParam RicercaLiquidazione request);
	
	@WebMethod
	@WebResult RicercaOrdinativoSpesaResponse ricercaOrdinativoSpesa(@WebParam RicercaOrdinativoSpesa request);
	
	@WebMethod
	@WebResult RicercaOrdinativoIncassoResponse ricercaOrdinativoIncasso(@WebParam RicercaOrdinativoIncasso request);
	
	@WebMethod
	@WebResult RicercaDocumentoSpesaResponse ricercaDocumentoSpesa(@WebParam RicercaDocumentoSpesa request);
	
	@WebMethod
	@WebResult RicercaDocumentoEntrataResponse ricercaDocumentoEntrata(@WebParam RicercaDocumentoEntrata request);
	
	@WebMethod
	@WebResult RicercaEstesaLiquidazioniResponse ricercaEstesaLiquidazioni(@WebParam RicercaEstesaLiquidazioni request);
	
	@WebMethod
	@WebResult RicercaEstesaOrdinativiSpesaResponse ricercaEstesaOrdinativiSpesa(@WebParam RicercaEstesaOrdinativiSpesa request);

	@WebMethod
	@WebResult RicercaMovimentiGestioneOOPPResponse ricercaMovimentiGestioneOOPP(@WebParam RicercaMovimentiGestioneOOPP request);

	@WebMethod
	@WebResult RicercaEstesaMandatiOOPPResponse ricercaEstesaMandatiOOPP(@WebParam RicercaEstesaMandatiOOPP request);

	@WebMethod
	@WebResult RicercaDocumentiSpesaOOPPResponse ricercaDocumentiSpesaOOPP(@WebParam RicercaDocumentiSpesaOOPP request);

}
