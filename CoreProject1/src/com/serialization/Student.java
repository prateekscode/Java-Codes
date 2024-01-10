package com.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID=1L;
	int sid;
	String name;
	long phone;
	static int count=3;
	
	public Student(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone +", count="+count+ "]";
	}

	
	
	
}
