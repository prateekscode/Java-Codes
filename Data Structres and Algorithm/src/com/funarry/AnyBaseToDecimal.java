package com.funarry;
import java.util.Scanner;
public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number & base--");
		int n=sc.nextInt();
		int b=sc.nextInt();
		int con=getvalue(n,b);
		System.out.println("After conversion: "+con);
	}
	public static int getvalue(int n,int b) {
		int v=0;
		int p=1;
		while(n>0) {
			int dig=n%10;
			n=n/10;
			
			v=v+dig*p;
			p=p*b;
			
		}
		
		return v;
	}

}
