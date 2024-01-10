package com.stringclass;

public class Lab458 {

	public static void main(String[] args) {
		String str1="Joy";
		String str2=new String("Joy");
		String str3=new String("Joy");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
	}

}
