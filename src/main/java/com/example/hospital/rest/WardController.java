package com.example.hospital.rest;

import com.example.hospital.model.Ward;
import com.example.hospital.services.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wards")
public class WardController {

    private final WardService wardService;

    @Autowired
    public WardController(WardService wardService) {
        this.wardService = wardService;
    }

    @GetMapping("")
    public List<Ward> findAll() {
        return this.wardService.findAll();
    }

    @PostMapping("")
    public Ward save(@RequestBody Ward ward) {
        return this.wardService.save(ward);
    }

    @GetMapping("{id}")
    public Ward getById(@PathVariable String id) {
        return this.wardService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        this.wardService.deleteById(id);
    }
}
