package com.utilpack;
import java.util.*;
public class Lab627 {

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
		
		System.out.println("Using Listiterator--------\n");
		ListIterator li=ml.listIterator();
		
		while(li.hasNext()) {
			String str=li.next().toString();
			if(str.equals("tata")) {
				li.set("Evening!");;
				break;
			}
		}
		System.out.println(ml);
		li=ml.listIterator();
		
		while(li.hasNext()) {
			String str=li.next().toString();
			if(str.equals("tata")) {
				li.remove();
				break;
			}
		}
		
		System.out.println(ml);
	}

}
