package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Bottle;

@SpringBootApplication
public class Proj7_SpringBoot_ConfigurationProperties {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Proj7_SpringBoot_ConfigurationProperties.class, args);
		Bottle bottle = ctx.getBean("bottle" , Bottle.class) ;
		System.out.println("Bottle info :: " + bottle);
	}

}
