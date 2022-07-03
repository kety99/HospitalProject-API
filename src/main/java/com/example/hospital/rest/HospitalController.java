package com.example.hospital.rest;

import com.example.hospital.model.Hospital;
import com.example.hospital.services.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/hospital")
public class HospitalController {

    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("")
    public List<Hospital> getAll() {
        return this.hospitalService.findAll();
    }

    @PostMapping("")
    public Hospital save(@RequestBody Hospital hospital) {
        return this.hospitalService.save(hospital);
    }

    @GetMapping("{id}")
    public Hospital getById(@PathVariable String id) {
        return this.hospitalService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        this.hospitalService.delete(id);
    }
}
