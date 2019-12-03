package com.hms.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="room_id")
    private long id;
    private String roomType;
    private int totalRooms;
    private int occupiedRooms;
    private int availableRooms;

}
