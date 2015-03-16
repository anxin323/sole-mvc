package com.sole.po;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class SoleUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4410679764528886649L;
	
	private String userName;
	private String password;
	private int userId;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
