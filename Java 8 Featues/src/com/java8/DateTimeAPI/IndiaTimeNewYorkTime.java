package com.java8.DateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class IndiaTimeNewYorkTime {
	public static void main(String[] args) {
		ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current time in India: "+indiaTime);
		ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current time in New York: "+newYorkTime);
	}
}
