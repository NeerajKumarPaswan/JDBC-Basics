package com.ty.logicalprogramming;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();int rev=0;
	int m=n;
	while(n!=0) {
		rev=rev*10+n%10;
		n=n/10;
	}
	if(m==rev) {
		System.out.println("It is a palindrome number"+rev);
	}else {
		System.out.println("It is not a palindrome number"+rev);
	}
}
}
