package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.models.Employee;

@Repository("empDAO")
public class EmployeeDaoImpl implements IEmployeeDAO {
	
	private static final String GET_EMP_BY_DESG = "SELECT ENO , ENAME , JOB , SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB" ;
	@Autowired
	private DataSource ds ;
	
	
	@Override
	public List<Employee> getEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception{
		
		 
		try(Connection con = ds.getConnection()  ; 
			PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESG))
		{
			ps.setString(1, desg1) ;
			ps.setString(2, desg2) ;
			ps.setString(3, desg3) ;
			
			List<Employee> emplist = new ArrayList<Employee>() ;
			try(ResultSet rs  = ps.executeQuery() ){
				// copying resultset data to emplist
				while(rs.next()) {
					Employee emp = new Employee() ;
					emp.
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null ;
	}

}
