package com.xworkz.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);
		System.out.println("springContainer is created" + springContainer.hashCode());

		Photo photo = springContainer.getBean(Photo.class);
		System.out.println(photo);

		Wallet wallet = springContainer.getBean(Wallet.class);
		System.out.println(wallet);
		
		Connection connection = springContainer.getBean(Connection.class);
		System.out.println(connection);
		
	}
}
