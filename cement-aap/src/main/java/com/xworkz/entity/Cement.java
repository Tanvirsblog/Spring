package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cement_info")
public class Cement implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CEMENT_ID")
	private int cementId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "IS_USEFULFOR_CONSTRUCTION")
	private boolean isusefulforconstruction;

	public Cement() {

	}

	public Cement(int cementId, String name, double price, String color, boolean isusefulforconstruction) {
		super();
		this.cementId = cementId;
		this.name = name;
		this.price = price;
		this.color = color;
		this.isusefulforconstruction = isusefulforconstruction;
	}

	public int getCementId() {
		return cementId;
	}

	public void setCementId(int cementId) {
		this.cementId = cementId;
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

	public boolean isIsusefulforconstruction() {
		return isusefulforconstruction;
	}

	public void setIsusefulforconstruction(boolean isusefulforconstruction) {
		this.isusefulforconstruction = isusefulforconstruction;
	}

	@Override
	public String toString() {
		return "Cement [cementId=" + cementId + ", name=" + name + ", price=" + price + ", color=" + color
				+ ", isusefulforconstruction=" + isusefulforconstruction + "]";
	}
}
