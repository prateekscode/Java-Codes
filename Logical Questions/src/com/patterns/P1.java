/*
	j-	[1] [2] [3]
i-	 [1] *				1. 1-1
	 [2] *	 *	 		2. 1-2
	 [3] *	 *	 *		3. 1-3
*/
package com.patterns;

public class P1 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
