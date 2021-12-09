package com.xworkz.remote.entity;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.TvRemoteDAO;
import com.xworkz.dao.TvRemoteDAOImpl;

public class Tester {

	public static void main(String[] args) {
		String springConfigFile = "applicationContext.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);

		TvRemoteEntity tvRemoteEntity = new TvRemoteEntity();
		tvRemoteEntity.setColor("black");
		tvRemoteEntity.setName("samsung");
		tvRemoteEntity.setNoOfCells(2);
		tvRemoteEntity.setPowerButtonWorking(true);
		tvRemoteEntity.setPrice(1000.0);

		TvRemoteDAO tvRemoteDAO = springContainer.getBean(TvRemoteDAOImpl.class);
		tvRemoteDAO.addTvRemoteEntity(tvRemoteEntity);
		
		ClassPathXmlApplicationContext classPathApplicationContext = (ClassPathXmlApplicationContext)springContainer;
		classPathApplicationContext.close();
	}

}
