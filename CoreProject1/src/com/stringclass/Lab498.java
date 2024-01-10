package com.stringclass;

class Lab498 {
	public static void main(String as[]) {
		StringBuilder sb = new StringBuilder("A");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
	}
}