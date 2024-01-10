package com.stringclass;

class Lab497 {
	public static void main(String as[]) {
		StringBuilder sb1 = new StringBuilder("RPM");
		StringBuilder sb2 = new StringBuilder("RPM");
		System.out.println(sb1 == sb2);
		boolean b1 = sb1.equals(sb2);
		System.out.println(b1);

		String str1 = sb1.toString();
		boolean b2 = str1.contentEquals(sb2);
//		The method contentEquals(String) is undefined for the type StringBuilder
//		b2=sb2.contentEquals(str1); 
		System.out.println(b2);

		String str2 = sb2.toString();
		boolean b3 = str1.equals(str2);
		System.out.println(b3);
	}
}