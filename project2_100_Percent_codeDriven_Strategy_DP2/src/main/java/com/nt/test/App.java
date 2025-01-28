package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Vehicle;
import com.nt.cfgs.appConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);    
    	Vehicle vec = ctx.getBean("vehicle" , Vehicle.class) ;
        vec.Journey("Ambala", "Delhi");
        ctx.close();
    }
}
