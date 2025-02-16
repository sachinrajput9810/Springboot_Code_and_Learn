package com.nt.service;

import java.util.List;

import com.nt.models.Employee;

public interface IEmployeeService {
	public List<Employee> fetchEmployeeByDesgn(String desg1 , String desg2 , String desg3) throws Exception ;
}
