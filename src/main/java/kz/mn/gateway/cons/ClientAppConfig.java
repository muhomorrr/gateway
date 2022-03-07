package kz.mn.gateway.cons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientAppConfig {
    @Bean
    public Jaxb2Marshaller marshaller()
    {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("kz.mn.gateway.ws.model");
        return marshaller;
    }

    @Bean
    public ConsumerClient userClient(Jaxb2Marshaller marshaller)
    {
        ConsumerClient uc = new ConsumerClient();
        uc.setDefaultUri("http://localhost:8080/ws/decisive.wsdl");
        uc.setMarshaller(marshaller);
        uc.setUnmarshaller(marshaller);
        return uc;
    }
}
