package io.kindler.slack.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Data
@Component
@ConfigurationProperties(prefix = "slack.bot.jira")
public class JiraProperties {
    private String pattern;
    private String scheme;
    private String host;
    private String version;
    private Auth auth;

    @Data
    public static class Auth {
        private String username;
        private String password;

        public String getToken() {
            return Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes());
        }
    }
}
