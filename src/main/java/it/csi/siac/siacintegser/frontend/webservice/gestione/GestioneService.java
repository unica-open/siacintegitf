/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.gestione;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.gestione.AggiornaProgettoOOPP;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.gestione.AggiornaProgettoOOPPResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.gestione.InserisciProgettoOOPP;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.oopp.gestione.InserisciProgettoOOPPResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.test.Test;
import it.csi.siac.siacintegser.frontend.webservice.msg.test.TestResponse;

@WebService(targetNamespace = GestioneSvcDictionary.NAMESPACE, name = "GestioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface GestioneService {
	@WebMethod
	@WebResult
	TestResponse test(@WebParam Test request);

	@WebMethod
	@WebResult
	InserisciProgettoOOPPResponse inserisciProgettoOOPP(@WebParam InserisciProgettoOOPP request);

	@WebMethod
	@WebResult
	AggiornaProgettoOOPPResponse aggiornaProgettoOOPP(@WebParam AggiornaProgettoOOPP request);

}
