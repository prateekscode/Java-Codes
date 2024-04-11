package com.lambda.exp;
import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<Integer, String>();
		m.put(20,"k");
		m.put(80, "y");
		m.put(50, "x");
		System.out.println("Before manual sorting: "+m);
		
		Map<Integer,String> mm=new TreeMap<Integer, String>((a,b)->b-a);
		mm.put(20,"k");
		mm.put(80, "y");
		mm.put(50, "x");
		System.out.println("Before manual sorting: "+mm);
		
	}
}
