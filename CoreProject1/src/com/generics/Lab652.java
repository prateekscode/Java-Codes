package com.generics;
import java.util.*;

public class Lab652 {

	public static void main(String[] args) {
	
		Map<String,Integer> mmap=new HashMap<String,Integer>();
//		Map<String,Integer> mmap=new LinkedHashMap<String,Integer>();
//		Map<String,Integer> mmap=new TreeMap<String,Integer>();
		
		mmap.put("AA",50);
		mmap.put("BB",60);
		mmap.put("CC",70);
		mmap.put("DD",80);
		mmap.put("EE",90);
		
//		The method put(String, Integer) in the type Map<String,Integer> is not applicable for the arguments (int, int)
//		mmap.put(123, 321);
//		The method put(String, Integer) in the type Map<String,Integer> is not applicable for the arguments (String, double)
//		mmap.put("Hii", 33.55);
		
		System.out.println(mmap);
		
		Set<String> mkey=mmap.keySet();
		for(String s:mkey) {
			Integer mval=mmap.get(s);
			System.out.println(s+"\t"+mval);
		}
	}
}