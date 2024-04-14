package com.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocDat {

	public static void main(String[] args) {
		//LocalDate represents a date without time zone.
		LocalDate today = LocalDate.now();
		System.out.println(today);
		int dayOfMonth = today.getDayOfMonth();
		Month month = today.getMonth();
		int year = today.getYear();
		System.out.println(dayOfMonth);
		System.out.println(month);
		System.out.println(year);
		
		System.out.println("---------------------");
		LocalDate yesterday = today.minusDays(1);
		LocalDate pastDate = today.minusMonths(100);
		
		System.out.println(yesterday);
		System.out.println(pastDate);
		
		if(today.isAfter(yesterday)) {
			System.out.println("Haanji");
		}
		
		System.out.println("----------------------");
		LocalDate customDate = LocalDate.of(2002, 01, 21);
		System.out.println(customDate);
		
		
	}
}
