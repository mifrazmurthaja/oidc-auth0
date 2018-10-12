package com.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.net.URLEncoder;

@Component
@ConfigurationProperties("app.client")
public class ClientProperties {
    
    private String clientID;
    private String clientSecret;
    private String scope;
    private String redirectURI;

    public String getClientID() {
        return clientID;
    }
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getScope() {
        String encodedScope = "";
        try{
            encodedScope = URLEncoder.encode(scope,"UTF-8");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return encodedScope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRedirectURI() {
        String encodedUrl = "";
        try{
            encodedUrl = URLEncoder.encode(redirectURI,"UTF-8");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return encodedUrl;
    }
    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }    
}
