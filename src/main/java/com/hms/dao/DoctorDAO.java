package com.hms.dao;

import com.hms.model.Doctor;

import java.util.List;
import java.util.Map;

public interface DoctorDAO {
	public List<Doctor> allSpecialist();
	public List<Map<String, Object>> searchSpecialistByName(String name);
	public Doctor searchByDoctorName(String name);
	
}
