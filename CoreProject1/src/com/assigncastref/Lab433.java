package com.assigncastref;

interface Inter16{}
	class L implements Inter16{}
	class M extends L{}
	class N extends L{}
public class Lab433 {

	public static void main(String[] args) {
		Inter16 ar[]=new M[3];
		ar[0]=new M();
		ar[1]=new M();
//		 java.lang.ArrayStoreException
//		ar[2]=new N();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
