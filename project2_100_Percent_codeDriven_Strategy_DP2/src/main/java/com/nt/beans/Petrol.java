package com.nt.beans;

import org.springframework.stereotype.Component;


@Component("petrol")
public final class Petrol implements Engine{
	
	
	public Petrol() {
		System.out.println("Petrol:: 0 param constructor");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine stopped");
	}

}
