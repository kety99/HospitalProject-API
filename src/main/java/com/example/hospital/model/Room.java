package com.example.hospital.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Room extends HospitalObject{

    private RoomType roomtype;
    private Boolean occupied;
    private Integer number;
    @ManyToOne
    private Ward ward;

    public RoomType getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(RoomType roomtype) {
        this.roomtype = roomtype;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }
}
