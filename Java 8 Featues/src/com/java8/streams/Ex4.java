package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {
		List<Integer> collect = Stream.iterate(0, x -> x + 1)
				.limit(101)
				.skip(1)
				.filter(x -> x % 2 == 0)
				.map(x->x/10)
				.distinct()
				.sorted()
				.peek(x->System.out.println(x))
				.collect(Collectors.toList());
		System.out.println(collect);

		//max, min, count, collect are called terminal operations we write these in last.
		System.out.println("----------------------------------");
		Integer integer = Stream.iterate(0, x -> x + 1)
		.limit(101)
		.map(x->x/20)
		.distinct()
		.peek(System.out::println)
		.max((a,b)->a-b)
		.get()	;
		System.out.println(integer);
		
		System.out.println("-----------------------------------");
		long count = Stream.iterate(0, x -> x + 1)
		.limit(101)
		.map(x->x/20)
		.distinct()
		.count();
		System.out.println(count);
	}

}
