package com.practice;

import java.util.*;

public class ExcepEx {

    public static void main(String[] args){
        System.out.println("Main started....");
        
        try {
            AA.show();    
        }catch(CustomException ex) {
            ex.printStackTrace();
        }catch(ArithmeticException ex) {
            ex.printStackTrace();
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            System.out.println("Finally.......");
        }
        System.out.println("Main ended....");
    }
}
class AA{
    
    static void show()throws  CustomException{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        int a=sc.nextInt();
        System.out.println("Enter second value:");
        int b=sc.nextInt();
        //try {
            int c=a/b;
            if(c==5) {
                throw new CustomException();
            }
            System.out.println("Result :"+c);
            
        //}catch(Exception ex) {
        //    ex.printStackTrace();
        //}
        
    }
}