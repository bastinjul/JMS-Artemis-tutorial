package be.bastinjul.jms_tuto.services;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private final JmsTemplate jms;

    public ConsumerService(JmsTemplate jmsTemplate) {
        this.jms = jmsTemplate;
    }

    public String synchronousReceive(String destination) {
        return (String) jms.receiveAndConvert("queue");
    }
}
