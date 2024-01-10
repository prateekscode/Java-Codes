package com.utilpack;
import java.util.*;
public class Lab629 {

	public static void main(String[] args) {
		List ml=new ArrayList();
		System.out.println(ml.size());
		
		ml.add("Hii");
		ml.add("Hello");
		ml.add("whats's");
		ml.add("up");
		ml.add("tata");
		ml.add("bye");
		ml.add("tata");
		
		List myc=new ArrayList(ml);
		System.out.println(myc.size());
		
		myc.add("JDBC");
		System.out.println(myc);
		
		Vector v=new Vector();
		
		v.add(50);
		v.add(55);
		v.add(60);
		v.add(65);
		v.add(70);
		
		System.out.println(v);
		
		List nlist=new ArrayList(v);
		System.out.println(nlist.size());
		System.out.println(nlist);
	}
}