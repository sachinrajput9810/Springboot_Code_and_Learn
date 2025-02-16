package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Customer;
import com.nt.beans.Employee;

@SpringBootApplication
public class Proj7_SpringBoot_ConfigurationProperties {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Proj7_SpringBoot_ConfigurationProperties.class, args);
		Customer cust = ctx.getBean("cust" , Customer.class) ;
		System.out.println("Customer info " + cust);
	}

}
