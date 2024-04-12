package com.unary.binaryoper;

import java.util.function.BinaryOperator;

public class ExBinary {
	public static void main(String[] args) {
		BinaryOperator<String> binaryOperator = (x, y) -> x + y;
		System.out.println(binaryOperator.apply("Hey", "Google"));
	}
}
