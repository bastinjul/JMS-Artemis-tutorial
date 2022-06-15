package be.bastinjul.jms_tuto.services;

import be.bastinjul.jms_tuto.api.TestController;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ListenerService {

    private static final Logger LOGGER = Logger.getLogger(ListenerService.class.getName());

    @JmsListener(destination = TestController.QUEUE_LISTENER_NAME)
    public void receiveMessage(String message) {
        LOGGER.info("Received <" + message + ">");
    }
}
