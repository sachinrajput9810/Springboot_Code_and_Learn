package com.nt.beans;




import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg") 
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime date ;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: 0 param constructor)");
	}
	
	public String message(String user) {
		int hr = date.getHour() ;
		if(hr < 12) return "Good morning " + user ;
		else if(hr < 17) return "Good afternoon " + user ;
		else if(hr < 20) return "Good evening " + user ;
		else  return "Good night " + user ;
	}
	
}
