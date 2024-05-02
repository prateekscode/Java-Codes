package com.practice;

import java.util.function.Predicate;

public class Pred1 {
	
	public static void main(String[] args) {
		int[] x= {2,5,6,7,8,9,10,12,13,45,16,17,19,18};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		me(p1,x);
		System.out.println("--------");
		me(p2,x);
		System.out.println("--------");
		me(p1.negate(),x);
		System.out.println("--------");
		me(p1.and(p2),x);
		System.out.println("--------");
		me(p1.or(p2),x);
	}
	public static void  me(Predicate<Integer> p,int[] a) {
		for(int x1:a) {
			if(p.test(x1))
			System.out.println(x1);
		}
	}
}
