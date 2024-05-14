package com.designpattern.creational.singleton;

public class SingletonEager {
	//Eager way of creating singleton object
	private static SingletonEager singletonEager = new SingletonEager();
	
	public static SingletonEager getSingletonEager() {
		return singletonEager;
	}
}

/*
 * In this approach object is always created at the time of class loading(if we have requirement or not)
 * this is not good way in terms of usage and performance. 
 */