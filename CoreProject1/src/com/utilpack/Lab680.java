package com.utilpack;

import java.util.*;

public class Lab680 {

	public static void main(String[] args) {
		
		String myarr[]= {"hello","ok","Hii","see u","Hii","Evening"};
		
		List<String> mlist1=Arrays.asList(myarr);
		System.out.println(mlist1);
		
		String copiedArr[]=Arrays.copyOf(myarr, 5);
		
		List<String> mlist2=Arrays.asList(copiedArr);
		System.out.println(mlist2);
		
		int arr1[]= {10,20,30,40,50};
		System.out.println(arr1);
		
		String mystr=Arrays.toString(arr1);
		System.out.println(mystr);
		
		int arr2[][]= {{11,33,44},{44,33,66},{99,77,33}};
		System.out.println(arr2);

	}

}
