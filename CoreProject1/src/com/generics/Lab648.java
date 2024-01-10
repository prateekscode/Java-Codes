package com.generics;
import java.util.*;

public class Lab648 {

	public static void main(String[] args) {
	
		List<Integer> ml=new ArrayList<Integer>();
		
		ml.add(50);
		ml.add(60);
		ml.add(70);
		ml.add(80);
		ml.add(90);
//		The method add(Integer) in the type List<Integer> is not applicable for the arguments (double)
//		ml.add(5.5);
//		The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)
//		ml.add("Roy");
		System.out.println(ml);
		
		System.out.println("Using For");
		
		for(Integer in:ml) {
			System.out.println(in);
		}
		Iterator<Integer> it=ml.listIterator();
		while(it.hasNext()) {
			Integer in=it.next();
			System.out.println(in);
		}
	}

}
