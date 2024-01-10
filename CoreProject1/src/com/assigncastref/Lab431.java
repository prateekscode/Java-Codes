package com.assigncastref;

interface Inter14{}
class F implements Inter14{}
class G extends A{}
class H extends A{}
public class Lab431 {

	public static void main(String[] args) {
		Inter14 arr[]=new Inter14[3];
		arr[0]=new F();
//		Type mismatch: cannot convert from G to Inter14
//		arr[1]=new G();
//		Type mismatch: cannot convert from H to Inter14
//		arr[2]=new H();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
