package com.example.hospital.rest;

import com.example.hospital.model.Patient;
import com.example.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("")
    public List<Patient> findAll() {
        return this.patientService.findAll();
    }

    @PostMapping("")
    public Patient save(@RequestBody Patient patient) {

        patient.setAccountValid(true);
        return this.patientService.save(patient);
    }

    @GetMapping("{id}")
    public Patient getById(@PathVariable String id) {
        return this.patientService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        this.patientService.delete(id);
    }
}
