package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.TouristPlaceDAOImpl;
import com.nt.models.TouristSpot;

@Service("touristService")
public class TouristServiceImpl implements ITouristService {

	@Autowired
	private TouristPlaceDAOImpl touristDao ;
	
	@Override
	public List<TouristSpot> gatherTouristSpot(String state1, String state2, String state3) throws Exception {
		List<TouristSpot> touristList = touristDao.getAllTouristSpot(state1, state2, state3) ;
		return touristList ;
	}
	
}
