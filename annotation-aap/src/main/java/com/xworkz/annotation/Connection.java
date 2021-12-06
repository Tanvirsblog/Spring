package com.xworkz.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Connection {
	@Value("${u1}")
	private String url;
	@Value("${u2}")
	private String userName;
	@Value("${u3}")
	private String password;

	public Connection() {
		System.out.println(this.getClass().getSimpleName()+"Invoked connection");
	}

	public Connection(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
