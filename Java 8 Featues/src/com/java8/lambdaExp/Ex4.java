package com.java8.lambdaExp;
import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<Integer>();
		s.add(33);
		s.add(56);
		s.add(1);
		System.out.println("Before manual sorting: "+s);
		Set<Integer> ss=new TreeSet<Integer>((a,b)->b-a);
		ss.add(33);
		ss.add(56);
		ss.add(1);
		System.out.println("After manual sorting:"+ss);

	}

}
