package com.calmcapybara.springintegrationclient.transformer;

import org.springframework.integration.core.GenericHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class StringHandler implements GenericHandler<String> {

    @Override
    public Object handle(String payload, MessageHeaders headers) {
        System.out.println(payload);
        return null;
    }
}
