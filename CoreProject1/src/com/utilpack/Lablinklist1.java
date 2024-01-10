package com.utilpack;

import java.util.*;

public class Lablinklist1 {

	public static void main(String[] args) {
		
		List cl=new LinkedList();
		
		cl.add("Java");
		cl.add(" is Language");
		cl.add("and Technology");
		cl.add("best");
		cl.add("or");
		cl.add("in industry.");
		
		System.out.println(cl);
		
		List nlist=new LinkedList();
		
		nlist.add(11);
		nlist.add(13);
		nlist.add(15);
		nlist.add(17);
		
		System.out.println(nlist);
		
		cl.addAll(nlist);
		System.out.println(cl);
		
		cl.retainAll(nlist);
		System.out.println(cl);
	}
}