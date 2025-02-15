package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDao;
import com.nt.models.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao empDao ;
	
	@Override
	public List<Employee> fetchEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> empList = empDao.getEmployeeByDesgn(desg1, desg2, desg3) ;
		return empList ;
	}

}
