package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 5, 3, 4, 2, 9, 10, 1, 0, 2, 4, 6, 8);
		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredList);

		List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(mappedList);

		/*
		 * used distinct to removed similar values and sorted to sort values and limit
		 * to limit the values from starting and skip to skip the values from starting.
		 */
		List<Integer> filteredListInSameLine = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct()
				.sorted((a, b) -> b - a).limit(5).skip(2).collect(Collectors.toList());
		System.out.println(filteredListInSameLine);
	}
}
