package com.utilpack;

import java.util.*;

public class Lab622 {

	public static void main(String[] args) {
		
		List cl=new ArrayList();
		cl.add("Java");
		cl.add("is a");
		cl.add("programming");
		cl.add("Lang");
		cl.add("as well as");
		cl.add("technology");
		cl.add("Lang");
		System.out.println(cl);
		
		System.out.println("Using Listiterator reverse-----------");
		ListIterator li=cl.listIterator(cl.size());
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
