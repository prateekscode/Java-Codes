package com.java8.DateTimeAPI;

import java.time.LocalTime;

public class LocTim {
	
	public static void main(String[] args) {
		//LocalTime represents without a date or time zone.	
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime customTime = LocalTime.of(13, 30, 30);
		System.out.println(customTime);
		
		String timeInString="12:30:44";
		//parse is used to convert time in string to real time.
		LocalTime parsedTime = LocalTime.parse(timeInString);
		System.out.println(parsedTime);
		
		LocalTime beforeOneHour = now.minusHours(1);
		System.out.println(beforeOneHour);
		
		if(now.isAfter(beforeOneHour)) {
			System.out.println("Haanji");
		}
	}
}
