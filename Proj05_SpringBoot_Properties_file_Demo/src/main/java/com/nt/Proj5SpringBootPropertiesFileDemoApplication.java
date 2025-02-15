package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.beans.Hospital;

@SpringBootApplication
public class Proj5SpringBootPropertiesFileDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Proj5SpringBootPropertiesFileDemoApplication.class, args);
		Hospital hospital = ctx.getBean("hosp" , Hospital.class) ;
		hospital.getDetails();
		System.out.println("-------------------------------");
		Environment environment = ctx.getEnvironment() ;
		System.out.println("Env object data : " + environment.toString());
//		System.out.println("OS enviroment obj data : " + environment.getProperty("os.name") );
//		System.out.println("Hospital name enviroment obj data : " + environment.getProperty("hospital.name") );
//		System.out.println("Path enviroment obj data : " + environment.getProperty("Path") );


	}

}
