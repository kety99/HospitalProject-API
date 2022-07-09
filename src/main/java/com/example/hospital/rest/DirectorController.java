package com.example.hospital.rest;

import com.example.hospital.model.Director;
import com.example.hospital.model.Doctor;
import com.example.hospital.services.DirectrorSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/director")
public class DirectorController {

    private final DirectrorSerivce directrorSerivce;

    @Autowired
    public DirectorController(DirectrorSerivce directrorSerivce) {
        this.directrorSerivce = directrorSerivce;
    }

    @GetMapping("")
    public List<Director> getAll() {
        return this.directrorSerivce.findAll();
    }

    @PostMapping("")
    public Director save(@RequestBody Director director) {
        director.setAccountValid(true);
        return this.directrorSerivce.save(director);
    }

    @GetMapping("{id}")
    public Director getById(@PathVariable String id) {
        return this.directrorSerivce.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        this.directrorSerivce.delete(id);
    }
}
