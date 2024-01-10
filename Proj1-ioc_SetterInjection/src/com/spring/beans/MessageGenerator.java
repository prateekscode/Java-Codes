package com.spring.beans;

import java.util.Date;

public class MessageGenerator {
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String generateMsg(String name) {
		int time=0;
		time=date.getHours();
		if(time<12) {
			return "Good Morning! "+ name;
		}
		else if(time<16) {
			return "Good Afternoon! "+ name;
		}
		else if(time<20) {
			return "Good Evening! "+ name;
		}
		else {
			return "Good Night! " + name;
		}
		
	}
}
