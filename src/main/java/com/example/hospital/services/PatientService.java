package com.example.hospital.services;

import com.example.hospital.jpa.PatientRepository;
import com.example.hospital.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient save(Patient patient){
        return this.patientRepository.save(patient);
    }

    public List<Patient> findAll(){
        return this.patientRepository.findAll();
    }

    public Patient findById(String id){
        return this.patientRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Patient"+id+"not found!"));
    }

    public void delete(String id){
        this.patientRepository.deleteById(id);
    }
}
