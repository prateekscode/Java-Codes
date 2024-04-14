package com.java8.optional;

import java.util.Optional;

public class OptionalCls {
	public static void main(String[] args) {
		Optional<String> Name = getName(1);
		if(Name.isPresent()) {
			System.out.println(Name.get());
		}
		
		Name.ifPresent(System.out::println);
	}

	private static Optional<String> getName(int i) {
		String name = "Zen";
		//we can also write Optional.empty
		return Optional.ofNullable(name);
	}
}
