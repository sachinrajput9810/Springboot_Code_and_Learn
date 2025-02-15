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

import com.nt.models.TouristSpot;
@Repository("touristDAO")
public class TouristPlaceDAOImpl implements ITouristPlaceDAO {
	private static final String TOURIST_PLACE_QUERY = "SELECT SNO , STATE , TOURIST_PLACE FROM TOURISTPLACE WHERE STATE IN (?,?,?)" ;

	
	@Autowired
	DataSource ds ;
	
	@Override
	public List<TouristSpot> getAllTouristSpot(String state1, String state2, String state3) throws Exception {
		
		List<TouristSpot> spotList = null ;
		
		try(Connection con = ds.getConnection() ; PreparedStatement ps = con.prepareStatement(TOURIST_PLACE_QUERY) ;) {
			ps.setString(1, state1);
			ps.setString(2, state2);
			ps.setString(3, state3);
			try(ResultSet rs = ps.executeQuery() ;){
				spotList = new ArrayList<TouristSpot>() ;
				while(rs.next()) {
					TouristSpot tspot = new TouristSpot() ;
					tspot.setSno(rs.getInt(1));
					tspot.setState(rs.getString(2));
					tspot.setTouristPlace(rs.getString(3));
					spotList.add(tspot) ;
				}
				
			} catch (SQLException se) {
				se.printStackTrace(); 
				throw se ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e ;
		}
				
		return spotList ;
	}

}
