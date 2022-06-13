package be.bastinjul.jms_tuto.services;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final JmsTemplate jms;

    public ProducerService(JmsTemplate jmsTemplate) {
        this.jms = jmsTemplate;
    }

    public void sendMessage(String message) {
        jms.convertAndSend("queue", message);
    }
}
