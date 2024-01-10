package com.utilpack;
import java.util.*;
public class Lab673 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("ok");
		list.add("Hii");
		list.add("see u");
		list.add("Hii");
		list.add("Evening");
		
		System.out.println(list);
		
		Collections.rotate(list, 1);
		System.out.println(list);
		
		Collections.rotate(list, -2);
		System.out.println(list);		
		
		Collections.shuffle(list);
		System.out.println(list);
		
		for(int i=1;i<5;i++) {
			Collections.shuffle(list);
			System.out.println(list);
		}
		
		Collections.fill(list,"ABC");
		System.out.println(list);
	}

}
