package com.india.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login implements Serializable {
	
	@Id
	private int eid;
	private String name;
	
	
	
	public Login() {
		
	}
	public Login(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
