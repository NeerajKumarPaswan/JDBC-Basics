package com.ty.logicalprogramming;

import java.util.Scanner;
public class XylemPhloem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int p=n;
		int sum1=0; 
		int sum2=0;
		int count1=0;int rem=0;int count2=0;
		
		//count the number of digits
		while(n!=0) {
			n=n/10;
			count1++;
		}
		
		while(p!=0) {
			rem=p%10;
			count2++;
		if(count2==1||count2==count1) {
		     sum1=sum1+rem;
		}else {
			sum2=sum2+rem;
		}
		p=p/10;
		}
		if(sum1==sum2) {
			System.out.println("Xylem");
		}else {
			System.out.println("Phloem");
		}
		
	}

}
