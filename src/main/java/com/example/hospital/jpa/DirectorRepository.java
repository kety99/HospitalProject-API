package com.example.hospital.jpa;

import com.example.hospital.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, String> {
}
