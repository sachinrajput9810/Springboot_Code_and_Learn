package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.cfgs.appConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);    
    	WishMessageGenerator generator = ctx.getBean("wishMessageGenerator" , WishMessageGenerator.class) ;
        String msg = generator.message("Alexa") ;
        System.out.println(msg);
        System.out.println("-------------------");
        ctx.close();
    }
}
