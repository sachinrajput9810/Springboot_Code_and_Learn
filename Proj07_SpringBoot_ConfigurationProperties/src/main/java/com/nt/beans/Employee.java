package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "cust")
@Data
public class Employee {
	private int Eno ;
	private String name1 ;
	private int age ;
	private String add ;	

}
