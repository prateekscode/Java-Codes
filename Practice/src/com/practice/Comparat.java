package com.practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparat {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>(new StrinCompar());
		s.add("Anuj");
		s.add("Cameron");
		s.add("Bhuj");
		s.add("Dr.");
		System.out.println(s);

	}
}
class StrinCompar implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
	String s1=(String)o1;
	String s2=(String)o2;
	return s2.compareTo(s1);
	}
}