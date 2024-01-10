package com.practice;
import java.util.Scanner;
public class Arryintoseparate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size to store elements:--");
		int as=sc.nextInt();
		int[] ar1=new int[as];
		System.out.println("enter the elements to store:-");
		for(int i=0;i<as;i++) {
			ar1[i]=sc.nextInt();
		}
		int evec=0;
		int oddc=0;
		for(int a:ar1) {
			if(a%2==0) {
				evec++;
			}
			else
				oddc++;
		}
		int[] are=new int[evec];
		int[] aro=new int[oddc];
		int j=0,k=0;
		for(int i=0;i<as;i++) {
			if(ar1[i]%2==0)
				are[j++]=ar1[i];
			else
				aro[k++]=ar1[i];
		}	
		System.out.println("Even array:--");
		printArr(are);
		System.out.println("Odd Array:--");
		printArr(aro);

	}
	static void printArr(int[] a) {
		for(int n:a)
			System.out.println(n);
	}
}