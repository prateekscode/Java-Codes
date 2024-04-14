package com.java8.DateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonDatTim {
	public static void main(String[] args) {
		//Represents a date and time with a time zone.
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(availableZoneIds.size());
		availableZoneIds.forEach(System.out::println);
		
		ZonedDateTime CustomeDateTime = ZonedDateTime.of(2024, 02, 15, 14, 23, 23, 23,ZoneId.of("Asia/Calcutta"));
		System.out.println(CustomeDateTime);
	}
}
