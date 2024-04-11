package com.india.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Lab2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("Aman");
		list.add("Eva");
		list.add("Dev");
		list.add("Charan");
		list.add("Ben");

		System.out.println(list);
		Collections.sort(list, new StrComp());
		System.out.println(list);

	}
}

class StrComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String a = (String) o1;
		String b = (String) o2;
		return a.compareTo(b);
	}

}