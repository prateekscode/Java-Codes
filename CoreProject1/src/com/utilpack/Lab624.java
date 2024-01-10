package com.utilpack;
import java.util.*;
public class Lab624 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(30);
		v.add(33);
		v.add(36);
		v.add(38);
		v.add(40);
		v.add(44);
		
		System.out.println(v);
		
		System.out.println("Using Enumeration---");
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("Using Iterator-------");
		Iterator in=v.iterator();
		while(in.hasNext()) {
			System.out.println(in.next());
		}
	}
}
