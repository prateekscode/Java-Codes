package com.funarry;
import java.util.Scanner;
public class AnyBasetoAnyBase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no and base then destinattion base:--");
		int n=sc.nextInt();
		int fb=sc.nextInt();
		int tb=sc.nextInt();
		int ans=getvalue(n,fb,tb);
		System.out.println("After conversion: "+ans);
	}
	public static int getvalue(int n,int fb,int tb) {
		int dec=anybaseTodecimal(n,fb);
		int dn=decimalToanybase(dec,tb);
		return dn;
	}
	public static int decimalToanybase(int n, int b) {
		int v = 0;
		int p = 1;

		while (n > 0) {
			int dig = n % b;
			n = n / b;

			v = v + dig * p;
			p = p * 10;
		}
		return v;
	}
	public static int anybaseTodecimal(int n,int fb) {
		int v=0;
		int p=1;
		while(n>0) {
			int dig=n%10;
			n=n/10;
			
			v=v+dig*p;
			p=p*fb;
		}
		return v;
		
	}
}
