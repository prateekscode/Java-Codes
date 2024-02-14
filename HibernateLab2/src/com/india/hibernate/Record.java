package com.india.hibernate;

import javax.persistence.*;

@Entity
@Table(name="records")
public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rid")
	private int cid;
	private String name;
	private String city;
	private String email;
	private long phone;
	
	
	public Record(String name, String city, String email, long phone) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
	public Record(int cid, String name, String city, String email, long phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "["+cid+","+name+","+city+","+email+","+phone+"]";
	}
	
}
