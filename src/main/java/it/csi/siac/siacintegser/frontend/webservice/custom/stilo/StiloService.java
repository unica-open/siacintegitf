/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.custom.stilo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacintegser.frontend.webservice.msg.custom.stilo.RicercaMovimentoGestioneStilo;
import it.csi.siac.siacintegser.frontend.webservice.msg.custom.stilo.RicercaMovimentoGestioneStiloResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraAttiAmministrativi;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraAttiAmministrativiAsyncResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraAttiAmministrativiResponse;

@WebService(targetNamespace = StiloSvcDictionary.NAMESPACE, name = "StiloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface StiloService {
	
	
	@WebMethod
	@WebResult RicercaMovimentoGestioneStiloResponse ricercaMovimentoGestione(@WebParam RicercaMovimentoGestioneStilo request);
	

	@WebMethod
	@WebResult
	ElaboraAttiAmministrativiResponse elaboraAttiAmministrativi(@WebParam ElaboraAttiAmministrativi request);

	@WebMethod
	@WebResult
	ElaboraAttiAmministrativiAsyncResponse elaboraAttiAmministrativiAsync(@WebParam ElaboraAttiAmministrativi request);

	
	
}
