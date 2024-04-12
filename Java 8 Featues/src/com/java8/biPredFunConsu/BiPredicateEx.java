package com.java8.biPredFunConsu;

import java.util.function.BiPredicate;

public class BiPredicateEx {

public static void main(String[] args) {
	BiPredicate<Integer, Integer> biPredicate=(x,y)->x%2==0 && y%2==0;
	System.out.println(biPredicate.test(4, 8));
	
	BiPredicate<String, Integer> biPredicate1=(x,y)->x.length()==y;
	System.out.println(biPredicate1.test("Kanpur", 6));
}
}
