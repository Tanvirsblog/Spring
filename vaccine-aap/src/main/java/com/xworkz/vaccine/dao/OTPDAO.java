package com.xworkz.vaccine.dao;

import com.xworkz.vaccine.entity.UserOTPEntity;

public interface OTPDAO {
	
	public boolean saveUserOTPEntity(UserOTPEntity userOTPEntity);
	
	int getOTPDAOByEmail(String email);
	
	boolean updateOTPByEmail(String email,int newotp);

}
