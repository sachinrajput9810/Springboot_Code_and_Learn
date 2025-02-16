package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.models.Employee;

import ch.qos.logback.core.model.conditional.ElseModel;

@Repository("MysqlEmpDAO")
@Profile({"dev" , "test"})
public class MySqlEmpDaoImpl implements IEmployeeDao {
	private static final String GET_EMPS_BY_DESG = "SELECT ENO , ENAME, JOB , SALARY FROM EMP_PROFILES WHERE JOB IN(?,?,?)" ;
	
	@Autowired
	private DataSource ds ;
	
	public MySqlEmpDaoImpl() {
		System.out.println("MySqlEmpDaoImpl::  0 param constructor");
	}
	
	@Override
	public List<Employee> getEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("Datasource class name : " +ds.getClass());

		
		List<Employee> empList = null ;
		
		try(Connection con = ds.getConnection() ; PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESG) ;) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery() ) {
				empList = new ArrayList<Employee>() ;
				while(rs.next()) {
					Employee emp = new Employee() ;
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getFloat(4));
					empList.add(emp) ;
				}
				
			} catch (SQLException se) {
				se.printStackTrace();
				throw se ;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e ;
		}
		
		return empList ;
	}

}
