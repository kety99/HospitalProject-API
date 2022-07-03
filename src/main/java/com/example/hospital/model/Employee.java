package com.example.hospital.model;

import javax.persistence.*;

@Entity
public class Employee extends User{

    private EmployeeType employeeType;
    private Number salary;

    @ManyToOne
    private Ward ward;

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Number getSalary() {
        return salary;
    }

    public void setSalary(Number salary) {
        this.salary = salary;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }
}
