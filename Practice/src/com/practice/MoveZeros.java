package com.practice;

import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements to store--");
		int n = sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Now enter numbers...");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		moveZero(ar, n);
		System.out.println("After moving--");
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
	}

	public static void moveZero(int[] arr, int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
	}
}