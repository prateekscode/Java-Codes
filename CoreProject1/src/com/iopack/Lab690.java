package com.iopack;
import java.io.*;
public class Lab690 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\PRATEEK\\Java Labs\\sample.txt");
			FileOutputStream fos=new FileOutputStream("D:\\PRATEEK\\Java Labs\\samp2.txt");
			while(true) {
				int asc=fis.read();
				if(asc==-1)
					break;
				fos.write(asc);
			}
			System.out.println("Written");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
