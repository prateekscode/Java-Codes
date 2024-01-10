package com.iopack;
import java.io.IOException;
public class Lab685 {

	public static void main(String[] args) throws Exception {
		AbcReader ab=new AbcReader();
		System.out.println("Enter sid");
		String sid=ab.readLine();
		System.out.println("Enter name");
		String name=ab.readLine();
		System.out.println("Enter phone");
		String phn=ab.readLine();
		System.out.println("Enter fees");
		String fee=ab.readLine();
		System.out.println(sid+" "+name+" "+phn+" "+fee);
		
	}

}
class AbcReader{
	public String readLine() throws IOException{
		StringBuffer val=new StringBuffer();
		while(true) {
			int asc=System.in.read();
			if(asc==13);
			else if(asc==10)
				break;
			else {
				char ch=(char)asc;
				val.append(ch);
			}
		}
		return val.toString();
	}
}