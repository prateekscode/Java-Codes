package com.java8.india;

public interface Inter1 {
	
	void m1();
	void m2();
	
	default void m3() {
		System.out.println("default m3--");
	}
    default void m4() {
		System.out.println("default m4--");
	}
    
    static void m5() {
    	System.out.println("static -- m5");
    }
    static void m6() {
    	System.out.println("static -- m6");
    }

}
