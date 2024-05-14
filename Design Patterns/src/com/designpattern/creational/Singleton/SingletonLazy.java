package com.designpattern.creational.Singleton;

import java.io.Serializable;

public class SingletonLazy implements Serializable, Cloneable{
	private static SingletonLazy singleton;

	private SingletonLazy() {
		if(singleton!=null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}
	}

	// Lazy way of creating singleton object [that object created only when we
	// called getSingleton() method].
//	public static SingletonLazy getSingleton() {
//		if (singleton == null) {
//			singleton = new SingletonLazy();
//		}
//		return singleton;
//	}

	/*
	 * for thread safety by using synchronized if we use at method level then it
	 * will synchronize the whole method if there is any other code which is not
	 * related to object creation for that also thread cannot enter and perform
	 * other task.
	 */
//	public synchronized static SingletonLazy getSingleton() {
//		if (singleton == null) {
//			singleton = new SingletonLazy();
//		}
//		return singleton;
//	}

	// using synchronized block
	public static SingletonLazy getSingleton() {
		if (singleton == null) {
			synchronized (SingletonLazy.class) {
				singleton = new SingletonLazy();
			}
		}
		return singleton;
	}
	
	public Object readResolve() {
		return singleton;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}	
/*
 * It is not thread safe if multiple thread comes concurrently (at same time)
 * every thread gets null value in the if condition then, it will allow to
 * create multiple objects.
 */
