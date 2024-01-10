package com.utilpack;

import java.util.*;

public class Lab612 {

	public static void main(String[] args) {
		
		Collection col=new ArrayList();
		col.add("Java");
		col.add(" is Language");
		col.add("and Technology");
		col.add("best");
		col.add("or");
		col.add("in industry.");
		
		System.out.println(col);
		
		Iterator ir=col.iterator();
		while(ir.hasNext()) {
			Object ob=ir.next();
			System.out.println(ob);
		}
		System.out.println("*****************");
		
		Object objArr[]=col.toArray();
		
		for(Object ob: objArr) {
			System.out.println(ob);
		}
	}
}
