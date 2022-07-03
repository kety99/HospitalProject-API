package com.example.hospital.services;

import com.example.hospital.jpa.DirectorRepository;
import com.example.hospital.model.Director;
import com.example.hospital.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class DirectrorSerivce {

    private final DirectorRepository directorRepository;

    @Autowired
    public DirectrorSerivce(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public Director save(Director director) {
        return this.directorRepository.save(director);
    }

    public Director findById(String id) {
        return this.directorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Director: " + id + "not found!"));
    }

    public List<Director> findAll(){
        return this.directorRepository.findAll();
    }

    public void delete(String id){
        this.directorRepository.deleteById(id);
    }

}
