package com.stringclass;

public class Lab466 {

	public static void main(String[] args) {
		String str1=new String("INDIA");
		String str2=new String("india");
		
		Boolean b1=str1.equals(str2);
		System.out.println(b1);
		
		Boolean b2=str1.equalsIgnoreCase(str2);
		System.out.println(b2);
	}

}
