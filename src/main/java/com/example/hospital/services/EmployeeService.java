package com.example.hospital.services;

import com.example.hospital.jpa.DoctorRepository;
import com.example.hospital.jpa.EmployeeRepository;
import com.example.hospital.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public Employee findById(String id){
        return this.employeeRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Employee"+ id +"not found!"));
    }

    public List<Employee> findAll(){
        return this.employeeRepository.findAll();
    }

    public void delete(String id){
        this.employeeRepository.deleteById(id);
    }
}
