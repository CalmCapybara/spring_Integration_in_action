package com.calmcapybara.springintegrationclient.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "action.integration")
@Getter
@Setter
public class EmailProperties {
    private String username;
    private String password;
    private String host;
    private String mailbox;
    private final long pollRate = 30000;

    public String getImapUrl() {
        return String.format("imaps://%s:%s@%s/%s", username, password, host, mailbox);
    }
}
