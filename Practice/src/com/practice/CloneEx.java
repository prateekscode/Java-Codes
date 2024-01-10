package com.practice;

public class CloneEx {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mm m1=new Mm(10,20);
        SS h1=new SS(101,"RAJ",m1);
        System.out.println(h1.id);
        System.out.println(h1.name);
        System.out.println(h1.m.a);
        System.out.println(h1.m.b);
        
        SS h2=(SS)(h1.clone());
        System.out.println("*****Cloned Object******");
        System.out.println(h2.id);
        System.out.println(h2.name);
        System.out.println(h2.m.a);
        System.out.println(h2.m.b);
        
        h1.id=201;
        h1.name="KUMAR";
        System.out.println(h2.id+"\t"+h2.name);
        System.out.println("&&&&&&&&&&&&&&&&&&&");
        
        h1.m.a=30;
        h1.m.b=40;
        
        System.out.println(h2.m.a+"\t"+h2.m.b);
        System.out.println(h2.id+"\t"+h2.name);
        System.out.println("*******************");
        System.out.println(h1.id+"\t"+h1.name+"\t"+h1.m.a+"\t"+h1.m.b);

        h2.id=401;
        h2.name="SHIKHA";
        h2.m.a=60;
        h2.m.b=70;
        System.out.println(h1.id+"\t"+h1.name+"\t"+h1.m.a+"\t"+h1.m.b);

    }

}
class HH implements Cloneable{
    int id;
    String name;
    Mm m;
    
    HH(int id,String name, Mm m){
        this.id=id;
        this.name=name;
        this.m=m;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        HH h=new HH(this.id,this.name,this.m);
        
        return h;
    }
}

class SS implements Cloneable{
    int id;
    String name;
    Mm m;
    
    SS(int id,String name, Mm m){
        this.id=id;
        this.name=name;
        this.m=m;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mm m1=new Mm(this.m.a,this.m.b);
        
        SS h=new SS(this.id,this.name,m1);
        
        return h;
        
    }
}