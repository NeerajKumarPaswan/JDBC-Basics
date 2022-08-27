package com.ty.logicalprogramming;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(true) {
			int sum=0;
			int i=n;
			while(i!=0) {
			int lastdigit=i%10;
			sum=sum+lastdigit*lastdigit;
			i=i/10;
			}
			if(sum<10) {
				if(sum==1||sum==7||sum==10) 
					System.out.println("It is a happy Number");
				else 
					
					System.out.println("It is not a happy Number");
				break;
			}else {
		  n=sum;
			}
			}
	}

}
