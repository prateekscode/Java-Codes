package com.oops;

public class Lab234 {

	public static void main(String[] args) {
		Stud s1=new Stud();
		 System.out.println(s1.sid+"\t"+s1.age+"\t"+s1.name+"\t"+s1.cName);
		 s1.sid=101;
		 s1.age=32;
		 s1.name="RAJ";
		 System.out.println(s1.sid+"\t"+s1.age+"\t"+s1.name+"\t"+s1.cName);
		 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 Stud s2=new Stud();
		 s2.sid=201;
		 s2.age=33;
		 s2.name="RAJNISH";
		 System.out.println(s2.sid+"\t"+s2.age+"\t"+s2.name+"\t"+s2.cName);
		 s2.cName="DU";
		 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		 System.out.println(s1.sid+"\t"+s1.age+"\t"+s1.name+"\t"+s1.cName);
		 System.out.println(s2.sid+"\t"+s2.age+"\t"+s2.name+"\t"+s2.cName);
		 System.out.println(Stud.cName);
		 }

}

class Stud{
		int sid;
		 int age;
		 String name;
		 static String cName="BHU";
		}
