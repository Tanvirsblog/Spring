package com.xworkz.property;

public class Connection {
	
	private String url;
	
	private String userName;
	
	private String password;

	public Connection(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Connection [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

	
}
