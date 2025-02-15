package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Data;

@Data
@Component("hosp")
@PropertySource("input.properties")
public class Hospital {
	
	@Value("${hospital.name}")
	private String Name ;
	
	@Value("${hospital.age}")
	private int age ;
	
	@Value("${Path}")
	private String path ;
	
	@Value("${os.name}")
	private String osName ;
	
	@Autowired
	private LabTest labTest ;
	
	
	
	private int bill ;
	
	@PostConstruct
    public void init() {
        // Calculate the bill after all dependencies are injected
        this.bill = labTest.getBloodTestPrice() + labTest.getMriTest();
    }
	public void getDetails() {
		System.out.println("Hospital name " + Name );
		System.out.println("Hospital age " + age );
		System.out.println("Os name " + osName );
		System.out.println("Path " + path);
//		System.out.println(System.getProperties());
		System.out.println("Total bill " + bill);
	}
	
	
}
