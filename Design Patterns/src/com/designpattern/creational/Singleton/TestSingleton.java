package com.designpattern.creational.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {
	public static void main(String[] args) throws Exception {
		
		SingletonLazy singleton = SingletonLazy.getSingleton();
		System.out.println(singleton.hashCode());
//		
//		SingletonLazy singleton2 = SingletonLazy.getSingleton();
//		System.out.println(singleton2.hashCode());
//		
//		System.out.println(SingletonEager.getSingletonEager().hashCode());
//		System.out.println(SingletonEager.getSingletonEager().hashCode());
//	
//		## Breaking singleton
//		//using Reflection API 
//		Constructor<SingletonLazy> declaredConstructor = SingletonLazy.class.getDeclaredConstructor();
//		declaredConstructor.setAccessible(true);
//		SingletonLazy singleton3 = declaredConstructor.newInstance();
//		System.out.println(singleton3.hashCode());
//		
		//using Deserialization
//		SingletonLazy singleton4 = SingletonLazy.getSingleton();
//		System.out.println(singleton4.hashCode());
//		FileOutputStream fos=new FileOutputStream("abc.ob");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(singleton4);
//		System.out.println("Serialized");
//		
////		FileInputStream fis=new FileInputStream("abc.ob");
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//		SingletonLazy sl=(SingletonLazy) ois.readObject();
//		System.out.println("DeSerialized");
//		
//		System.out.println(sl.hashCode());
		
		//using clone
		SingletonLazy singleton5=(SingletonLazy)singleton.clone();
		System.out.println(singleton5.hashCode());
	}
}


/*
 * ## Ways to break singleton design pattern
 * 
 * 1.Reflection API to break singleton pattern.
 * solution: --if object is there throw exception from inside constructor
 * 			 --use enum [ public enum SingletonLazy{ INSTANCE } (we can define any static or normal method inside this enum)
 *
 * 2.Using Deserialization
 * solution: --implementing readResolve() method
 * 
 * 3.Cloning
 * solution: --return same singleton object instead of super in overridden clone method in singleton class.
 * 
 */