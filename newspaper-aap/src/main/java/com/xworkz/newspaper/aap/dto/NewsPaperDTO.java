package com.xworkz.newspaper.aap.dto;

public class NewsPaperDTO {
	
	private String newspapername;
	private double price;
	private String language;
	private int noOfPages;
	public NewsPaperDTO() {
		super();
	
	}
	
	public NewsPaperDTO(String newspapername, double price, String language, int noOfPages) {
		super();
		this.newspapername = newspapername;
		this.price = price;
		this.language = language;
		this.noOfPages = noOfPages;
	}

	public String getNewspapername() {
		return newspapername;
	}
	public void setNewspapername(String newspapername) {
		this.newspapername = newspapername;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "NewsPaper [newspapername=" + newspapername + ", price=" + price + ", language=" + language
				+ ", noOfPages=" + noOfPages + "]";
	}
	
	

}
