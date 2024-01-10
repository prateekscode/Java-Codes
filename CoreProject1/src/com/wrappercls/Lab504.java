package com.wrappercls;

public class Lab504 {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(123);
		
		byte b=i1.byteValue();
		short s=i1.shortValue();
		int a=i1.intValue();
		long x=i1.longValue();
		float f=i1.floatValue();
		double d=i1.doubleValue();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(x);
		System.out.println(f);
		System.out.println(d);
		
		Double d1=Double.valueOf(99.39);
		System.out.println(d1);
		
		b=d1.byteValue();
		s=d1.shortValue();
		a=d1.intValue();
		x=d1.longValue();
		f=d1.floatValue();
		d=d1.doubleValue();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(x);
		System.out.println(f);
		System.out.println(d);
	}

}
