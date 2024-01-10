package com.oops;

public class Lab245 {

	public static void main(String[] args) {
		Hello3 ref=new Hello3();
        System.out.println(Hello3.b);
        //System.out.println(Hello3.a);
        
        System.out.println(ref.a);
        System.out.println(ref.d);
        System.out.println(new Hello3().a);
        System.out.println(new Hello3().d);
        
        new Hello3();
        System.out.println(Hello3.b);
        System.out.println(Hello3.c);
        
        System.out.println("***************");
        int e=90;
        System.out.println(e);
        System.out.println(e);
        System.out.println(e);
        

    }

}
class Hello3{
    int d=40;
    int a=10;
    static int b=20;
    static int c=30;
    
    {
        System.out.println("Instance Initialization Block..");
        System.out.println("IIB.....");
    }
    
    static{
        System.out.println("Static Initialization Block..");
        System.out.println("SIB.............");
    }
    
}