package com.example.hospital.jpa;

import com.example.hospital.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,String> {
}
