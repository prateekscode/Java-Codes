package com.utilpack;
import java.util.*;
public class Lab631 {

	public static void main(String[] args) {
		
		ArrayList ml=new ArrayList();
		
		ml.add("Hii");
		ml.add("Hello");
		ml.add("whats's");
		ml.add("up");
		
		System.out.println(ml);
		
		System.out.println("Using iterator-------");
		ListIterator listit=ml.listIterator();
		while(listit.hasNext()) {
//		Exception-- java.util.ConcurrentModificationException
			System.out.println(listit.next());
//			ml.remove(listit.next());
//			ml.add("Bye!");
//			ml.set(2,"Tata");
		}
	}
}