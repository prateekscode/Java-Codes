package com.practice;

public class Abstra {
	    public static void main(String[] args) {
	    	
	    VV ref=new YY(10,20);
	    ref.show();
	    VV.m1();
	    ref.m2();
	    ref.m3();
	    //ref.m4();
	    System.out.println(ref.a+"\t"+ref.name);

	    }

	}
	//abstract class & Interface 

	abstract class VV{ 
	    int a;
	    static String name="RAJ";
	    
	    VV(int a){
	        
	        this.a=a;
	    }
	    
	    void show() {
	        System.out.println("show()---VV");
	    }
	    static void m1() {
	        System.out.println("m1()---VV");
	    }
	    
	    abstract void m2();
	    abstract void m3();
	    
	}
	 class YY extends VV{
	    int b;
	    
	    YY(int a, int b){
	        super(a);
	        this.b=b;
	    }
	    void m4() {
	        System.out.println("m4()-----YY");
	    }
	    
	    void show() {
	        System.out.println("show()---YY");
	    }
	    
	    void m2() {
	        System.out.println("m2()-----VV");
	    }

	    
	    void m3() {
	        
	        System.out.println("m3()-----VV");
	    }
	}