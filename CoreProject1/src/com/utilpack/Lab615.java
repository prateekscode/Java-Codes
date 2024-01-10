package com.utilpack;

import java.util.*;

public class Lab615 {

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
		
		cl.addAll(nlist);
		System.out.println(cl);
		
		cl.removeAll(nlist);
		System.out.println(cl);
	}
}