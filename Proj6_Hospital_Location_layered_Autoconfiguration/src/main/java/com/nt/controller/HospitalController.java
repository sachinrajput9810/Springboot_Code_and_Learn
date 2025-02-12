package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.models.Hospital;
import com.nt.service.IHospitalService;

@Controller("controller")
public class HospitalController {
	
	@Autowired
	private IHospitalService hospitalService ;
	
	public List<Hospital> getherHospitalByName(String loc1 , String loc2 , String loc3) throws Exception{
		List<Hospital> list = hospitalService.fetchHospitalByLocation(loc1, loc2, loc3) ;
		return list ;
	}
}
