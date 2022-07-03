package com.example.hospital.services;

import com.example.hospital.jpa.DoctorRepository;
import com.example.hospital.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor save(Doctor doctor) {
        return this.doctorRepository.save(doctor);
    }

    public Doctor findById(String id) {
        return this.doctorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Doctor: " + id + "not found!"));
    }

    public List<Doctor> findAll(){
        return this.doctorRepository.findAll();
    }

    public void delete(String id){
        this.doctorRepository.deleteById(id);
    }

}
