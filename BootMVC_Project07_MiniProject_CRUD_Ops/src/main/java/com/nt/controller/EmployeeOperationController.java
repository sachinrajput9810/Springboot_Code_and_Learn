package com.nt.controller;

import java.beans.beancontext.BeanContext;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationController {

	@Autowired
	public IEmployeeMgmtService service ;

	@GetMapping("/")
	public String showHome() {
		return "home" ;
	}

	@GetMapping("/report")
	public String showEmployeeReport(Map<String, Object> map) {
		System.out.println("EmployeeOperationController.showEmployeeReport()");
		List<Employee> empList = service.getAllEmployees() ;
		map.put("empData", empList) ;
		return "employee_report" ;
	}
	
	@GetMapping("/add")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		emp.setJob("Clerk") ;
		return "employee_register" ;
	}
//	
//	@PostMapping("/add")
//	public String addEmployee(@ModelAttribute("emp") Employee emp , RedirectAttributes attrs) {
//		System.out.println("EmployeeOperationController.addEmployee()");
//		String result = service.registerEmployee(emp) ;
//		attrs.addFlashAttribute("resultMsg" ,result) ;
//		return "redirect:report" ; 
//	}
	

	@PostMapping("/add")
	public String addEmployee(@ModelAttribute("emp") Employee emp , HttpSession session) {
		System.out.println("EmployeeOperationController.addEmployee()");
		String result = service.registerEmployee(emp) ;
		session.setAttribute("resultMsg", result) ;
		return "redirect:report" ; 
	}
	
	@GetMapping("/edit")
	public String showEditEmployeeForm(@RequestParam("no") int no , @ModelAttribute("emp") Employee emp) {
		Employee emp1 = service.getEmployeeById(no) ;
		BeanUtils.copyProperties(emp1, emp) ; 
		return "employee_edit" ;
	}
	
	@PostMapping("/edit")
	public String editEmployee(@ModelAttribute("emp") Employee employee , Map<String, Object> map) {
		String msg = service.editEmployee(employee) ;
		List<Employee> list = service.getAllEmployees() ;
		map.put("resultMsg", msg) ;
		map.put("empData" , list) ;
		return "employee_report" ;
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("no") int no , Map<String, Object> map) {
		String msg = service.deleteEmployee(no) ;
		List<Employee> list = service.getAllEmployees() ;
		map.put("resultMsg", msg) ;
		map.put("empData" , list) ;
		return "employee_report" ; 
		
	}
	
	
	
	

}




