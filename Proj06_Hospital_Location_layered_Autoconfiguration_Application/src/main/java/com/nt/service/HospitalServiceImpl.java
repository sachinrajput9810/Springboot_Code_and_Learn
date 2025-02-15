package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IHospitalDao;
import com.nt.models.Hospital;

@Service("hospService")
public class HospitalServiceImpl implements IHospitalService {

	@Autowired
	private IHospitalDao hospDao ;
	
	@Override
	public List<Hospital> fetchHospitalByLocation(String loc1, String loc2, String loc3) throws Exception {
		List<Hospital> list = hospDao.getHospitalByLocation(loc1, loc2, loc3) ;
		return list ;
	}

}
