package com.utilpack;
import java.util.*;
public class Lab675 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("ok");
		list.add("Hii");
		list.add("see u");
		list.add("Hii");
		list.add("Evening");
		
		System.out.println(list);
		
		Enumeration<String> enms=Collections.enumeration(list);
		while(enms.hasMoreElements()) {
			String str=enms.nextElement();
			System.out.println(str);
		}
		
		Vector<Integer> mv=new Vector<>();
		mv.add(20);
		mv.add(30);
		mv.add(10);
		System.out.println(mv);
		
		Enumeration<Integer> me=mv.elements();
		List<Integer> nls=Collections.list(me);
		System.out.println(nls);
	}

}
