package com.example.hospital.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Doctor extends User{

    private Specialisation specialisation;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "ward_id", referencedColumnName = "id")
    private Ward ward;

    public Doctor() {
        this.setUserRole(UserRole.Doctor);
    }

    public Specialisation getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(Specialisation specialisation) {
        this.specialisation = specialisation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    @Override
    public void setUserRole(UserRole userRole) {
        this.userRole = UserRole.Doctor;
    }

    @Override
    public UserRole getUserRole() {
        return UserRole.Doctor;
    }
}
