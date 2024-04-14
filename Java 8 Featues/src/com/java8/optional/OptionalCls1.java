package com.java8.optional;

import java.util.Optional;

public class OptionalCls1 {
	public static void main(String[] args) {
		Optional<String> nme = getName(2);
		String nameToBeUsed = nme.orElse("N/A");
		String nameToBeUsed1 = nme.orElseGet(() -> "NotApplicable");

		System.out.println(nameToBeUsed);
		System.out.println(nameToBeUsed1);
	}

	private static Optional<String> getName(int i) {
		String name = "Zen";
		return Optional.empty();
	}
}