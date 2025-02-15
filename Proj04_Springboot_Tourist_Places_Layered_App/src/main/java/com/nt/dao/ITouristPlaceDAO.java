package com.nt.dao;

import java.util.List;

import com.nt.models.TouristSpot;

public interface ITouristPlaceDAO {
	public List<TouristSpot> getAllTouristSpot(String state1 , String state2 , String state3) throws Exception;
}
