package com.nt;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayrollSystemController;
import com.nt.models.Employee;

@SpringBootApplication
public class Proj10_SpringBoot_Profiles {
	
	@Bean(name = "c3p0Ds")
	@Profile("uat")
	public ComboPooledDataSource creteC3PODs() throws Exception {
		System.out.println("Proj10_SpringBoot_Profiles.creteC3PODs()");
		ComboPooledDataSource cds = new ComboPooledDataSource() ;
		cds.setDriverClass("oracle.jdbc.driver.OracleDriver") ;
		cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe") ;
		cds.setUser("system");
		cds.setPassword("Albert9313@");
		return cds ;
	}
	
	public static void main(String[] args)  {
//		SPRINGBOOT STYLE PROFILES
//		SpringApplication application = new SpringApplication(Proj10_SpringBoot_Profiles.class) ;
//		application.setAdditionalProfiles("test" , "dev");
//		ApplicationContext ctx =  application.run(args);
		
		ApplicationContext ctx = SpringApplication.run(Proj10_SpringBoot_Profiles.class, args) ;
		
		
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
