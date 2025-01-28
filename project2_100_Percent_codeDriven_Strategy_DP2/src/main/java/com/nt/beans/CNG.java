package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("cng")
public final class CNG implements Engine{
	
	public CNG() {
		System.out.println("CNG:: 0 param constructor");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("CNG Engine started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CNG Engine stopped");
	}

}
