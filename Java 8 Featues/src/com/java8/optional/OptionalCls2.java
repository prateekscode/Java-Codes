package com.java8.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalCls2 {
	public static void main(String[] args) {
		Optional<String> nme = getName(2);
//		String nameToBeUsed2 = nme.orElseThrow(() -> new NoSuchElementException());
		String nameToBeUsed3 = nme.orElseThrow(NoSuchElementException::new);

//		System.out.println(nameToBeUsed2);
		System.out.println(nameToBeUsed3);
	}

	private static Optional<String> getName(int i) {
		String name = "Zen";
		return Optional.empty();
	}
}
