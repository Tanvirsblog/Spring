package com.xworkz.newspaper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="newspaper_table")
@NamedQuery(name="newsPaperEntity.getnewsPaperObject",query="from NewsPaperEntity where newsPaperName=:name")
public class NewsPaperEntity implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="NEWSPAPER_ID")
	private int newsPaperId;
	
	@Column(name="NEWSPAPERNAME")
	private String newsPaperName;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="NO_OF_PAGES")
	private int noOfPages;

	public NewsPaperEntity() {
		System.out.println(this.getClass().getSimpleName()+"Created");
		
	}

	public NewsPaperEntity(int newsPaperId, String newsPaperName, double price, String language, int noOfPages) {
		super();
		this.newsPaperId = newsPaperId;
		this.newsPaperName = newsPaperName;
		this.price = price;
		this.language = language;
		this.noOfPages = noOfPages;
	}

	public int getNewsPaperId() {
		return newsPaperId;
	}

	public void setNewsPaperId(int newsPaperId) {
		this.newsPaperId = newsPaperId;
	}

	public String getNewsPaperName() {
		return newsPaperName;
	}

	public void setNewsPaperName(String newsPaperName) {
		this.newsPaperName = newsPaperName;
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
		return "NewsPaperEntity [newsPaperId=" + newsPaperId + ", newsPaperName=" + newsPaperName + ", price=" + price
				+ ", language=" + language + ", noOfPages=" + noOfPages + "]";
	}
	
}

