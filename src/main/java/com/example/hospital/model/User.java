package com.example.hospital.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Person implements UserDetails {

    private String username;

    private String password;

    private Boolean accountValid;

    protected UserRole userRole;

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

    public Boolean getAccountValid() {
        return accountValid;
    }

    public void setAccountValid(Boolean accountValid) {
        this.accountValid = accountValid;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new LinkedList<>();
        authorities.add(new SimpleGrantedAuthority(this.userRole.toString()));
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return getAccountValid();
    }

    @Override
    public boolean isAccountNonLocked() {
        return getAccountValid();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return getAccountValid();
    }

    @Override
    public boolean isEnabled() {
        return getAccountValid();
    }
}
