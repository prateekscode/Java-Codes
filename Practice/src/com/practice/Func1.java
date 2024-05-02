package com.practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Func1 {
	public static void main(String[] args) {
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("QWERTY"));
		
		Function<Integer, Integer> f1=a->a*a;
		System.out.println(f1.apply(2));
		
		Function<String, String> f2=s->s.toUpperCase();
		System.out.println(f2.apply("asdfgh"));
		
		Function<Integer, Boolean> f3=n->n%2==0;
		System.out.println(f3.apply(8));
		
		Consumer<String> con=c->System.out.println(c);
		con.accept("HEEEEE");
	
		Supplier<Double> supplier=()->Math.random();
		System.out.println(supplier.get());
	}
}
