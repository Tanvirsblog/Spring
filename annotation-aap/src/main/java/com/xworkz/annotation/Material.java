package com.xworkz.annotation;

import org.springframework.stereotype.Component;

@Component
public class Material {
	
	double size;
	String type;
	double thickness;
	
	public Material() {
	System.out.println(this.getClass().getSimpleName()+"Bean created");	
	}

	public Material(double size, String type, double thickness) {
		super();
		this.size = size;
		this.type = type;
		this.thickness = thickness;
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

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return "Material [size=" + size + ", type=" + type + ", thickness=" + thickness + "]";
	}

}
