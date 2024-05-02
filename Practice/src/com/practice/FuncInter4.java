package com.practice;

public class FuncInter4 {
	public static void main(String[] args) {
		J j=s->s.length();
		j.getLength("JAjmau");
	}
}
interface J{
	int getLength(String s);
}