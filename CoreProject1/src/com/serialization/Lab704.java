package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lab704 {

	public static void main(String[] args) throws IOException {
		//File f=new File("F:\\info.txt");
		FileOutputStream fos=new FileOutputStream("D:\\info.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Student st=new Student(101,"NIDHI", 98765432L);
		Student st1=new Student(201,"SHIKHA", 987765543L);
		Student.count=9;
		System.out.println(st);
		oos.writeObject(st);
		oos.writeObject(st1);
		System.out.println("Object serialized....");

	}
}

