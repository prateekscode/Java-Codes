package com.exceptions;

public class Lab573 {
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		System.out.println(t1.m1());
	}
}

class Test3 {
	int m1() {
	int i=100;
	try { 
		i=200; 
		if(i==200) { 
			throw new RuntimeException(); 
		} 
		return i; 
		}
	catch(RuntimeException e) { 
		return i=300; 
		}
	finally { 
		i=400;
		return i;       
	}
}
}