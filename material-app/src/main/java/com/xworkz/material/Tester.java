package com.xworkz.material;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springConfigFile = "spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);
		System.out.println("springContainer is created " + springContainer.hashCode());
		
		Wallet wallet = springContainer.getBean(Wallet.class);
		System.out.println(wallet.getClass().getSimpleName());
		
//		System.out.println(wallet.getBrand());
//		System.out.println(wallet.getColor());
//		System.out.println(wallet.getPrice());
//		
//		Material material = new Material();
//		System.out.println(material.getPrice());
//		
//		System.out.println("------------------");
//		Material material2 = new Material(9.0,"asfdf",3450.0,2000.0);
//		System.out.println(material2.getSize());
//		System.out.println(material2.getThickness());
//		System.out.println(material2.getType());
//		System.out.println(material2.getPrice());
	
		
		//Wallet wallet2 = springContainer.getBean(Wallet.class);
		//System.out.println(wallet2);
	}
}
