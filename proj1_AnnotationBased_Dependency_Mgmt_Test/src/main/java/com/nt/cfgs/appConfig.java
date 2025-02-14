package com.nt.cfgs;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com/nt/beans")
@Configuration
public class appConfig {
	
	public appConfig(){
		System.out.println("Appconfig 0 param constructor");
	}
	
	@Bean("dt")
	public LocalDateTime createDate() {
		LocalDateTime date =  LocalDateTime.now() ;
		return date ;
	}
	
	@Bean("cal")
	public Calendar createCalendar() {
		Calendar calendar = Calendar.getInstance() ;
		return calendar ;
	}
}
