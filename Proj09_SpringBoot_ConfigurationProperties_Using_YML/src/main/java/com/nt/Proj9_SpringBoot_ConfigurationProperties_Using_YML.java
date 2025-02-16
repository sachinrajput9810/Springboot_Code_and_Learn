package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Bottle;

@SpringBootApplication
public class Proj9_SpringBoot_ConfigurationProperties_Using_YML {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Proj9_SpringBoot_ConfigurationProperties_Using_YML.class, args);
		Bottle bottle = ctx.getBean("bottle" , Bottle.class) ;
		System.out.println("Bottle info :: " + bottle);
	}

}
