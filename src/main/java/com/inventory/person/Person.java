package com.inventory.person;

import com.inventory.CommonFields;

import javax.persistence.Entity;

@Entity
public class Person extends CommonFields{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;
	private String phone;
	private Integer active = 1;
	private String address;
	
	protected Person() {
	
	}
	
	public Person(String email, String phone, Integer active, String address) {
		super();
		this.email = email;
		this.phone = phone;
		this.active = active;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", phone=" + phone + ", active=" + active + ", address=" + address + "]";
	}
	
	
}
