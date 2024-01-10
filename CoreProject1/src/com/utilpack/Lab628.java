package com.utilpack;
import java.util.*;
public class Lab628 {

	public static void main(String[] args) {
		List ml=new LinkedList();
		
		ml.add("Hii");
		ml.add("Hello");
		ml.add("whats's");
		ml.add("up");
		ml.add("tata");
		ml.add("bye");
		ml.add("tata");
		
		System.out.println(ml);
		System.out.println("********************");
		
		ListIterator li=ml.listIterator();
		
		while(li.hasNext()) {
			String str=li.next().toString();
			int idx=li.nextIndex();
			System.out.println(idx+"\t"+str);
		}
		System.out.println("++++++++++++++++++++");
		li=ml.listIterator(ml.size());
		
		while(li.hasPrevious()) {
			String str=li.previous().toString();
			int idx=li.previousIndex();
			System.out.println(idx+"\t"+str);
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(ml.indexOf("tata"));
	}

}
