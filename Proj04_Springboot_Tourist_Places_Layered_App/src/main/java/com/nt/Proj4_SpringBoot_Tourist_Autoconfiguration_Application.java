package com.nt;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.TouristController;
import com.nt.models.TouristSpot;

@SpringBootApplication
public class Proj4_SpringBoot_Tourist_Autoconfiguration_Application {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(Proj4_SpringBoot_Tourist_Autoconfiguration_Application.class, args);
		TouristController controller = ctx.getBean("controller" , TouristController.class) ;
		Scanner scn = new Scanner(System.in) ;
		System.out.println("Enter state 1");
		String state1 = scn.next() ;
		System.out.println("Enter state 2");
		String state2 = scn.next() ;
		System.out.println("Enter state 3");
		String state3 = scn.next() ;
		try {
			List<TouristSpot> list = controller.storeTouristList(state1, state2, state3) ;
			list.forEach(dest -> System.out.println(dest.toString()));
		} 
		catch (SQLException se) {
			se.printStackTrace();
			System.out.println("SQL Query Issue");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Internal code error");
		}
		((ConfigurableApplicationContext) ctx).close() ;
	}

}
