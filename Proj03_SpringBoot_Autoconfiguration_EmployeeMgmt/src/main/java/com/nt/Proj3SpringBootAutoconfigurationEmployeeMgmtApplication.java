package com.nt;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollSystemController;
import com.nt.models.Employee;

@SpringBootApplication
public class Proj3SpringBootAutoconfigurationEmployeeMgmtApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx =  SpringApplication.run(Proj3SpringBootAutoconfigurationEmployeeMgmtApplication.class, args);
		PayrollSystemController controller = ctx.getBean("controller" , PayrollSystemController.class ) ;
		Scanner scn = new Scanner(System.in) ;
		System.out.println("Enter desg1 : ") ; 
		String desg1 = scn.next().toUpperCase() ;
		System.out.println("Enter desg2 : ") ;
		String desg2 = scn.next().toUpperCase() ;
		System.out.println("Enter desg3 : ") ;
		String desg3 = scn.next().toUpperCase() ;
		
		try {
			List<Employee> list = controller.showEmployeeDetailByDesg(desg1 , desg2 , desg3) ;
			list.forEach(emp -> {
				System.out.println(emp.toString());
			});
		}
		catch(SQLException se) {
			se.printStackTrace();
			System.out.println("Internal DB issue found");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Internal Unknown issue found");

		}
		((ConfigurableApplicationContext) ctx).close() ;
	}

}
