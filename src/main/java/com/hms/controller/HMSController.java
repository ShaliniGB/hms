package com.hms.controller;

import com.hms.model.Doctor;
import com.hms.model.Rooms;
import com.hms.service.HMSInquiryService;
import com.hms.service.RoomsInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hms")
public class HMSController {
	
	@Autowired
	HMSInquiryService service;
	@Autowired
	RoomsInquiryService roomService;
	
	@RequestMapping("/")
	String home() {
		return "<h1>Welcome to Hospital Management System</h1>";
	}

	//showAllSpecialist
	@RequestMapping("/specialists")
	List<Doctor> showAllSpecialists(){
		return service.showAllSpecialists();
	}
	//specialistByName
	@RequestMapping("/specialists/{name}")
	List<Map<String, Object>> searchSpecialistByName(@PathVariable("name") String name ) {
		return service.searchSpecialistByName(name);
	}
	
	@RequestMapping("/doctor/{name}")
	Doctor searchDoctorByName(@PathVariable("name") String name) {
		return service.searchDoctorByName(name);
	}

	@RequestMapping("/getAllRooms")
	List<Rooms> showAllRoomsAvailability(){
		return roomService.showAllRooms();
	}

	@RequestMapping("/room/{type}")
	Rooms searchByRoomType(@PathVariable("name") String type){
		return roomService.searchRoomsByType(type);
	}

}
