package com.utilpack;

import java.util.*;

public class Lab613 {

	public static void main(String[] args) {
		
		List cl=new ArrayList();
		
		cl.add("Java");
		cl.add(" is Language");
		cl.add("and Technology");
		cl.add("best");
		cl.add("or");
		cl.add("in industry.");
		
		System.out.println(cl);
		
		List nlist=new ArrayList();
		
		nlist.add(11);
		nlist.add(13);
		nlist.add(15);
		nlist.add(17);
		
		System.out.println(nlist);
		
		cl.add(nlist);
		System.out.println(cl);
		
		boolean b1=cl.contains(nlist);
		System.out.println(b1);
	}

}
