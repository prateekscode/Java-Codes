package com.utilpack;
import java.util.*;
public class Lab676 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("ok");
		list.add("Hii");
		list.add("see u");
		list.add("Hii");
		list.add("Evening");
		
		List<String> unml=Collections.unmodifiableList(list);
		
		System.out.println(list);
		System.out.println(unml);
		
		list.add("Namaste");
		System.out.println(list);
		
//		 java.lang.UnsupportedOperationException
//		unml.add("Namaste");
		System.out.println(unml);
	}

}
