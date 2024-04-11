package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		for (Integer i : num) {
			if (isEven.test(i))
				System.out.println(i);
		}
		
		Predicate<String> startswithP = x -> x.toLowerCase().charAt(0) == 'p';
		System.out.println(startswithP.test("Prateek"));

		Predicate<String> endswithK=x-> x.toLowerCase().charAt(x.length()-1)=='k';
		System.out.println(endswithK.test("Prateek"));
		
		Predicate<String> and= startswithP.and(endswithK);
		System.out.println(and.test("Prateek"));
		
		Predicate<String> or= startswithP.or(endswithK);
		System.out.println(or.test("Prateeks"));
		
		System.out.println(startswithP.negate().test("Kartik"));
	
		Predicate<Object> predicate=Predicate.isEqual("Rohan");
		System.out.println(predicate.test("Rohan"));
	}

}
