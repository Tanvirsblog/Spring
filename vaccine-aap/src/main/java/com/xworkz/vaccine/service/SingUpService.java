package com.xworkz.vaccine.service;

import com.xworkz.vaccine.dto.SignUpDTO;

public interface SingUpService {
	

	boolean validateAlltheField(SignUpDTO signupdto);
	
	boolean saveSignUpDTO(SignUpDTO signupdto);
	
	String encryptPassword();
}
