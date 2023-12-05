/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.documenti;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraAttiAmministrativi;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraAttiAmministrativiAsyncResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraAttiAmministrativiResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraDocumento;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraDocumentoAsyncResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.ElaboraDocumentoResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.LeggiStatoElaborazioneDocumento;
import it.csi.siac.siacintegser.frontend.webservice.msg.documenti.LeggiStatoElaborazioneDocumentoResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.test.Test;
import it.csi.siac.siacintegser.frontend.webservice.msg.test.TestResponse;

@WebService(targetNamespace = DocumentiSvcDictionary.NAMESPACE, name = "DocumentiService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentiService {
	@WebMethod
	@WebResult
	TestResponse test(@WebParam Test request);

	@WebMethod
	@WebResult
	ElaboraDocumentoResponse elaboraDocumento(@WebParam ElaboraDocumento request);

	@WebMethod
	@WebResult
	ElaboraDocumentoAsyncResponse elaboraDocumentoAsync(@WebParam ElaboraDocumento request);

	@WebMethod
	@WebResult
	ElaboraAttiAmministrativiResponse elaboraAttiAmministrativi(@WebParam ElaboraAttiAmministrativi request);

	@WebMethod
	@WebResult
	ElaboraAttiAmministrativiAsyncResponse elaboraAttiAmministrativiAsync(@WebParam ElaboraAttiAmministrativi request);

	@WebMethod
	@WebResult
	LeggiStatoElaborazioneDocumentoResponse leggiStatoElaborazioneDocumento(@WebParam LeggiStatoElaborazioneDocumento request);

}
