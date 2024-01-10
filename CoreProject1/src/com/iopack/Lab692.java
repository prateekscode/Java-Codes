package com.iopack;
import java.io.*;
public class Lab692 {

	public static void main(String[] args) {
		try (
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			FileWriter fw=new FileWriter("D:\\PRATEEK\\Java Labs\\samp3.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);){
			char ch='Y';
			do {
				System.out.println("Enter id");
				String id=br.readLine();
				System.out.println("Enter name");
				String nm=br.readLine();
				String info=id+" "+nm;
				bw.write(info);
				bw.newLine();
				System.out.println("Do you want to add mor[y/n]");
				ch=(char)br.readLine().charAt(0);
			}
			while(ch=='y');
			bw.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
