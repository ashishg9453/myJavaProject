package com.basic;

import java.util.Scanner;

public class AccountBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account type");
		String accountType = sc.next();
		System.out.println("Enter the account balance");
		int balance = sc.nextInt();
		int interest;
		sc.close();

		if (accountType.equalsIgnoreCase("saving") && (balance >= 10000)) {
			interest = 5;
			balance = balance + ((interest * balance) / 100);

		}

		else if (accountType.equalsIgnoreCase("saving") && (balance <= 10000)) {
			interest = 3;
			balance = balance + ((interest * balance) / 100);

		} else if (accountType.equalsIgnoreCase("checking")) {
			interest = 2;
			balance = balance + ((interest * balance) / 100);

		}
		System.out.println("Account Balance is " + balance);

	}

}
