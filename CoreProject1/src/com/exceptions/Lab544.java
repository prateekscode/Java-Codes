package com.exceptions;

public class Lab544 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			int a=10/0;
			System.out.println("Result:"+a);
//			Syntax error, insert "Finally" to complete TryStatement
		}
		System.out.println("Main ended.");
	}

}
