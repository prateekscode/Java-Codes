package com.funarry;
import java.util.Scanner;

public class Reversearr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements to store");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Entered elements--");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		revarr(arr);
	}
	public static void revarr(int ar[]) {
		System.out.println("Reversed elements--");
		for(int i=ar.length-1;i>=0;i--)
			System.out.println(ar[i]);
	}
}
