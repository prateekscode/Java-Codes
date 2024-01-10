package com.utilpack;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Lab669a {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new StringDescComperator());
		set.add("RAJ");
		set.add("ANUSHA");
		set.add("SUJATA");
		set.add("ANUSHA");
		set.add("SEEMA");
		set.add("SANDEEP");
		set.add("NIDHI");
		set.add("RAJ"); // set.add(10);

		System.out.println(set);

	}

}

class StringDescComperator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}