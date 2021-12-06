package com.xworkz.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Photo {
	@Value("fullSize")
	private String photoSize;
	@Value("2200")
	private double price;

	public Photo() {
		System.out.println(this.getClass().getSimpleName()+"bean created");
	}

	public Photo(@Value("passportsize")String photoSize,@Value("1100") double price) {
		super();
		this.photoSize = photoSize;
		this.price = price;
	}

	public String getPhotoSize() {
		return photoSize;
	}
	@Value("30pxl")
	public void setPhotoSize(String photoSize) {
		System.out.println("Invoked set brand");
		this.photoSize = photoSize;
	}
	public double getPrice() {
		return price;
	}
	@Value("500")
	public void setPrice(double price) {
		System.out.println("Invoked set price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Photo [photoSize=" + photoSize + ", price=" + price + "]";
	}
	
	

}
