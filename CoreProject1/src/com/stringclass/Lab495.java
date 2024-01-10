package com.stringclass;

class Lab495 {
	public static void main(String as[]) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		StringBuilder sb = new StringBuilder("Namaste");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println("------------------");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("-People");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("------------------");
		
		sb.append("1234567890DD");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("------------------");
		
		sb.append("Hello Guys");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("------------------");
		
		sb.trimToSize();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}