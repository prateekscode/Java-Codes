package com.java8.DateTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationT {
	public static void main(String[] args) {
		Instant start=Instant.now();
		int sum=0;
		for(int i=0;i<100000;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		Instant end=Instant.now();
		
		//Represents a duration of time between two points in time.
		Duration d1 = Duration.between(start, end);
		LocalDateTime a = LocalDateTime.now();
		LocalDateTime b = LocalDateTime.now();
		Duration duration1 = Duration.between(a, b);
		System.out.println("---------------------");
		System.out.println(duration1);
		
		System.out.println("---------------------");
		
		Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
		System.out.println(d1);
		System.out.println(d2);
		int d = d1.compareTo(d2);
		System.out.println(d);
	}
}
