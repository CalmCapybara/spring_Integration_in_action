package com.calmcapybara.springintegrationclient.config;

import com.calmcapybara.springintegrationclient.transformer.EmailTransformer;
import com.calmcapybara.springintegrationclient.transformer.StringHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.mail.dsl.Mail;

@Configuration
public class EmailListenerConfiguration {

    @Bean
    public IntegrationFlow EmailIntegrationFlow(EmailProperties properties, EmailTransformer emailTransformer, StringHandler handler) {
        return IntegrationFlow.from(Mail.imapInboundAdapter(properties.getImapUrl()),
                        e -> e.poller(Pollers.fixedDelay(properties.getPollRate())))
                .transform(emailTransformer)
                .handle(handler)
                .get();
    }
}

