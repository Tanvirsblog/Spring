package com.xworkz.covid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CovidVaccine_table")
@Data
public class OTPEntity implements java.io.Serializable{
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="OTP")
	private int otp;

}
