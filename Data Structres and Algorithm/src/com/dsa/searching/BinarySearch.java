package com.dsa.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 6, 7, 8, 9 };
		int target = 7;

		int result = linearsearch(nums, target);

		if (result == -1)
			System.out.println("Element not found..");
		else
			System.out.println("Value found at index: " + result);
	}

	public static int linearsearch(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
		}
		return -1;
	}

}