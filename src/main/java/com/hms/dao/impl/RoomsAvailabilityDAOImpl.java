package com.hms.dao.impl;

import com.hms.constants.Doctor_Constant;
import com.hms.constants.Patient_Constant;
import com.hms.dao.RoomsAvailabilityDAO;
import com.hms.model.Doctor;
import com.hms.model.Patient;
import com.hms.model.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RoomsAvailabilityDAOImpl implements RoomsAvailabilityDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	@Override
	public List<Rooms> allRoomDetails() {
		Map<String, String> parameter = new HashMap<>();
		return namedParameterJdbcTemplate.query(Doctor_Constant.FETCH_SQL_ALL_ROOMS,new BeanPropertyRowMapper<>(Rooms.class));
	}

	@Override
	public Rooms roomDetails(String type) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("roomType", type);
        return namedParameterJdbcTemplate.queryForObject(Doctor_Constant.FETCH_SQL_BY_ROOM_TYPE, parameter, new BeanPropertyRowMapper<>(Rooms.class));
	}
}
