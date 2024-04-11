package com.java8.Function;

import java.util.function.Function;

public class Ex2 {

	public static void main(String[] args) {
		Function<String	, String> func1=s->s.toUpperCase();
		Function<String	, String> func2=s->s.substring(0,3);
		
		Function<String	, String> stringStringFunction=func1.andThen(func2);
		System.out.println(stringStringFunction.apply("pawan"));
		
		System.out.println(func1.andThen(func2).apply("rajat"));
		
		Function<Integer, Integer> func3=x->x*2;
		Function<Integer, Integer> func4=x->x*x*x;
		
		System.out.println(func3.andThen(func4).apply(3));
		System.out.println(func4.andThen(func3).apply(3));
		
		//it will reverse solving in this case func4 solved 1st then func3.
		System.out.println(func3.compose(func4).apply(3));
		
		//this will return the same thing as it is we give.
		Function<String,String> identityFunc=Function.identity();
		System.out.println(identityFunc.apply("Sajal"));
	}

}
