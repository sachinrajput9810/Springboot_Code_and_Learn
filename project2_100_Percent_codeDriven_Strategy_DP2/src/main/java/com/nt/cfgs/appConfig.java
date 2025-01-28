package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = "com.nt.beans")
@Configuration
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class appConfig {
	
	public appConfig(){
		System.out.println("Appconfig 0 param constructor");
	}
	
	
}
