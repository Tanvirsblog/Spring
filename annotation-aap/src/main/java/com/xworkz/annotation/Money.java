package com.xworkz.annotation;

import org.springframework.stereotype.Component;

@Component
public class Money {

	private String type;
	private double size;
	private boolean isCoinOrNote;
	private String color;
	
	
	public Money() {
		System.out.println(this.getClass().getSimpleName()+"Bean created");
	}


	public Money(String type, double size, boolean isCoinOrNote, String color) {
		super();
		this.type = type;
		this.size = size;
		this.isCoinOrNote = isCoinOrNote;
		this.color = color;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public boolean isCoinOrNote() {
		return isCoinOrNote;
	}


	public void setCoinOrNote(boolean isCoinOrNote) {
		this.isCoinOrNote = isCoinOrNote;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Money [type=" + type + ", size=" + size + ", isCoinOrNote=" + isCoinOrNote + ", color=" + color + "]";
	}
	
	

}
