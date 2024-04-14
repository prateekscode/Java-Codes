package com.java8.DateTimeAPI;

import java.time.Instant;

public class Instnt {

	public static void main(String[] args) {
		/*
		 * this time in milliseconds is in UTC(Universal Coordinated Time) that it has no time zone
		 * [same for every region] and are calculated from 1 Jan 1970 midnight 12:00PM
		 * this time after 1970 called epoch time.The time in milliseconds we get 
		 * can converted to to till date using website-- https://www.epochconverter.com/
		 */
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		
		//Represents an instantaneous point on the timeline, typically used for machine timestamps.
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(now.getNano());
		}

}
