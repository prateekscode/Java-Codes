package com.utilpack;
import java.util.*;
public class Lab685 {

	public static void main(String[] args) {
		String str1="Hello everyone! How are you?";
		Scanner sc=new Scanner(str1);
		
		while(sc.hasNext()) {
			String st=sc.next();
			System.out.println(st);
		}
		sc.close();
		
		System.out.println("------------");
		String str2="Hey! whats up?";
		Scanner sc2=new Scanner(str2);
		sc2.useDelimiter("\\.");
		while(sc2.hasNext()) {
			String st2=sc2.next();
			System.out.println(st2);
		}
		sc2.close();
	}

}
