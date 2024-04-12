package com.unary.binaryoper;

import java.util.function.UnaryOperator;

public class ExUnary {
	public static void main(String[] args) {
		/*
		 * It is a special case of function where if there is a same data type in input
		 * and output so we have write type only once.
		 */
		UnaryOperator<Integer> unaryOperator = x -> x * x;
		System.out.println(unaryOperator.apply(5));

		UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
		UnaryOperator<String> unaryOperator2 = str -> str.toUpperCase();

		System.out.println(unaryOperator1.apply("HellO"));
		System.out.println(unaryOperator2.apply("Hey"));

	}
}
