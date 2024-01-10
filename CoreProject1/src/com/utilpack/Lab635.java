package com.utilpack;

import java.util.TreeSet;

public class Lab635 {

	public static void main(String[] args) {
		TreeSet nset=new TreeSet();
		
		nset.add(70);
		nset.add(80);
		nset.add(30);
		nset.add(90);
		nset.add(10);
		nset.add(50);
		nset.add(60);
		
		System.out.println(nset);
		
		System.out.println(nset.first());
		System.out.println(nset.last());
		System.out.println(nset);
		
		System.out.println(nset.lower(50));
		System.out.println(nset.higher(60));
		System.out.println(nset);
		
		System.out.println(nset.floor(50));
		System.out.println(nset.ceiling(60));
		System.out.println(nset);
		
		System.out.println(nset.pollFirst());
		System.out.println(nset.pollLast());
		System.out.println(nset);
	}

}
