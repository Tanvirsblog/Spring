package com.xworkz.material;

public class Wallet {

	private String color;
	private Brand brand;
	private Material material;
	private double price;
	private Money money;
	private ATMCard atmCard;
	private Photo photo;
	
	public Wallet() {
		System.out.println(this.getClass().getSimpleName()+"Bean is created");
	}

	public Wallet(String color, Brand brand, Material material, double price, Money money, ATMCard atmCard,
			Photo photo) {
		super();
		this.color = color;
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.money = money;
		this.atmCard = atmCard;
		this.photo = photo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
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

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public ATMCard getAtmCard() {
		return atmCard;
	}

	public void setAtmCard(ATMCard atmCard) {
		this.atmCard = atmCard;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	
}

