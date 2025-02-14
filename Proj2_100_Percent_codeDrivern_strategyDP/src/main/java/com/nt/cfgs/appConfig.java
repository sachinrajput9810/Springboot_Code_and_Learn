package com.nt.cfgs;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages = "com.nt.beans")
@Configuration
public class appConfig {
	
	public appConfig(){
		System.out.println("Appconfig 0 param constructor");
	}
	
	@Bean("dt")
	public LocalDateTime createDate() {
		System.out.println("appConfig.createDate()");
		LocalDateTime date =  LocalDateTime.now() ;
		return date ;
	}
	
	@Primary
	@Bean("dt1")
	public LocalDateTime createDate1() {
		System.out.println("appConfig.createDate1()");
		LocalDateTime date =  LocalDateTime.now() ;
		return date ;
	}
	
	
	@Bean("cal")
	public Calendar createCalendar() {
		System.out.println("appConfig.createCalendar()");
		Calendar calendar = Calendar.getInstance() ;
		return calendar ;
	}
}
