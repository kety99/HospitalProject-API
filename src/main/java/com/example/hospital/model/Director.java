package com.example.hospital.model;

import javax.persistence.Entity;

@Entity
public class Director extends Doctor {

    @Override
    public void setUserRole(UserRole userRole) {
        this.userRole = UserRole.Director;
    }

    @Override
    public UserRole getUserRole() {
        return UserRole.Director;
    }
}
