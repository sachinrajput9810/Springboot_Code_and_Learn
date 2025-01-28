package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	
	@Qualifier("myEngine")
	@Autowired
	private Engine engine ;
	
	public void Journey(String startLocation , String endLocation) {
		engine.start();
		System.out.println("Journey started at " + startLocation);
		System.out.println("Journey ended at " + endLocation);
		engine.stop();
	}
}
