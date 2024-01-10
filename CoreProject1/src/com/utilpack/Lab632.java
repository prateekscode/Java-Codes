package com.utilpack;

import java.util.*;

public class Lab632 {

	public static void main(String[] args) {
		Set cs=new HashSet();
		
		cs.add("hello");
		cs.add("hii");
		cs.add("bye");
		cs.add("good day");
		cs.add("123");
		cs.add("88.25");
		
		System.out.println(cs);
		
		List ml=new ArrayList();
		
		ml.add(10);
		ml.add(20);
		ml.add(30);
		ml.add(40);
		ml.add(50);
		
		System.out.println(ml);
		
		Set mset=new HashSet(ml);
		System.out.println(mset);
		
		System.out.println("Using iterator---");
		Iterator it=cs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
