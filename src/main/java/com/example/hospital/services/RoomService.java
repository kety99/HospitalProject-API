package com.example.hospital.services;

import com.example.hospital.jpa.RoomRepository;
import com.example.hospital.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room save(Room room){
        return this.roomRepository.save(room);
    }

    public Room findById(String id){
        return this.roomRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Room"+id+"not found!"));
    }

    public List<Room> findAll(){
        return this.roomRepository.findAll();
    }

    public void delete(String id){
        this.roomRepository.deleteById(id);
    }

}
