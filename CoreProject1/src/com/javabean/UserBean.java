package com.javabean;

import java.io.Serializable;

public class UserBean implements Serializable {
	//All member variables must be taken as private and non-static.
	//member variables --> bean property.
	private String UserId;
	private String AccNo;
	private String psswd;
	private String username;
	private double balance;
	
	//setter method
	public void setUserId(String userid) {
		this.UserId=userid;
	}
	public void setUserName(String username) {
		this.username=username;
	}
	//getter method
	public String getUserId() {
		return UserId;
	}
	public String getUserName() {
		return username;
	}
	@Override
	public String toString() {
		return "UserBean [UserId=" + UserId + ", username=" + username + "]";
	}
	

}
