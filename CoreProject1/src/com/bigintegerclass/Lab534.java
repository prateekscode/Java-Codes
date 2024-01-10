package com.bigintegerclass;

import java.math.BigInteger;

public class Lab534 {

	public static void main(String[] args) {
		BigInteger bint1=new BigInteger("4");
		System.out.println(bint1.bitCount());
		
		System.out.println(bint1.bitLength());
		
		long val=923372036854775807L;
		long val2=100;
		long res=val+val2;
		System.out.println(res);
	}

}
