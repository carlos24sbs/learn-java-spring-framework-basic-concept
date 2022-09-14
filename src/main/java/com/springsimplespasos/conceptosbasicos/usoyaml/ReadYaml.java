package com.springsimplespasos.conceptosbasicos.usoyaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "server")
@PropertySource(value = "classpath:server.yml", factory = YamlPropertiesSourceFactory.class)
public class ReadYaml
{
    private Map<String, String> application;
    private Map<String, List<String>> config;
    private Map<String, User> user;

    public Map<String, String> getApplication() {
        return application;
    }

    public void setApplication(Map<String, String> application) {
        this.application = application;
    }

    public Map<String, List<String>> getConfig() {
        return config;
    }

    public void setConfig(Map<String, List<String>> config) {
        this.config = config;
    }

    public Map<String, User> getUser() {
        return user;
    }

    public void setUser(Map<String, User> user) {
        this.user = user;
    }
}
