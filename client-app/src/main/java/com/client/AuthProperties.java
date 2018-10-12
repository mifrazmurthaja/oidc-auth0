package com.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.auth0")
public class AuthProperties {
    
    private String authorizationURI;
    private String tokenURI;
    private String audienceURI;

    public String getAuthorizationURI() {
        return authorizationURI;
    }
    public void setAuthorizationURI(String authorizationURI) {
        this.authorizationURI = authorizationURI;
    }

    public String getTokenURI() {
        return tokenURI;
    }
    public void setTokenURI(String tokenURI) {
        this.tokenURI = tokenURI;
    }

    public String getAudienceURI() {
        return audienceURI;
    }
    public void setAudienceURI(String audienceURI) {
        this.audienceURI = audienceURI;
    }
}
