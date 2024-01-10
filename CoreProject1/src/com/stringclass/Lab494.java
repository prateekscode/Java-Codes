package com.stringclass;

class Lab494 {
	public static void main(String as[]) {

		String exp3 = "[6-9][0-9]*";

		System.out.println("12345".matches(exp3));
		System.out.println("012345".matches(exp3));
		System.out.println("789565".matches(exp3));
		System.out.println("678565".matches(exp3));
	}
}