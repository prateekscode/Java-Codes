package com.java8.india;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Lab3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Aman");
		list.add("Eva");
		list.add("Dev");
		list.add("Charan");
		list.add("Ben");
		
		Comparator com=(a,b)->{
			String s1=(String)a;
			String s2=(String)b;
			return s1.compareTo(s2);
		};
		
		System.out.println(list);
		Collections.sort(list,com);
		System.out.println(list);
		
		Collections.sort(list,(a,b)->{
			String s1=(String)a;
			String s2=(String)b;
			return b.compareTo(a);
		});
		System.out.println(list);
		
		Collections.sort(list,(a,b)->{
			String s1=(String)a;
			String s2=(String)b;
			return a.compareTo(b);
		});
		System.out.println(list);

		
	}

}
