package com.funarry;
import java.util.*;
public class ses11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element want to store?");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		display(arr);
	}
	
public static void display(int arr[]) {
	System.out.println("Entered elements");
	for(int a:arr)
		System.out.println(a);
	}	
}