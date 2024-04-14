package com.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatTimFormatter {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		//Formats and parse dates and times.
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = localDate.format(myFormatter);
		System.out.println(format);
		
		String date="22/04/2026";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate2 = LocalDate.parse(date, dateTimeFormatter);
		System.out.println(localDate2);
		
		String datTimeString="2024-02-25 10:30:45+05:30";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
		ZonedDateTime zonedDateTime = ZonedDateTime.parse(datTimeString, dateTimeFormatter1);
		System.out.println(zonedDateTime);
		
		
	}
}
