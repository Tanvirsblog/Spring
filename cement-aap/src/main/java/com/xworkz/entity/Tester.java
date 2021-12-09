package com.xworkz.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.CementDAO;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "applicationContext.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);
		
		//LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();

		Cement cement = new Cement();
		cement.setName("ACC");
		cement.setColor("Gray");
		cement.setPrice(500.0);
		cement.setIsusefulforconstruction(true);
		
		CementDAO cementDAO = springContainer.getBean(CementDAO.class);
		cementDAO.addCement(cement);
		
		ClassPathXmlApplicationContext classPathApplicationContext = (ClassPathXmlApplicationContext)springContainer;
		classPathApplicationContext.close();
	}

}
