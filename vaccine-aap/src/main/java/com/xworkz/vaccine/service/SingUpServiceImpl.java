package com.xworkz.vaccine.service;

import java.util.HashMap;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.vaccine.controller.RegisterController;
import com.xworkz.vaccine.controller.SignUpController;
import com.xworkz.vaccine.dao.SignUpDAO;
import com.xworkz.vaccine.dto.SignUpDTO;

import com.xworkz.vaccine.entity.UserSignUpEntity;
import com.xworkz.vaccine.util.PasswordEncoderGenrator;

@Service
public class SingUpServiceImpl implements SingUpService {

	private HashMap<String, String> map = new HashMap<String, String>();
	
	public SingUpServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	@Autowired
	private SignUpDAO signUpDAO;
	
	@Autowired
	BCryptPasswordEncoder encrypt;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	RegisterController registerController;
	
	@Autowired
	SignUpController signUpController;

	@Override
	public boolean validateSignUpDTO(SignUpDTO signUpDTO) {
		System.out.println("Invoked validateSignUpDTO() ");
		
		boolean flag = true;
		
		if ( !signUpDTO.getUserName().isEmpty() && signUpDTO.getUserName() !=null ) {
			flag = true;
		} else {
			flag = false;
			map.put("USERNAME", "Invalid userName");
			return flag;
		}
		if (signUpDTO.getGender() != null && !signUpDTO.getGender().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			map.put("GENDER", "Select Gender");
			return flag;
		}
		if(signUpDTO.getDob()!=null && !signUpDTO.getDob().isEmpty()) {
			flag = true;
		}else {
			flag= false;
			map.put("DOB", "Invalid Dob");
		}
		if (signUpDTO.getPassword() != null && !signUpDTO.getPassword().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			map.put("PASSWORD", "Plesr enter Password");
			return flag;
		}
		if (signUpDTO.getConfirmPassword() != null && signUpDTO.getConfirmPassword().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			map.put("GETCONFIRMPASSWORD", "Please Confirm your Password");
			return flag;
		}
		return false;
	}

	@Override
	public boolean saveSignUpDTO(SignUpDTO signUpDTO) {
		System.out.println("Invoked saveSignUpDTO()");
		signUpDTO.setPassword(encrypt.encode(signUpDTO.getPassword()));
		UserSignUpEntity usersignupEntity = new UserSignUpEntity();
		BeanUtils.copyProperties(signUpDTO, usersignupEntity);
		usersignupEntity.setEmail(registerController.email);

		boolean saveUserSignUpEntity = this.signUpDAO.saveUserSignUpEntity(usersignupEntity);
		if(saveUserSignUpEntity) {
			return true;
		}
		return false;
	}

	@Override
	public boolean sendSignUpMail(String emailId) {
		System.out.println("Invoked sendSignUpMail()");

		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(emailId);
			mailMessage.setSubject("Geting password & vaccian signup sucess...");
			mailMessage.setText("Account created for vaccine and password for login is " + getPassword(null));
			mailSender.send(mailMessage);
			return true;

		} catch (HibernateException e) {
			System.out.println("catch block");
		}
		return false;

	}

	@Override
	public String getPassword(String emailId) {
		System.out.println("Invoked get password");
		
		String DBPassword = this.signUpDAO.getPassword(emailId) ;
		if(DBPassword!= null) {
			return DBPassword;
		}
		return null;
	}

}
