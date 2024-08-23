package br.com.estudo.rest_springboot_application.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Classe componente que recebera as propriedades e credenciais do token
 *  via 'application.properties' .
 */
@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {

    public static String PREFIX;
    public static String KEY;
    public static String EXPIRATION;

    public void setPrefix(String prefix) {
        PREFIX = prefix;
    }
    public void setKey(String key) {
        KEY = key;
    }
    public void setExpiration(String expiration) {
        EXPIRATION = expiration;
    }
}
