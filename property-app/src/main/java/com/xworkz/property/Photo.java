package com.xworkz.property;

public class Photo {
	
	private String photoSize;
	
	private double price;

	public Photo() {
		System.out.println(this.getClass().getSimpleName()+"bean created");
	}

//	public Photo(String photoSize, double price) {
//		super();
//		this.photoSize = photoSize;
//		this.price = price;
//}

	
	
	public String getPhotoSize() {
		return photoSize;
	}

	public void setPhotoSize(String photoSize) {
		this.photoSize = photoSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Photo [photoSize=" + photoSize + ", price=" + price + "]";
	}
	
	
	
	
}
