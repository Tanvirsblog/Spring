package com.xworkz.vaccine.dto;

import lombok.Data;

@Data
public class SignUpDTO {
	
	private int id;
	private String userName;
	private String gender;
	private String dob;
	private String password;
	private String confirmPassword;

}
