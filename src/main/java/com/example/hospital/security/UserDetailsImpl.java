package com.example.hospital.security;

import com.example.hospital.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class UserDetailsImpl extends User implements UserDetails {

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new LinkedList<>();
        authorities.add((GrantedAuthority) () -> getUserRole().toString());
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.getAccountValid();
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.getAccountValid();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.getAccountValid();
    }

    @Override
    public boolean isEnabled() {
        return super.getAccountValid();
    }
}
