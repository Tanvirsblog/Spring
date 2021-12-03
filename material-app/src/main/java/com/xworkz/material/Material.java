package com.xworkz.material;

public class Material {
	
	private double size;
	private String type;
	private double thickness;
	private double price;
	
	
	public Material() {
		this.price=8000;
	}


	public Material(double size, String type, double thickness, double price) {
		super();
		this.size = size;
		this.type = type;
		this.thickness = thickness;
		this.price = price;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getThickness() {
		return thickness;
	}


	public void setThickness(float thickness) {
		this.thickness = thickness;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
