package com.exceptions;

public class Lab547 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			int a=10/0;
			System.out.println("Result:"+a);
		}
		catch(ArithmeticException e) {
			System.out.println("Provide correct value.");
		}
/*		catch or finally must be the next block just after catch
 * 		No statement allowed in between.
 */
		System.out.println("Hello!");
		catch(Exception e) {
			System.out.println("Hey! Provide corret value.");
		}
		System.out.println("Main ended.");
	}

}
