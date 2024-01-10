package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab648a {

    public static void main(String[] args) {
        
        
        List list=new ArrayList();
        list.add("RAJ");
        list.add("PATEL");
        list.add("KUMAR");
        list.add("ABC");
        
        for(Object s: list) {
            System.out.println(s);
        }
        Iterator it=list.iterator();
        while(it.hasNext()) {
            Object s=it.next();
            System.out.println(s);
        }
        
        System.out.println("*******************");
        List<String> list1=new ArrayList<String>();
        list1.add("RAJ");
        list1.add("PATEL");
        list1.add("KUMAR");
        list1.add("ABC");
        
        for(String s: list1) {
            System.out.println(s);
        }
        Iterator<String> it1=list1.iterator();
        while(it1.hasNext()) {
            String s=it1.next();
            System.out.println(s);
        }

    }

}