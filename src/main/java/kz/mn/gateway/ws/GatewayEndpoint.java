package kz.mn.gateway.ws;

import kz.mn.gateway.cons.ConsumerClient;
import kz.mn.gateway.ws.model.*;
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeStatusRequest")
    @ResponsePayload
    public IncomingResponse saveRequest(@RequestPayload ChangeStatusRequest request) {
        IncomingResponse incomingResponse = new IncomingResponse();
        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setRequestId(request.getMessageInfo().getId());
        responseInfo.setStatus("OK");
        incomingResponse.setInfo(responseInfo);
        System.out.println("Request changed status!");
        System.out.println("Request ID: " + request.getMessageInfo().getId());
        System.out.println("Request Sender: " + request.getMessageInfo().getSender());
        System.out.println("Request Reciever: " + request.getMessageInfo().getReceiver());
        System.out.println("Request Status: " + request.getMessageData().getStatus());
        return incomingResponse;
    }
}
