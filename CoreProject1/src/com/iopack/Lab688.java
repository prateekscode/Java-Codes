package com.iopack;
import java.io.*;
public class Lab688 {

	public static void main(String[] args) {
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter id");
			String id=br.readLine();
			System.out.println("enter name");
			String nm=br.readLine();
			System.out.println(id+" "+nm);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
