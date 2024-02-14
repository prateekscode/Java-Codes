package com.logical;

import java.util.Scanner;

public class WithoutThirtdVariable {
	//without using third variable
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no--");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping--");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
