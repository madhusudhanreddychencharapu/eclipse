package com.telusko.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private long id;
	private String username;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	private String passwordString;
	

}
