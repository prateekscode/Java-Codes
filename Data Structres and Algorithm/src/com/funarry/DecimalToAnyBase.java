package com.funarry;

import java.util.*;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number & base--");
		int n = sc.nextInt();
		int b = sc.nextInt();
		int dnb = getvalue(n, b);
		System.out.println("After Converting: " + dnb);

	}

	public static int getvalue(int n, int b) {
		int v = 0;
		int p = 1;

		while (n > 0) {
			int dig = n % b;
			n = n / b;

			v = v + dig * p;
			p = p * 10;
		}

		return v;
	}
}
