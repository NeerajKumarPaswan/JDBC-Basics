package com.ty.logicalprogramming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to find the prime number");
		int count = 0;
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n + "is a prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}
}
