package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("diesel")
public final class Diesel implements Engine{
	
	public Diesel() {
		System.out.println("Diesel:: 0 param constructor");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine stopped");
	}

}
