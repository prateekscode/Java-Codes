package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4);
		//always use parallelStream for large list for faster operations if used for small list it becomes slower.
		list.parallelStream();
	}
}
