package com.hms.service;

import com.hms.dao.RoomsAvailabilityDAO;
import com.hms.model.Doctor;
import com.hms.model.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomsInquiryService {
    @Autowired
    RoomsAvailabilityDAO roomsDao;

    List<Doctor> listDoctors;

    public List<Rooms> showAllRooms(){
        return roomsDao.allRoomDetails();
    }


    public Rooms searchRoomsByType(String type) {
        return roomsDao.roomDetails(type);
    }

}
