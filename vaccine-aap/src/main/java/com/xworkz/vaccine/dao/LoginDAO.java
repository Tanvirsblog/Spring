package com.xworkz.vaccine.dao;

public interface LoginDAO {

	String isUserExists(String userName);
	
	int updateLoginAttempt(String userName,int currentAttempt);
	
	int getUpdatedAttempt(String userName);
}
