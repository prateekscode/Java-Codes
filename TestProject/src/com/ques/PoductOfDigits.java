package com.ques;

public class PoductOfDigits {
	public static void main(String[] args) {
		int num = 732;
		int product = 1;

		while (num > 9) {
			while (num > 0) {
				int rem = num % 10;
				num = num / 10;
				product = product * rem;
			}
			System.out.println(product);
			num = product;
			product = 1;
		}
		
	}
}
