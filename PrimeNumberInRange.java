package com.ty.logicalprogramming;
import java.util.Scanner;
public class PrimeNumberInRange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit of range");
	int n=sc.nextInt();
	System.out.println("Prime numbers are");
	for(int i=1;i<=n;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) 
				count++;
			
		}
           if(count==2) {
        	   System.out.print(i+" ");
           }
	}
	
}
}
