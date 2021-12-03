package com.xworkz.material;

import java.util.Date;

public class ATMCard {
	
	private long cardNo;
	private int cvv;
	private CARDTYPE cardType;
	private String color;
	private java.util.Date expriyDate;
	
	public ATMCard() {
		System.out.println(this.getClass().getSimpleName()+"Bean create");
	}
	
	
}
