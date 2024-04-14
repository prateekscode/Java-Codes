package com.java8.optional;

import java.util.Optional;

public class OptionalCls3 {
	public static void main(String[] args) {
		Optional<String> optional = getName(2);
		Optional<String> optional1 = optional.map(x -> x.toUpperCase());
		optional1.ifPresent(System.out::println);
	}

	private static Optional<String> getName(int i) {
		return Optional.of("jim");
	}
}
