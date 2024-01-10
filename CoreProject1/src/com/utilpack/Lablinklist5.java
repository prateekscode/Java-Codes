package com.utilpack;

import java.util.*;

public class Lablinklist5 {

	public static void main(String[] args) {
		
		List cl=new LinkedList();
		cl.add("Java");
		cl.add("is a");
		cl.add("programming");
		cl.add("Lang");
		cl.add("as well as");
		cl.add("technology");
		cl.add("Lang");
		
		System.out.println("Now using iterator-----");
		Iterator it=cl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using listIterator()---");
		ListIterator li=cl.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("Using listIterator Reverse---");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
