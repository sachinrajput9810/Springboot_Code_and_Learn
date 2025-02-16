package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.models.Employee;
import com.nt.service.IEmployeeService;

@Controller("controller")
public class PayrollSystemController {

	@Autowired
	private IEmployeeService service ;
	
	public PayrollSystemController() {
		System.out.println("PayrollSystemController:: 0 param constructor");
	}
	
	public List<Employee> showEmployeeDetailByDesg(String desg1 , String desg2 , String desg3) throws Exception{
		List<Employee> list = service.fetchEmployeeByDesgn(desg1, desg2, desg3) ;
		return list ;
	}
}
