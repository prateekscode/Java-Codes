package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Sam");
		Consumer<List<Integer>> listConsumer1 = li -> {
			for (Integer i : li) {
				System.out.println(i + 100);
			}
		};
		Consumer<List<Integer>> listConsumer2 = li -> {
			for (Integer i : li) {
				System.out.println(i);
			}
		};
		Consumer<List<Integer>> listConsumer=listConsumer2.andThen(listConsumer1);
		listConsumer.accept(Arrays.asList(1, 2, 3, 4));
	}

}
