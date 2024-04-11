package com.india.java8;

/*Functional interface must contain only one abstract method 
 and can contain n no. of default and static methods
 -->java.lang.Runnable is an example of functional interface that has
 	single abstract method that is run().
 */

@FunctionalInterface
public interface InterFuntional {
	void a1();
	
	default void m4() {
		System.out.println("default m4--");
	}

	static void m5() {
		System.out.println("static -- m5");
	}
}
