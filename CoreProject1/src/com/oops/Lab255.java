package com.oops;

public class Lab255 {
	public static void main(String[] args) {
        Hello4 ref=new Hello4();
        System.out.println("******************");
        System.out.println(ref.a);
        System.out.println(ref.b);
        //System.out.println(ref.c);
        //System.out.println(ref.d);

    }

}
class Hello4{
    
    int a=15;
    static int b=30;
    
    {
        System.out.println("IIB started...");
        int c=40; //Local variable
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println("IIB ended....");
    }
    static {
        System.out.println("SIB started...");
        int d=60; // Local variable
        System.out.println(d);
        //System.out.println(a);
        
        System.out.println(b);
        System.out.println("SIB ended...");
    }
    
    
    
}

