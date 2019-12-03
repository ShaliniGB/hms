package com.hms.dao.impl;

import com.hms.constants.Doctor_Constant;
import com.hms.dao.DoctorDAO;
import com.hms.model.Doctor;
import com.hms.rowmapper.DoctorRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DoctorDAOImpl implements DoctorDAO {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    DoctorRowMapper doctorRowMapper;

    @Override
    public List<Doctor> allSpecialist() {
        return namedParameterJdbcTemplate.query(Doctor_Constant.FETCH_SQL, doctorRowMapper);
    }

    @Override
    public List<Map<String, Object>> searchSpecialistByName(String name) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        return namedParameterJdbcTemplate.queryForList(Doctor_Constant.FETCH_SQL_BY_NAME, parameter);
    }

    @Override
    public Doctor searchByDoctorName(String name) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        return namedParameterJdbcTemplate.queryForObject(Doctor_Constant.FETCH_SQL_BY_ID, parameter, new BeanPropertyRowMapper<>(Doctor.class));
    }

}
