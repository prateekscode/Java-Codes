package com.java8.india;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Lab4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("PRATEEK");list.add("ASHEESH");list.add("HEMANT");
		list.add("SHIKHA");list.add("NIDHI");
		System.out.println(list);
		
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("**************************");
		list.forEach(a->System.out.println(a));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		list.forEach(System.out::println);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
		list.forEach(b->{
			String c=b+" kumar";
			System.out.println(c);
		});
		//System.out.println(b);
	}

}
//Method reference in Java 8
