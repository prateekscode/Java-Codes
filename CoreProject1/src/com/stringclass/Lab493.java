package com.stringclass;

class Lab493 {
	public static void main(String as[]) {

		String exp5 = "[A-Z][A-Za-z0-9#$@]*";

		System.out.println("Sri Nivas".matches(exp5));
		System.out.println("Sri@99".matches(exp5));
		System.out.println("Sri$99#jlc".matches(exp5));
		System.out.println("sri$99#jlc".matches(exp5));
	}
}