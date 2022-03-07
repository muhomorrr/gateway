package kz.mn.gateway.cons;

import kz.mn.gateway.ws.model.IncomingRequest;
import kz.mn.gateway.ws.model.IncomingResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class ConsumerClient extends WebServiceGatewaySupport {
    public IncomingResponse getMessage(IncomingRequest request)
    {
        IncomingResponse response = (IncomingResponse) getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback("http://localhost:8080/ws"));
        return response;
    }
}
