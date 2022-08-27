package com.ty.logicalprogramming;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find its factorial");
     int n=sc.nextInt();
     int fact=1;
     while(n!=0) {
    	 fact=fact*n;
    	 n--;
     }
   System.out.println("Factorial of the above number is   "+fact);
}
}
