package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
	
	@Autowired
	private IEmployeeRepo repo ;

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll() ;
	}

	@Override
	public String registerEmployee(Employee emp) {
		int empNo = repo.save(emp).getEmpNo() ;
		return "Employee with Emp No " + empNo + " is saved" ;
	}

	@Override
	public Employee getEmployeeById(Integer no) {
		Optional<Employee> opt = repo.findById(no) ;
		if(opt.isPresent()) return opt.get() ;
		return null ;
	}

	@Override
	public String editEmployee(Employee emp) {
		int empId = repo.save(emp).getEmpNo() ;
		return "Employee with Id " + empId + " is updated" ;
	}

	@Override
	public String deleteEmployee(Integer no) {
		repo.deleteById(no);
		return "Employee with id " + no + " is deleted" ;
	}

}
