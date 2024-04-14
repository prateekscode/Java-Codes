package com.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PriodT {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate then = LocalDate.of(2002, 1, 21);
		//Represents a period of time between two dates.
		Period between = Period.between(now, then);
		System.out.println(between);
	}

}
