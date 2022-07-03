package com.example.hospital.rest;

import com.example.hospital.model.Room;
import com.example.hospital.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("")
    public List<Room> getAll() {
        return this.roomService.findAll();
    }

    @PostMapping("")
    public Room save(@RequestBody Room room) {
        return this.roomService.save(room);
    }

    @GetMapping("{id}")
    public Room findById(@PathVariable String id) {
        return this.roomService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        this.roomService.delete(id);
    }
}
