package com.xworkz.vaccine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="SignUp_table")
@NamedQueries({
@NamedQuery(name="UserSignUpEntity.isUserExists",query="select password from UserSignUpEntity where userName=:USERNAME"),
@NamedQuery(name="UserSignUpEntity.updateLoginAttempt",query="update UserSignUpEntity set loginAttempt=:LOGIN_ATTEMPT where userName=:USERNAME"),
@NamedQuery(name="UserSignUpEntity.getUpdateAttempt",query="select loginAttempt from UserSignUpEntity where userName=:USERNAME"),
@NamedQuery(name="UserSignUpEntity.getpasswordbyEmail",query="select password from UserSignUpEntity where email=:emailId")
})
@Data
public class UserSignUpEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name="USERNAME")
	private String userName;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CONFIRMPASSWORD")
	private String confirmPassword;
	
	@Column(name = "SIGNUP_EMAIL")
	private String email;
	
	@Column(name="LOGIN_ATTEMPT")
	private int loginAttempt;
	
}
