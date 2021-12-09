package com.xworkz.remote.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tv_remote")
public class TvRemoteEntity implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TVREMOTE_ID")
	private int Tvremote;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="NO_OF_CELLS")
	private int noOfCells;
	
	@Column(name="IS_POWERBUTTON_WORKING")
	private boolean isPowerButtonWorking;
	
	public TvRemoteEntity() {
	
	}

	public TvRemoteEntity(String name, double price, String color, int noOfCells, boolean isPowerButtonWorking) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.noOfCells = noOfCells;
		this.isPowerButtonWorking = isPowerButtonWorking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}

	public boolean isPowerButtonWorking() {
		return isPowerButtonWorking;
	}

	public void setPowerButtonWorking(boolean isPowerButtonWorking) {
		this.isPowerButtonWorking = isPowerButtonWorking;
	}
	
	
	

}
