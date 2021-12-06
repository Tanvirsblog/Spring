package com.xworkz.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wallet {
	@Value("woodland")
	private String brand;
	@Value("black")
	private String color;
	@Autowired
	private Money money;
	@Autowired
	private Material material;
	@Value("750")
	private double price;
	@Autowired
	private Photo photo;
	public Wallet() {
		System.out.println(this.getClass().getSimpleName()+"Bean created");
	}
	public Wallet(String brand, String color, Money money, Material material, double price, Photo photo) {
		super();
		this.brand = brand;
		this.color = color;
		this.money = money;
		this.material = material;
		this.price = price;
		this.photo = photo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Wallet [brand=" + brand + ", color=" + color + ", money=" + money + ", material=" + material
				+ ", price=" + price + ", photo=" + photo + "]";
	}

	
}
