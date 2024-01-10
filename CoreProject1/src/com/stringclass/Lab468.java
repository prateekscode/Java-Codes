package com.stringclass;

public class Lab468 {

	public static void main(String[] args) {
		//Type mismatch: cannot convert from int to String
//		String str=99;
/*		Duplicate local variable str
		- Cannot cast from int to String*/
//		String str=(String)99;
		String str1=String.valueOf(99);
		System.out.println(str1);
		
		String str2=String.valueOf(99.99);
		System.out.println(str2);
		
		String str3=String.valueOf(true);
		System.out.println(str3);
//		Invalid character constant ('')
		char ch[]= {'A','S','I','A','A'};
		String str4=String.valueOf(ch);
		System.out.println(str4);
		
		String str5=String.valueOf(ch,1,3);
		System.out.println(str5);
		
	}

}
