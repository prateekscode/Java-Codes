package com.java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex1 {

	public static void main(String[] args) {
		// imperative approach
		int ar[]= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				sum=sum+ar[i];
			}
		}
		//declarative approach using stream
		int[] arr= {1,2,3,4,5,6,7,8};
		IntStream sum2=Arrays.stream(arr).filter(n->n%2==0);
	}

}
