package com.basic;

import java.util.Scanner;

public class MembershipDiscount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have membership");
		String userType = sc.next();
		System.out.println("Enter the total amount");
		int total = sc.nextInt();
		int discount;

		if (userType.equalsIgnoreCase("Yes") && (total > 100)) {
			discount = 20;
			total = total + ((total * discount) / 100);
		} else if (userType.equalsIgnoreCase("Yes") && (total <= 100)) {
			discount = 10;
			total = total + ((total * discount) / 100);
		} else if (userType.equalsIgnoreCase("Yes") && (total > 150)) {
			discount = 5;
			total = total + ((total * discount) / 100);
		}

		System.out.println("Final Price is " + total);

	}

}
