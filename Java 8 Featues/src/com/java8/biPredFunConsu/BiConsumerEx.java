package com.java8.biPredFunConsu;

import java.util.function.BiConsumer;

public class BiConsumerEx {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
		biConsumer.accept(5, 4);
	}

}
