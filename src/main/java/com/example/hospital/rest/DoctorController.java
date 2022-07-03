package com.example.hospital.rest;

import com.example.hospital.model.Doctor;
import com.example.hospital.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("")
    public List<Doctor> getAll() {
        return this.doctorService.findAll();
    }

    @PostMapping("")
    public Doctor save(@RequestBody Doctor doctor) {
        return this.doctorService.save(doctor);
    }

    @GetMapping("{id}")
    public Doctor getById(@PathVariable String id) {
        return this.doctorService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        this.doctorService.delete(id);
    }
}
