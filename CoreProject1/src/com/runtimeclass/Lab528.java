package com.runtimeclass;

public class Lab528 {

	public static void main(String[] args) throws Exception{
		
		if(args.length==1) {
			Runtime rt=Runtime.getRuntime();
			String app=args[0]+".exe";
			Process p=rt.exec(app);
		}
		else {
			System.out.println("Specify the app name.");
		}
		Runtime rt=Runtime.getRuntime();
		Process p1=rt.exec("notepad.exe");
		Process p2=rt.exec("calc.exe");
	}

}