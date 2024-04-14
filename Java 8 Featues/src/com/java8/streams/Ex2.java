package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		Stream<String> myStream = list.stream();

		String[] ar = { "Hey", "Hello", "bye" };
		Stream<String> stream = Arrays.stream(ar);

		Stream<Integer> of = Stream.of(1, 2, 3);

		Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
		
		Stream<Integer> limit2 = Stream.generate(()->(int)Math.random()*100).limit(5);
	}
}
