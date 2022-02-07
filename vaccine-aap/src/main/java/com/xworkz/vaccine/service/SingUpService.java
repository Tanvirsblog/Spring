package com.xworkz.vaccine.service;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.vaccine.dto.SignUpDTO;

public interface SingUpService {
	
	Map<String,String> map = new HashMap<String,String >();
	
	boolean validateSignUpDTO(SignUpDTO signUpDTO);
	
	boolean saveSignUpDTO(SignUpDTO signUpDTO);
	
	boolean sendSignUpMail(String emailId);
	
	String getPassword(String emailId);
}
