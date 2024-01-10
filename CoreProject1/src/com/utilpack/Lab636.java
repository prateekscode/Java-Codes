package com.utilpack;

import java.util.*;

public class Lab636 {

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
		
		Set mset1=nset.subSet(20, 60);
		System.out.println(mset1);
		
		Set mset2=nset.subSet(20, true, 60, false);
		System.out.println(mset2);
		
		Set mset3=nset.subSet(20, true, 60, true);
		System.out.println(mset3);
		
		Set mset4=nset.headSet(50);
		System.out.println(mset4);
		
		Set mset5=nset.headSet(50,true);
		System.out.println(mset5);
		
		Set mset6=nset.tailSet(50);
		System.out.println(mset6);
		
		Set mset7=nset.tailSet(50,false);
		System.out.println(mset7);
	}
}