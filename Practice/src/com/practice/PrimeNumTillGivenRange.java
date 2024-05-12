package com.practice;

import java.util.*;

public class PrimeNumTillGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int s = sc.nextInt();
		System.out.println("Enter ending range: ");
		int e = sc.nextInt();
		System.out.println("__________________________");
		boolean res = false;

		for (int i = s; i <= e; i++) {
			if (i == 1) {
				System.out.println(i + " is not prime number");
				i++;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					res = true;
					break;
				}
				res = false;
			}
			if (res == true)
				System.out.println(i + " is not prime number");
			else
				System.out.println(i + " is a prime number");

		}
	}

}
