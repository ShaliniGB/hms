package com.hms.dao;

import com.hms.model.Rooms;

import java.util.List;

public interface RoomsAvailabilityDAO {
    public List<Rooms> allRoomDetails();
    public Rooms roomDetails(String type);
}
