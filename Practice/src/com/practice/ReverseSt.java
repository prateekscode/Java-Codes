package com.practice;

public class ReverseSt {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		
		if(s==null)
			throw new IllegalArgumentException("Null is not valid string");
		
		StringBuilder sb=new StringBuilder();
		char[] c=s.toCharArray();
		System.out.println(c.length);
		
		for(int i=c.length-1;i>=0;i--) {
			sb.append(c[i]);
		}
		return sb.toString();
	}
}