package com.xworkz.cctv;

public class CCTV {

	public String brand;
	public int cameraSize;
	public double price;
	public String color;

	public CCTV() {
		System.out.println(this.getClass().getSimpleName() + "object created");
		
	}
	public CCTV(String brand,int cameraSize,double price,String color) {
		this.brand = brand;
		this.cameraSize = cameraSize;
		this.price = price;
		this.color = color;
		System.out.println(this.getClass().getSimpleName() + "object created");
	}
	public CCTV(String band,String color) {
		this.brand = brand;
		this.color = color;
		System.out.println(this.getClass().getSimpleName() + "object created");
	}
	public String getBrand() {
		return brand;
	}
	
	public int getCameraSize() {
		return cameraSize;
	}
	public void setCameraSize(int cameraSize) {
		this.cameraSize = cameraSize;
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
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void record() {
		System.out.println("Invoked record");
	}

	public void autoDelete() {
		System.out.println("Invoked autoDelete");

	}

}
