package com.iopack;
import java.io.*;
public class Lab691 {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("D:\\PRATEEK\\Java Labs\\samp2.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("D:\\PRATEEK\\Java Labs\\sample.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while(true) {
				 String st=br.readLine();
				 if(st==null)
					 break;
				 bw.write(st);
				 bw.newLine();
			}
			bw.close();
			System.out.println("Writing completed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
