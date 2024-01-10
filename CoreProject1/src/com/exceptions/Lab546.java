package com.exceptions;

public class Lab546 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			int a=10/0;
			System.out.println("Result:"+a);
		}
/*		catch or finally must be the next block just after try
 * 		No statement allowed in between.
 */
		System.out.println("Hello!");
		catch(ArithmeticException e) {
			System.out.println("Provide correct value.");
		}
		System.out.println("Main ended.");
	}

}
