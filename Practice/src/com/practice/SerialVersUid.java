package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialVersUid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3387957298946755456L;
	private int age;
	private String name;
/*	
 	if we add new variable after serialization then DeSerialize it gives exception because JVM associates
 	serialVersionUID with each Serializable class and this ID is use to verify that serialized object and
 	object loaded during DeSerialization does have same attribute and are compatible or not. 
*/
/*	 	 
  	java.io.InvalidClassException: com.practice.SerialVersUid;
	local class incompatible: stream classdesc serialVersionUID = 8707445353248699337,
	local class serialVersionUID = 7779928055315489280
*/
	private char Gender;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static void serializePerson() {
		SerialVersUid person = new SerialVersUid();
		person.setAge(23);
		person.setName("Rahul");

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("SerializePerson.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(person);
			System.out.println("person Serialized");
			objectOutputStream.flush();
			objectOutputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deserializePerson() {

		try {
			FileInputStream fileInputStream = new FileInputStream("SerializePerson.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			SerialVersUid p = (SerialVersUid) inputStream.readObject();
			System.out.println("Object deserialized");
			System.out.println("Age: "+p.getAge());
			System.out.println("Name: "+p.getName());
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		serializePerson();
		deserializePerson();
	}

}
