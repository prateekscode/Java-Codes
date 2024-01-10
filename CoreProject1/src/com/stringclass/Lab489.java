package com.stringclass;

class Lab489 {
	public static void main(String as[]) {
		String exp1 = "[A-Z]";
		System.out.println("C".matches(exp1));
		System.out.println("c".matches(exp1));
		System.out.println("NO".matches(exp1));
		System.out.println("-------------------");
		String exp2 = "[A-Z]*";
		System.out.println("JK".matches(exp2));
		System.out.println("Jk".matches(exp2));
		System.out.println("PQR".matches(exp2));
		System.out.println("PQr".matches(exp2));
		System.out.println("NAMASTE".matches(exp2));
		System.out.println("Namaste".matches(exp2));
		System.out.println("H".matches(exp1));
		System.out.println("".matches(exp1));
	}
}