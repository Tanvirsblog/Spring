package com.xworkz.covid.util;

public class OTPGenrator {
	
public static int generateOTP() {
		
		int otpNo = (int) (Math.random() *9999)+1000;
		
		System.out.println("OTP Number is: "+otpNo);
		
		return otpNo;
	}

}
