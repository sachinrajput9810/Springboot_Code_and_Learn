package com.nt.service;

import java.util.List;

import com.nt.models.TouristSpot;

public interface ITouristService {
	
	public List<TouristSpot> gatherTouristSpot(String state1 , String state2 , String state3) throws Exception;
}
