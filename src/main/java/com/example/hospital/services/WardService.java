package com.example.hospital.services;

import com.example.hospital.jpa.WardRepository;
import com.example.hospital.model.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class WardService {

    private final WardRepository wardRepository;

    @Autowired
    public WardService(WardRepository wardRepository) {
        this.wardRepository = wardRepository;
    }

    public Ward save(Ward ward) {
        return this.wardRepository.save(ward);
    }

    public Ward findById(String id) {
        return this.wardRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Ward" + id + "not found!"));
    }

    public List<Ward> findAll() {
        return this.wardRepository.findAll();
    }

    public void deleteById(String id) {
        this.wardRepository.deleteById(id);
    }
}
