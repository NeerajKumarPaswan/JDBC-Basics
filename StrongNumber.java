package com.ty.logicalprogramming;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to find the Strong number");
		int n = sc.nextInt();
		int temp = n;

		int sum = 0;
		while (n != 0) {
			int lastDigit = n % 10;
			int fact = 1;
			while (lastDigit != 0) {
				fact = fact * lastDigit;
				lastDigit--;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("It is a Strong number" );
		} else {
			System.out.println("It is not a Strong number");
		}
	}
}
