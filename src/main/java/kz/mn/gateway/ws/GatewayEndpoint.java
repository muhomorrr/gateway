package kz.mn.gateway.ws;

import kz.mn.gateway.cons.ConsumerClient;
import kz.mn.gateway.ws.model.IncomingRequest;
import kz.mn.gateway.ws.model.IncomingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GatewayEndpoint {
    private static final String NAMESPACE_URI = "http://www.decisive.mn.kz";
    private final ConsumerClient consumerClient;

    public GatewayEndpoint(ConsumerClient consumerClient) {
        this.consumerClient = consumerClient;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "IncomingRequest")
    @ResponsePayload
    public IncomingResponse saveRequest(@RequestPayload IncomingRequest request) {
        return consumerClient.getMessage(request);
    }
}
