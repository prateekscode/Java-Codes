package com.utilpack;
import java.util.*;
public class Lab686 {

	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		
		System.out.println("Date\t"+dt.getDate());
		System.out.println("Month\t"+dt.getMonth());
		System.out.println("Month\t"+(dt.getMonth()+1));
		System.out.println("Year\t"+dt.getYear());
		System.out.println("Year\t"+(dt.getYear()+1900));
		
		System.out.println("Hour\t"+dt.getHours());
		System.out.println("Minutes\t"+dt.getMinutes());
		System.out.println("Seconds\t"+dt.getSeconds());
		
		System.out.println("Storing Date");
		dt.setDate(25);
		dt.setMonth(0);
		dt.setYear(121);
		System.out.println(dt);
		
	}

}
