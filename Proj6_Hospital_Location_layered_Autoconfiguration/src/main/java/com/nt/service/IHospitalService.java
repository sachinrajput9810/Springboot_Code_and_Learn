package com.nt.service;

import java.util.List;

import com.nt.models.Hospital;

public interface IHospitalService {
	public List<Hospital> fetchHospitalByLocation(String loc1 , String loc2 , String loc3) throws Exception;
}
