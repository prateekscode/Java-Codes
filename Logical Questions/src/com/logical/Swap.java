package com.logical;

import java.util.Scanner;

public class Swap {
//using third variable
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no--");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=b;
		b=a;
		a=c;
		System.out.println("After swapping--");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
