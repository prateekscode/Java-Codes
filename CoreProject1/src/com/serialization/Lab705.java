package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab705 {

	public static void main(String[] args) {
		
		try {
		FileInputStream fis=new FileInputStream("D:\\info.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Student s=(Student)ois.readObject();
		Student s1=(Student)ois.readObject();
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("Object desrialized...");
		
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
