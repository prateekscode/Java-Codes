package com.assigncastref;

interface  Inter15{}
class I implements Inter15{}
class J extends I{}
class K extends I{}

public class Lab432 {

	public static void main(String[] args) {
		Inter15 arr[]=null;
//		java.lang.ArrayStoreException
//		arr=new J[3];
		arr[0]=new I();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
