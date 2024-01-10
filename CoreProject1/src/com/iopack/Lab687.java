package com.iopack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Lab687 {

	public static void main(String[] args) throws Exception {
	try(FileInputStream fis=new FileInputStream("D:\\PRATEEK\\Java Labs\\sample.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);){
		while(true) {
			int asc=bis.read();
			if(asc==-1)
				break;
			char ch=(char)asc;
			System.out.println(ch);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
