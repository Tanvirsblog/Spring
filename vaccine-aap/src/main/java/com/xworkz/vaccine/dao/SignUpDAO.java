package com.xworkz.vaccine.dao;

import com.xworkz.vaccine.entity.UserSignUpEntity;

public interface SignUpDAO {
	
	boolean saveUserSignUpEntity(UserSignUpEntity usersignupEntity);
	
	public String getPassword(String email);

}
