package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.models.TouristSpot;
import com.nt.service.TouristServiceImpl;

@Controller("controller")
public class TouristController {

	@Autowired
	private TouristServiceImpl touristService ;
	
	public List<TouristSpot> storeTouristList(String state1 , String state2 , String state3) throws Exception{
		List<TouristSpot> list = touristService.gatherTouristSpot(state1, state2, state3) ;
		return list ;
	}
	
	
	
}
