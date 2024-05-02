package com.practice;

public class FuncInter3 {
	public static void main(String[] args) {
		C n=(a,b)->System.out.println(a+b);;
		n.add(5, 6);
	}
}
interface C{
	void add(int a, int b);
}