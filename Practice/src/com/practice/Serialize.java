package com.practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			Stu s = new Stu(101, "rohan", 54678);
			Stu.count = 9;
			System.out.println(s);
			oos.writeObject(s);
			System.out.println("object serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Stu implements Serializable {
	int sid;
	String name;
	long phone;
	static int count = 3;

	public Stu(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", name=" + name + ", phone=" + phone + "]";
	}

}
