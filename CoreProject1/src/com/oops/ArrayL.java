package com.oops;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayL{

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>(5);
		ar.add("Hello!");
		ar.add("Hii!");
		ar.add("Bye--");
		ar.add("Bye Bye...");
		System.out.println(ar);
		
		for(String a:ar) {
			System.out.println(a);
		}
		LinkedList<String> l=new LinkedList<String>();
		l.add("abcd");
		l.add("linked");
		l.add("list");
		l.remove("abcd");
		l.add("3 strings above");
		System.out.println(l);
		
		for(String b: l) {
			System.out.println(b);
			
		}
	}

}
