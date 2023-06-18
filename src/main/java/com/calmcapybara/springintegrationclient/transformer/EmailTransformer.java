package com.calmcapybara.springintegrationclient.transformer;

import jakarta.mail.MessagingException;
import org.springframework.integration.mail.transformer.AbstractMailMessageTransformer;
import org.springframework.integration.support.AbstractIntegrationMessageBuilder;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EmailTransformer extends AbstractMailMessageTransformer<String> {
    @Override
    protected AbstractIntegrationMessageBuilder<String> doTransform(jakarta.mail.Message mailMessage) {
        String s = null;
        try {
            if (mailMessage.getSubject().toUpperCase().equals("SPRING")) {
                s = mailMessage.getContent().toString();
            }
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return MessageBuilder.withPayload(s);
    }
}
