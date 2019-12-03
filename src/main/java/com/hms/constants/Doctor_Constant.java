package com.hms.constants;

public class Doctor_Constant {
	
	public static final String FETCH_SQL_BY_ID = "select * from Doctor where name = :name";
	public static final String FETCH_SQL_BY_NAME = "select * from Doctor where designation = :name";
	public static final String FETCH_SQL = "select * from Doctor";
}
