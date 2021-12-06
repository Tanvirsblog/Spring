package com.xworkz.property;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		
		String SpringConfigFile = "Tanvir.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(SpringConfigFile);
		System.out.println("springContainer is created " + springContainer.hashCode());
		
		Photo photo = springContainer.getBean(Photo.class);
		System.out.println(photo);
		
	   Connection connection = springContainer.getBean(Connection.class);
	   System.out.println(connection);
	   
	   
	}

}
