package com.exceptions;

public class Lab563 {

	public static void main(String[] args) {
		System.out.println("Hello!");
	}
	public void show() {
//		Unhandled exception type CloneNotSupportedException
		Object ob=this.clone();
	}

}
