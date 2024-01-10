package com.utilpack;
import java.util.*;
public class Lab679 {

	public static void main(String[] args) {
		
		int myarr[]= {30,20,50,10,40};
		int myarr1[]= {20,25,35,50,40};
		int myarr2[]= {30,20,50,10,40};
		
		boolean b1=Arrays.equals(myarr, myarr1);
		System.out.println(b1);
		
		boolean b2=Arrays.equals(myarr,myarr2);
		System.out.println(b2);
		
		boolean b3=Arrays.equals(myarr1, myarr2);
		System.out.println(b3);
		
		for(int x:myarr1)
			System.out.println(x+" ");
		
		System.out.println();
		
		Arrays.fill(myarr1, 55);
		for(int x:myarr1)
			System.out.println(x+" ");
		
		System.out.println();
		
	}

}
