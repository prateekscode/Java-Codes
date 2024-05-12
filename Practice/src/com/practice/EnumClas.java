package com.practice;

enum Status {
	Running, Failed, Pending, Success;
}

public class EnumClas {
	public static void main(String[] args) {
		Status st = Status.Failed;
		System.out.println(st);
		System.out.println(st.ordinal());

		Status st1 = Status.Success;
		System.out.println(st1);
		System.out.println(st1.ordinal());
		System.out.println("________________");

		Status[] st2 = Status.values();
		for (Status s : st2)
			System.out.println(s + " : " + s.ordinal());
	}
}
