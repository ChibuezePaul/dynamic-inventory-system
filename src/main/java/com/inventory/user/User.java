package com.inventory.user;

import com.inventory.CommonFields;

import javax.persistence.Entity;

@Entity
public class User extends CommonFields {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer active = 1;
	private String username;
	private String password;
	private String userType;
	
	public User() {
		
	}
	
	public User(Integer active, String username, String password, String userType) {
		this.active = active;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userType=" + userType + "]";
	}
}