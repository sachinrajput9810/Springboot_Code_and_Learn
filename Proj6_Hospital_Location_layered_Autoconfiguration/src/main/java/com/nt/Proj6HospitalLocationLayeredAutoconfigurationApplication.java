package com.nt;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.HospitalController;
import com.nt.models.Hospital;

@SpringBootApplication
public class Proj6HospitalLocationLayeredAutoconfigurationApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx =  SpringApplication.run(Proj6HospitalLocationLayeredAutoconfigurationApplication.class, args);
			Scanner scn = new Scanner(System.in) ;) 
		{
			HospitalController controller = ctx.getBean("controller" , HospitalController.class) ;
			System.out.println("Enter Location 1 : "); 
			String loc1 = scn.next() ;
			System.out.println("Enter Location 2 : "); 
			String loc2 = scn.next() ;
			System.out.println("Enter Location 3 : "); 
			String loc3 = scn.next() ;
			List<Hospital> list = controller.getherHospitalByName(loc1, loc2, loc3) ;
			System.out.println(list.size());
			list.forEach(hosp -> System.out.println(hosp.toString()));
		} catch (SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
