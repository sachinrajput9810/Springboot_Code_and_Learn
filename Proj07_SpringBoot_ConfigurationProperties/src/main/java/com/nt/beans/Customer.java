package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cust")
@ConfigurationProperties(prefix = "cust.info")
@Data
public class Customer {
	@Value("raju")
	private String name ;
	private int age ;
	private String add ;
	
}
