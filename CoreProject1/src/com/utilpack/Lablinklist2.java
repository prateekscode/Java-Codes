package com.utilpack;
import java.util.*;

public class Lablinklist2 {

	public static void main(String[] args) {
		
		List cl=new LinkedList();
		cl.add("Java");
		cl.add("is a");
		cl.add("programming");
		cl.add("Lang");
		cl.add("as well as");
		cl.add("technology");
		
		System.out.println(cl);
		cl.add(3, "spring");
		System.out.println(cl);
		cl.remove("spring");
		
		System.out.println(cl.remove(3));
		System.out.println(cl.remove(1));
		System.out.println(cl);
		
		cl.add(0,"HEllo");
		System.out.println(cl);
	}

}
