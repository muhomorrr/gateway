//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.09 at 12:21:43 PM ALMT 
//


package kz.mn.gateway.ws.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.mn.gateway.ws.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.mn.gateway.ws.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncomingRequest }
     * 
     */
    public IncomingRequest createIncomingRequest() {
        return new IncomingRequest();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

    /**
     * Create an instance of {@link MessageData }
     * 
     */
    public MessageData createMessageData() {
        return new MessageData();
    }

    /**
     * Create an instance of {@link IncomingResponse }
     * 
     */
    public IncomingResponse createIncomingResponse() {
        return new IncomingResponse();
    }

    /**
     * Create an instance of {@link ResponseInfo }
     * 
     */
    public ResponseInfo createResponseInfo() {
        return new ResponseInfo();
    }

    /**
     * Create an instance of {@link ChangeStatusRequest }
     * 
     */
    public ChangeStatusRequest createChangeStatusRequest() {
        return new ChangeStatusRequest();
    }

    /**
     * Create an instance of {@link ChangeStatusMessageData }
     * 
     */
    public ChangeStatusMessageData createChangeStatusMessageData() {
        return new ChangeStatusMessageData();
    }

    /**
     * Create an instance of {@link RequesterWSDL }
     * 
     */
    public RequesterWSDL createRequesterWSDL() {
        return new RequesterWSDL();
    }

}
