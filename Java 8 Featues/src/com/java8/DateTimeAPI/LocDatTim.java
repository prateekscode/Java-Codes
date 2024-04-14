package com.java8.DateTimeAPI;

import java.time.LocalDateTime;

public class LocDatTim {
	public static void main(String[] args) {
		//LocalDateTime represents a date and time without time zone.
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime myDate = LocalDateTime.parse("2002-01-21T19:45");
		System.out.println(myDate);
	}
}
