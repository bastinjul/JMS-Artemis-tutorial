package be.bastinjul.jms_tuto.services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ListenerService {

    private static final Logger LOGGER = Logger.getLogger(ListenerService.class.getName());

    @JmsListener(destination = "queue")
    public void receiveMessage(String message) {
        LOGGER.info("Received <" + message + ">");
    }
}
