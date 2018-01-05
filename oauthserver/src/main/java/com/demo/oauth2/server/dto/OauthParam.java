package com.demo.oauth2.server.dto;

import java.io.Serializable;

public class OauthParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String authzEndpoint;
    private String tokenEndpoint;
    private String authzCode;
    private String accessToken;
    private Long expiresIn;
    private String refreshToken;
    private String scope;
    private String state;
    private String resourceUrl;
    private String resource;
    private String application;
    private String requestType;
    private String requestMethod;
    private String idToken;
    private String header;
    private String claimsSet;
    private String jwt;
    private boolean idTokenValid;
 
	private String errorMessage;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getAuthzEndpoint() {
        return authzEndpoint;
    }

    public void setAuthzEndpoint(String authzEndpoint) {
        this.authzEndpoint = authzEndpoint;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public String getAuthzCode() {
        return authzCode;
    }

    public void setAuthzCode(String authzCode) {
        this.authzCode = authzCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = Long.parseLong(expiresIn);
    }
    
    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
    
    public String getState() {
		return state;
	}
    
    public void setState(String state) {
		this.state = state;
	}

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	
	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getClaimsSet() {
		return claimsSet;
	}

	public void setClaimsSet(String claimsSet) {
		this.claimsSet = claimsSet;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
    public boolean isIdTokenValid() {
		return idTokenValid;
	}

	public void setIdTokenValid(boolean idTokenValid) {
		this.idTokenValid = idTokenValid;
	}
    
    
}
