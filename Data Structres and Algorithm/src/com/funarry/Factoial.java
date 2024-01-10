package com.funarry;

import java.util.Scanner;

public class Factoial {
	public static int fact(int x) {
		int r = 1;
		for (int i = 1; i <= x; i++) {
			r = r * i;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. to find factorial:-");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

}
