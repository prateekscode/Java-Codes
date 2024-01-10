package com.utilpack;
import java.util.*;
public class Lab672 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("ok");
		list.add("Hii");
		list.add("see u");
		list.add("Hii");
		list.add("Evening");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		String min=Collections.min(list);
		System.out.println(min);
		
		String max=Collections.max(list);
		System.out.println(max);
		
		Collections.swap(list, 0, 3);
		System.out.println(list);
		
		Collections.swap(list, 2, 4);
		System.out.println(list);
		
		boolean b1=Collections.replaceAll(list,"Hii" , "Bye");
		System.out.println(b1);
		System.out.println(list);
		
		boolean b2=Collections.replaceAll(list,"game" , "gone");
		System.out.println(b2);
		System.out.println(list);
	}
}
