package com.xworkz.cctv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[]args) {
		
		String springconfigfile = "spring.xml";
		
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springconfigfile);
		
		System.out.println("springcontainer is created" +springContainer.hashCode() );

		CCTV cctv= springContainer.getBean(CCTV.class);
		System.out.println(cctv.getBrand());
		System.out.println(cctv.getCameraSize());
		System.out.println(cctv.getPrice());
		System.out.println(cctv.getColor());
	
		cctv.record();
		cctv.autoDelete();
		
		String string = springContainer.getBean(String.class);
		System.out.println(string.hashCode());
		
		
		
		
	}
}
