package com.example.hospital.rest;

import com.example.hospital.model.Employee;
import com.example.hospital.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public List<Employee> getAll(){
        return this.employeeService.findAll();
    }

    @PostMapping("")
    public Employee save(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }

    @GetMapping("{id}")
    public Employee getById(@PathVariable String id){
        return this.employeeService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        this.employeeService.delete(id);
    }
}
