package com.utilpack;

import java.util.*;

public class Lab637 {

	public static void main(String[] args) {
		TreeSet nset=new TreeSet();
		
		nset.add(70);
		nset.add(80);
		nset.add(30);
		nset.add(90);
		nset.add(10);
		nset.add(50);
		nset.add(20);
		nset.add(60);
		
		System.out.println(nset);
		
		Set mset1=nset.descendingSet();
		System.out.println(mset1);
		
		System.out.println("***************");
		
		Iterator it=mset1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}