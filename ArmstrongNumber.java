package com.ty.logicalprogramming;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int digit = 0;
		int z = n;
		int count = 0;
		
		int sum = 0;
		// count the number of digits
		while (z!=0) {
			z = z / 10;
			count++;
		}
		z = n;
		while (z > 0) {
			int product = 1;
			digit = z % 10;

			for (int i = 1; i <= count; i++) {
				product = product * digit;
				
			}sum = sum + product;
			System.out.println(sum);
			z = z / 10;
		}
		if (sum == n) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("Not an amstrong number");
		}
	}

}
