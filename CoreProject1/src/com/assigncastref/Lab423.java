package com.assigncastref;

public class Lab423 {
public static void main(String[] args) {
	D dobj=new D();
	A aboj=dobj;
	B bobj=(B)aboj;
//	aobj cannot be resolved to a variable
//	D dobj1=(D)aobj;
	System.out.println("Hello");
}
}
