package com.iopack;
import java.io.*;
public class Lab689 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\PRATEEK\\Java Labs\\sample.txt");
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			while(true) {
				String id=br.readLine();
				if(id==null)
					break;
				System.out.println(id);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
