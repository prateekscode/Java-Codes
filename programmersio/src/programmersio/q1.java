package programmersio;

import java.util.*;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string--");
		String user = sc.nextLine();
		String exp = "[A-Za-z0-9#$@]*";

		if (user.length() <= 12 && user.length() >= 6) {
			if (user != null) {
				if(user.matches(exp)) {
					  System.out.println("Valid");
				}
			}
		}
		else {
			System.out.println("Invalid");
		}
	}

}
