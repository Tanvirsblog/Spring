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
@Table(name = "vaccination_table")

@NamedQueries({
@NamedQuery(name="UserOTPEntity.getotpbyEmail",query="select otp from UserOTPEntity where email=:emailId"),
@NamedQuery(name="UserOTPEntity.updateOTPByEmail",query="update UserOTPEntity set otp=:newotp where email=:emailId")
})
@Data
public class UserOTPEntity implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "OTP")
	private int otp;

}
