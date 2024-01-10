package com.utilpack;

import java.util.*;

public class Lab633 {

	public static void main(String[] args) {
		Set cs=new LinkedHashSet();
		
		cs.add("hello");
		cs.add("hii");
		cs.add("bye");
		cs.add("good day");
		cs.add("123");
		cs.add("88.25");
		
		System.out.println(cs);
		
		System.out.println("Using iterator-------");
		Iterator it=cs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}