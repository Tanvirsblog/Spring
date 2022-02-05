package com.xworkz.vaccine.service;

import java.util.HashMap;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.vaccine.dao.OTPDAO;
import com.xworkz.vaccine.dao.SignUpDAO;
import com.xworkz.vaccine.dto.SignUpDTO;
import com.xworkz.vaccine.entity.UserOTPEntity;
import com.xworkz.vaccine.entity.UserSignUpEntity;
import com.xworkz.vaccine.util.PasswordEncoderGenrator;


@Service
public class SingUpServiceImpl implements SingUpService {


	private HashMap<String,String> map = new HashMap<String,String>();
	
	
	@Autowired
	private SignUpDAO signupdao;
	
	public SingUpServiceImpl() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public HashMap<String,String> getMap() {
		return map;
	}
	public void setMap(HashMap<String,String>map) {
		this.map=map;
	}
	@Override
	public boolean validateAlltheField(SignUpDTO signupdto) {
		System.out.println("Invoked validateAlltheField() ");
		boolean flag=false;
		if(signupdto.getUserName()!=null && !signupdto.getUserName().isEmpty()) {
			flag = true;
		}else {
			flag=false;
			System.out.println("Invalid username");
			map.put("USERNAME","Invalid username");
			return flag;
		}
		if(signupdto.getGender() !=null && !signupdto.getGender().isEmpty()) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Select gender");
			map.put("GENDER","Select gender");
			return flag;
		}
		if(signupdto.getPassword() !=null && !signupdto.getPassword().isEmpty()) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Plesr enter Password");
			map.put("GETPASSWORD","Plesr enter Password");
			return flag;
		}
		if(signupdto.getConfirmPassword() !=null && signupdto.getConfirmPassword().isEmpty()) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Please Confirm your Password");
			map.put("GETCONFIRMPASSWORD","Please Confirm your Password");
			return flag;
		}
		return flag;
	}


	@Override
	public boolean saveSignUpDTO(SignUpDTO signupdto) {
		System.out.println("Invoked saveSignUpDTO()");
		UserSignUpEntity usersignupEntity = new UserSignUpEntity();
		BeanUtils.copyProperties(signupdto, usersignupEntity);
		boolean result = this.signupdao.saveUserSignUpEntity(usersignupEntity);
		
		return result;
	}
	@Override
	public String encryptPassword() {
		return PasswordEncoderGenrator.encryptPassword(null);
	}

		
		
	}

	


