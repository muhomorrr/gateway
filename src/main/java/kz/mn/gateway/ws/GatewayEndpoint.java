package kz.mn.gateway.ws;

import kz.mn.gateway.cons.ConsumerClient;
import kz.mn.gateway.ws.model.ChangeStatusRequest;
import kz.mn.gateway.ws.model.ChangeStatusResponse;
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeStatusRequest")
    @ResponsePayload
    public ChangeStatusResponse saveRequest(@RequestPayload ChangeStatusRequest request) {
        ChangeStatusResponse changeStatusResponse = new ChangeStatusResponse();
        changeStatusResponse.setOk("ok");
        System.out.println("Request changed status!");
        System.out.println("Request ID: " + request.getRequestId());
        System.out.println("Request Content: " + request.getContent());
        System.out.println("Request New Status: " + request.getStatus());
        System.out.println("Request Sender: " + request.getIin() + " " + request.getLastname() + " "
                + request.getFirstname() + " " + request.getPatronymic());
        return changeStatusResponse;
    }
}
