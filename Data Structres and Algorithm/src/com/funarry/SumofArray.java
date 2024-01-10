package com.funarry;
import java.util.*;
public class SumofArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements to store");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Entered elements--");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		arrsum(arr);
	}
	public static void arrsum(int ar[]) {
		int sum=0;
		for(int a:ar) {
			sum=sum+a;
		}
		System.out.println("Sum of given array elements="+sum);;
	}

}
