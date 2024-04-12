package com.java8.biPredFunConsu;

import java.util.function.BiFunction;

public class BiFunctionEx {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();
		System.out.println(biFunction.apply("India", "JAPAN"));
	}
}
