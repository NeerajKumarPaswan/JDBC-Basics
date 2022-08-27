package com.ty.logicalprogramming;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=0; int y=1;int z=0;
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}
	}

}
