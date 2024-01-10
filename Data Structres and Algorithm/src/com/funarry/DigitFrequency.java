package com.funarry;
import java.util.Scanner;
public class DigitFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. and digit");
		int n=sc.nextInt();
		int d=sc.nextInt();
		int f=freq(n,d);
		System.out.println("The occurence of digit "+d+" is: "+f);
	}
	
	public static int freq(int n,int d) {
		int count=0;
		while(n>0) {
			int dig=n%10;
			n=n/10;
			if(dig==d)
				count++;
		}
		return count;
	}
}
