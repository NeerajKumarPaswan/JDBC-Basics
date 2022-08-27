package com.ty.logicalprogramming;
import java.util.Scanner;
public class Factors {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit to find factors");
	int n=sc.nextInt();
	System.out.println("Facotors are ");
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
	
}
}
