package com.transport.tracking;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Chaklader on 2020-01-07
 */
@Component
public class MessageProcessor {

    @Autowired
    private Data data;

    @JmsListener(destination = "${fleetman.position.queue}")
    public void processPositionMessageFromQueue(Map<String, String> incomingMessage) {
        data.updatePosition(incomingMessage);
    }
}
