package com.java8.supplier;

import java.util.function.Supplier;

public class Ex {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 2;
		System.out.println(supplier.get());
	}
}
