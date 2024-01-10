package com.utilpack;
import java.util.*;
public class Lab671 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("bye");
		list.add("Hii");
		list.add("ok");
		list.add("see u");
		list.add("Evening");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		int x=Collections.binarySearch(list, "bye");
		System.out.println(x);
		
		int y=Collections.binarySearch(list, "Morning");
		System.out.println(y);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
