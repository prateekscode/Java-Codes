package com.cloning;

class A5{
	int x;
	A5(int x){
		this.x=x;
	}
}
class B5{
	int y;
	A5 am;
	B5(int y,A5 am){
		this.y=y;
		this.am=am;
	}
}
class C5 implements Cloneable{
	int z;
	B5 b1;
	C5(int z,B5 b1){
		this.z=z;
		this.b1=b1;
	}
	void show() {
		System.out.println(this.z);
		System.out.println(this.b1.y);
		System.out.println(this.b1.am.x);
	}
	public Object clone() throws
	CloneNotSupportedException{
		System.out.println("Hello-clone()");
		if(this instanceof Cloneable) {
			A5 am1=new A5(this.b1.am.x);
			B5 b1=new B5(this.b1.y,am1);
			C5 c=new C5(this.z,b1);
			return c;
		}
		else {
			throw new 
			CloneNotSupportedException(getClass().getName());
		}
	}
}
public class Lab454 {

	public static void main(String[] args) {
		A5 am1=new A5(10);
		B5 b2=new B5(20,am1);
		C5 c2=new C5(30,b2);
		
		try {
			C5 c3=(C5)c2.clone();
			System.out.println(c2==c3);
			System.out.println(c2.b1==c3.b1);
			System.out.println(c2.b1.am==c3.b1.am);
		}
		catch(Exception e) {
			System.out.println("My Error:"+e);
		}
	}

}
	