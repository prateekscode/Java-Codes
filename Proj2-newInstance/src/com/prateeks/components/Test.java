package com.prateeks.components;

public class Test {
	static {
		System.out.println("Class is loaded [static block]");
	}
	public Test() {
		System.out.println("constructor called. [constructor]");
	}
	@Override
	public String toString() {
		return "toString called [Test class]";
	}
}
