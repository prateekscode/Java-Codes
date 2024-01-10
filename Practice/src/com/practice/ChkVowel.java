package com.practice;
import java.util.Scanner;
public class ChkVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String---");
		String s=sc.nextLine();
		boolean n=Vowel(s);
		System.out.println(n);
	}

	public static boolean Vowel(String s) {
		String str=".*[aeiou].*";
		if(s.matches(str)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
