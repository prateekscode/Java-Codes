package com.cloning;

class A{
	int x;
	A(int x){
		this.x=x;
	}
}
class B{
	int y;
	A ao;
	B(int y,A ao){
		this.y=y;
		this.ao=ao;
	}
}
class CA implements Cloneable{
	int z;
	B b;
	CA(int z,B b){
		this.z=z;
		this.b=b;
	}
	void show() {
		System.out.println(this.z);
		System.out.println(this.b.y);
		System.out.println(this.b.ao.x);
	}
	public Object clone() throws
	CloneNotSupportedException{
		System.out.println("C Clone()");
		Object obj=super.clone();
		return obj;
	}
}
public class Lab453 {

	public static void main(String[] args) {
		A ao1=new A(10);
		B b1=new B(20,ao1);
		CA c1=new CA(58,b1);
		try {
			CA c2=(CA)c1.clone();
			System.out.println(c1==c2);
			System.out.println(c1.b==c2.b);
			System.out.println(c1.b.ao==c2.b.ao);
		}
		catch(Exception e) {
			System.out.println("MyError:"+e);
		}
	}

}
