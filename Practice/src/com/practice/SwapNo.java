package com.practice;
import java.util.Scanner;
public class SwapNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no.");
		int n=sc.nextInt();
		System.out.println("Enter second no.");
		int n2=sc.nextInt();
		
		n=n+n2;
		n2=n-n2;
		n=n-n2;
		
		System.out.println("After swapping-------");
		System.out.println(n);
		System.out.println(n2);
	}

}
