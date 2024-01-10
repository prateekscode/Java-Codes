package com.stringclass;

class Lab490 {
	public static void main(String as[]) {
		String exp1 = "[A-Za-z]*";

		System.out.println("RI".matches(exp1));
		System.out.println("Hi".matches(exp1));
		System.out.println("INA".matches(exp1));
		System.out.println("INa".matches(exp1));
		System.out.println("pqr".matches(exp1));
		System.out.println("kl344".matches(exp1));
		
		System.out.println("****************");
		
		String exp2 = "[A-Za-z0-9]*";

		System.out.println("MNO".matches(exp2));
		System.out.println("ghi".matches(exp2));
		System.out.println("543".matches(exp2));
		System.out.println("ISROin".matches(exp2));
		System.out.println("PQR87".matches(exp2));
		System.out.println("pqr666".matches(exp2));
		System.out.println("klm 88".matches(exp2));
	}
}