package com.example.hospital.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ward extends HospitalObject {

    private WardType wardType;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ward_id")
    private Set<Doctor> doctors;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ward_id")
    private Set<Patient> patients;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ward_id")
    private Set<Room> rooms;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ward_id")
    private Set<Employee> employees;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "leader_id", referencedColumnName = "id")
    private Doctor leader;

    public WardType getWardType() {
        return wardType;
    }

    public void setWardType(WardType wardType) {
        this.wardType = wardType;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Doctor getLeader() {
        return leader;
    }

    public void setLeader(Doctor leader) {
        this.leader = leader;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
