package com.india.spring;

public class Hai {
	static {
		System.out.println("HAi-static");
	}

	public Hai() {
		System.out.println("hai Default const");
	}

	@Override
	public String toString() {
		return "Hai Everyone!";
	}
	
	
}
