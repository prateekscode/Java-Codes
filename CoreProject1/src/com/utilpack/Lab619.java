package com.utilpack;

import java.util.ArrayList;
import java.util.List;

public class Lab619 {

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
		
		List mL1=cl.subList(2, 6);
		System.out.println(mL1);
		
		List mL2=cl.subList(0, 3);
		System.out.println(mL2);
	}

}
