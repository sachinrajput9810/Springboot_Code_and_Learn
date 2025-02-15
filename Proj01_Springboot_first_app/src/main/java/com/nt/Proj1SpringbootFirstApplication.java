package com.nt;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class Proj1SpringbootFirstApplication {
	
	public Proj1SpringbootFirstApplication() {
		System.out.println("Proj1SpringbootFirstApplication :: 0  param constructor)");
	}

	@Bean("cal")
	public Calendar getCalendar() {
		System.out.println("Proj1SpringbootFirstApplication :: getCalendar");
		return Calendar.getInstance() ;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(Proj1SpringbootFirstApplication.class, args);
		System.out.println("class name is " + ctx.getClass());
		WishMessageGenerator generator = ctx.getBean("wmg" , WishMessageGenerator.class) ;
		String msg = generator.generateWishMessage("Roy") ;
		System.out.println(msg);
		
		((ConfigurableApplicationContext) ctx).close() ;
	}

}
