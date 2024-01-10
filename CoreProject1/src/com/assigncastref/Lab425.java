
package com.assigncastref;

public class Lab425 {
	public static void main(String[] args) {
	A aobj=new D();
	if(aobj instanceof C) {
		C obj=(C)aobj;
	}
	System.out.println("Hey!");
	}
}

