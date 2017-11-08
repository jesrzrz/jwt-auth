package es.jr.spring.jwt.security.service;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable{
	
	private static final long serialVersionUID = -3115380705933428297L;
 
	private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
}

}
