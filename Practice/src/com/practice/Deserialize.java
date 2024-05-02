package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialize {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("D:\\info.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Object obj=ois.readObject();
			System.out.println(obj);
			System.out.println("object Deserialized");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/*
 * class Stu implements Serializable { int sid; String name; long phone; static
 * int count = 3;
 * 
 * public Stu(int sid, String name, long phone) { this.sid = sid; this.name =
 * name; this.phone = phone; }
 * 
 * @Override public String toString() { return "Stu [sid=" + sid + ", name=" +
 * name + ", phone=" + phone + "]"; }
 * 
 * }
 */