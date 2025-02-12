package com.nt.dao;

import java.util.List;

import com.nt.models.Hospital;

public interface IHospitalDao {
	public List<Hospital> getHospitalByLocation(String location1 , String location2 , String location3) throws Exception ;
}
