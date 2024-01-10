package com.utilpack;
import java.util.*;
public class Lab630 {

	public static void main(String[] args) {
		LinkedList ml=new LinkedList();
		System.out.println(ml.size());
		
		ml.add("Hii");
		ml.add("Hello");
		ml.add("whats's");
		ml.add("up");
		
		System.out.println(ml);
		
		ml.add(2,"Namaste!");
		System.out.println(ml);
		
		System.out.println("--------------");
		System.out.println(ml.getFirst());
		System.out.println(ml.getLast());
		
		ml.addFirst("Hey");
		ml.addLast("Bye!");
		System.out.println(ml);
		
		System.out.println(ml.removeFirst());
		System.out.println(ml.removeLast());
		System.out.println(ml);
		System.out.println("-------------");
		
		System.out.println("Using iterator-----");
		Iterator it=ml.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}