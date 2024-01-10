package com.exceptions;

public class Lab543 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			int a=10/0;
			System.out.println("Result:"+a);
//			No exception of type String can be thrown; an exception type must be a subclass of Throwable
		}catch(String ex) {
			System.out.println("Number must divide by non zero.");
		}
		System.out.println("Main ended.");
	}

}
