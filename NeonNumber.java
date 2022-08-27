package com.ty.logicalprogramming;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int square = n * n;
		while (square != 0) {
			sum = sum + square % 10;
			square = square / 10;
		}
		if (sum == n) {
			System.out.println("Neon number");
		} else {
			System.out.println("It is not a neon number");
		}

	}

}
