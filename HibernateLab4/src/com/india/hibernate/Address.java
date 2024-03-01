package com.india.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="addid")
	private int addid;

	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pin")
	private long pin;
	

	public Address() {

	}

	Address(String street, String city, String state, long pin) {

		this.street = street;
		this.city = city;
		this.state= state;
		this.pin=pin;
	}

	public Address(int addid, String street, String city, String state, long pin) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [Addid=" + addid + ", Street" + street + ", City=" + city + ", State=" + state + ", Pincode="
				+ pin + "]";
	}

}
