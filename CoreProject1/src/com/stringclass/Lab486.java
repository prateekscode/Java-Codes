package com.stringclass;

class Lab486 {
	public static void main(String as[]) {
		
		String str1 = new String();
		System.out.println(str1);
		System.out.println(str1.length());
		
		String str2 = new String("Namaste!");
		System.out.println(str2);
		System.out.println(str2.length());
		
		char chArr[] = { 'C', 'H', 'A', 'N', 'D', 'R', 'A', 'Y','A','N' };
		String str3 = new String(chArr);
		System.out.println(str3);
		System.out.println(str3.length());
		
		String str4 = new String(chArr, 3, 5);
		System.out.println(str4);
		System.out.println(str4.length());
		
		byte byArr[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
		String str5 = new String(byArr);
		System.out.println(str5);
		System.out.println(str5.length());
		
		String str6 = new String(byArr, 2, 7);
		System.out.println(str6);
		System.out.println(str6.length());
	}
}