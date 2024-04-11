package com.india.java8;

public class Java8Lab1 {

	public static void main(String[] args) {

		Inter2 i1 = () -> System.out.println("Hello! Everyone");
		i1.m1();

		Inter2 i2 = () -> {
			System.out.println("2nd ref statement");
			System.out.println("this is for multiple statements");
		};
		i2.m1();

		Inter3 i3 = (a, b) -> System.out.println("Sum of a and b: " + (a + b));
		i3.m2(20, 10);
		
		Inter3 i4=(a,b)->{
			System.out.println("Product of a and b: "+(a*b));
			System.out.println("Subtract of a and b: "+(a-b));
			System.out.println("Division of a and b: "+(a/b));
		};
		i4.m2(30, 10);

	}

	@FunctionalInterface
	interface Inter2 {
		void m1();
		//because lambda expression can be used only with functional interface so, it have only 1 method.
		//	void m2();
	}

	interface Inter3 {
		void m2(int a, int b);
	}
}
