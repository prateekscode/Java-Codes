package com.stringclass;

public class Lab467 {

	public static void main(String[] args) {
		String str1=new String("ABC");
		String str2=new String("ABC");
		String str3=new String("abc");
		
		int x=str1.compareTo(str2);
		System.out.println(x);
		x=str1.compareTo("ABD");
		System.out.println(x);
		
		x=str1.compareTo("ABA");
		System.out.println(x);
		x=str2.compareTo("AEC");
		System.out.println(x);
		
		x="ABC".compareTo("AAA");
		System.out.println(x);
		x=str1.compareTo(str3);
		System.out.println(x);
		x=str1.compareToIgnoreCase(str3);
		System.out.println(x);
	}

}
