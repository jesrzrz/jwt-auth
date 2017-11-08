package es.jr.spring.jwt.security;

import java.io.Serializable;

public class JwtAuthenticationRequest implements Serializable {
	
	private static final long serialVersionUID = -4402793258423170971L;

    private String username;
    private String password;
	
    public JwtAuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}
