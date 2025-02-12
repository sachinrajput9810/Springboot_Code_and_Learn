package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.models.Hospital;
@Repository("hospDAO")
public class HospitalDaoImpl implements IHospitalDao {
	private static final String GET_HOSPITAL_LOCATION = "SELECT SNO, Hospital_Name , Hospital_Location FROM HOSPITAL WHERE Hospital_Location IN (?,?,?)" ;
	
	@Autowired
	DataSource ds ;
	
	@Override
	public List<Hospital> getHospitalByLocation(String location1, String location2, String location3) throws Exception {
		
		List<Hospital> hospitalList = null ;
		
		try(Connection con = ds.getConnection() ; PreparedStatement ps = con.prepareStatement(GET_HOSPITAL_LOCATION) ;) {
			ps.setString(1, location1);
			ps.setString(2, location2);
			ps.setString(3, location3);
			
			try(ResultSet rs = ps.executeQuery() ;) {
				hospitalList = new ArrayList<Hospital>() ;
				while(rs.next()) {
					Hospital hosp = new Hospital() ;
					hosp.setSno(rs.getInt(1));
					hosp.setHospitalName(rs.getString(2)) ;
					hosp.setHospitalLocation(rs.getString(3));
					hospitalList.add(hosp) ;
				}
			} catch (SQLException se) {
				se.printStackTrace();
				throw se ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e ;
		}
		
		return hospitalList ;
	}

}
