package com.exceptions;

class InvalidAccountNumException extends RuntimeException {
	int acno;

	InvalidAccountNumException() {
	}

	InvalidAccountNumException(int acno) {
		this.acno = acno;
	}

	public String toString() {
		String str = "InvalidAccountException: " + getMessage();
		return str;
	}

	public String getMessage() {
		String msg = "Account Number Invalid";
		if (acno != 0) {
			msg = "Account Number-" + acno + "is Inavlid";
		}
		return msg;
	}
}

class InsufficientFundsException extends Exception {
	public String toString() {
		String str = "InsufficientFundsException: " + getMessage();
		return str;
	}

	public String getMessage() {
		String msg = "Ther is no funds in your account";
		return msg;
	}
}

class AccountService {
	public void deposit(int acno, double amt) throws InvalidAccountNumException {
		System.out.println("Deposit start");
		if (acno > 99 && acno <= 999) {
			System.out.println("OK! Deposited Successfully.");
		} else {
			throw new InvalidAccountNumException(acno);
		}
		System.out.println("Deposited Done");
	}


	public void withdraw(int acno, double amt) throws InsufficientFundsException {
		double bal = 25000;
		System.out.println("Withdraw started");
		if (acno > 99 && acno <= 999) {
			if (amt <= bal) {
				System.out.println("Withdrawl successful");
			} else {
				throw new InsufficientFundsException();
			}
		} else {
			throw new InvalidAccountNumException();
		}
		System.out.println("withdraw End..");
	}
}

public class Lab572 {

	public static void main(String[] args) {
		System.out.println("Main started");

		AccountService as = new AccountService();
		try {
			as.deposit(555, 25000);
		} catch (InvalidAccountNumException e) {
			System.out.println(e);
		}
	}

}
