package com.utilpack;
import java.util.*;

public class Lablinklist3 {

	public static void main(String[] args) {
		
		List cl=new LinkedList();
		cl.add("Java");
		cl.add("is a");
		cl.add("programming");
		cl.add("Lang");
		cl.add("as well as");
		cl.add("technology");
		cl.add("Lang");
		
		System.out.println(cl);
		
		System.out.println(cl.get(1));
		System.out.println(cl.get(4));
		System.out.println(cl);
		
		System.out.println(cl.indexOf("Java"));
		System.out.println(cl.indexOf("Lang"));
		System.out.println(cl.lastIndexOf("Lang"));
		System.out.println(cl);
		
		System.out.println(cl.set(0, "Hii!"));
		System.out.println(cl.set(2, "program"));
		System.out.println(cl);
		
	}
}
