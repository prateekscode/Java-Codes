package com.stringclass;

class Lab496 {
	public static void main(String as[]) {
		StringBuilder sb1 = new StringBuilder("Hello Guys");
		System.out.println(sb1);
		System.out.println(sb1.length());

		sb1.insert(6, "ISRO");
		System.out.println(sb1);
		System.out.println(sb1.length());

		double d = 155.44;
		sb1.insert(10, d);
		System.out.println(sb1);
		System.out.println(sb1.length());

		sb1.deleteCharAt(3);
		System.out.println(sb1);
		System.out.println(sb1.length());

		sb1.delete(9, 14);
		System.out.println(sb1);
		System.out.println(sb1.length());

		sb1.replace(5, 8, "Namaste");
		System.out.println(sb1);
		System.out.println(sb1.length());
	}
}