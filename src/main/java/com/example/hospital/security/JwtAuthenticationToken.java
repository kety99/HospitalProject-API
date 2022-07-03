package com.example.hospital.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    private Object credentials;

    private Object principal;

    public JwtAuthenticationToken(Collection<? extends GrantedAuthority> authorities, Object credentials, Object principal) {
        super(authorities);
        this.credentials = credentials;
        this.principal = principal;
        super.setAuthenticated(true);
    }

    public JwtAuthenticationToken(Object credentials, Object principal) {
        super(null);
        this.credentials = credentials;
        this.principal = principal;
        super.setAuthenticated(false);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
