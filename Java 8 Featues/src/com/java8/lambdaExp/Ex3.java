package com.java8.lambdaExp;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(13);
		al.add(9);
		al.add(5);
		al.add(2);
		//here it is invoking compare method of comparator bcoz comparator is functional interface.
		Collections.sort(al,(a,b)->b-a);
		System.out.println(al);
	}

}
