package com.hms.service;


import com.hms.dao.impl.DoctorDAOImpl;
import com.hms.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HMSInquiryService {
	
	@Autowired
	DoctorDAOImpl doctorDao;

	List<Doctor> listDoctors;
	
	public List<Doctor> showAllSpecialists(){
		return doctorDao.allSpecialist();
	}

	public List<Map<String, Object>> searchSpecialistByName(String doctorName){
		return doctorDao.searchSpecialistByName(doctorName);
	}
	
	public Doctor searchDoctorByName(String name) {
		return doctorDao.searchByDoctorName(name);
	}

}
