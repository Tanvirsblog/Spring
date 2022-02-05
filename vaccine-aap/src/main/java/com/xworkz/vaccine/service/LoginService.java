package com.xworkz.vaccine.service;

public interface LoginService {

	boolean validateLoginUser(String userName , String password);
	
	boolean verifyUser(String userName , String password);
}
