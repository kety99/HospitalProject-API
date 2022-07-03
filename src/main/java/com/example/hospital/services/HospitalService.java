package com.example.hospital.services;

import com.example.hospital.jpa.HospitalRepository;
import com.example.hospital.model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    @Autowired
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public Hospital save(Hospital hospital) {
        return this.hospitalRepository.save(hospital);
    }

    public Hospital findById(String id) {
        return this.hospitalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Hospital: " + id + "not found!"));
    }

    public List<Hospital> findAll(){
        return this.hospitalRepository.findAll();
    }

    public void delete(String id){
        this.hospitalRepository.deleteById(id);
    }
}
