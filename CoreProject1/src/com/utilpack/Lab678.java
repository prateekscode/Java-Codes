package com.utilpack;
import java.util.*;
public class Lab678 {

	public static void main(String[] args) {
		int arr[]= {30,20,50,70,10};
		
		for(int x:arr) 
			System.out.println(x+" ");
			System.out.println();
			
			Arrays.sort(arr);
			
			for(int x:arr)
				System.out.println(x+" ");
			
			System.out.println();
			
			int idx=Arrays.binarySearch(arr, 50);
			System.out.println(idx);
			
			idx=Arrays.binarySearch(arr, 99);
			System.out.println(idx);
	}

}
