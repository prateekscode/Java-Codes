package com.india.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Lab5 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("PRATEEK");list.add("ASHEESH");list.add("HEMANT");
		list.add("SHIKHA");list.add("NIDHI");
		System.out.println(list);
		
		System.out.println("**************************");
		List<String> newList=list.stream().map(e->e.toLowerCase()+" kumar").collect(Collectors.toList());
		System.out.println(newList);
	}

}
//Method reference in Java 8
