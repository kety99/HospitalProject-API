package com.example.hospital.jpa;

import com.example.hospital.model.Ward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WardRepository extends JpaRepository<Ward,String> {
}
