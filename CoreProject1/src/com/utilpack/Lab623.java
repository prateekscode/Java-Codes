package com.utilpack;
import java.util.*;
public class Lab623 {

	public static void main(String[] args) {
		List ml=new ArrayList();
		
		ml.add(12);
		ml.add(24);
		ml.add(36);
		ml.add(48);
		ml.add(60);
		ml.add(72);
		
		System.out.println(ml);
		
		System.out.println("Using Listiterator--------");
		ListIterator li=ml.listIterator(3);
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
