package com.ty.logicalprogramming;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		String output = "";
		for (int i = c.length - 1; i >= 0; i--) {
			int j = i;
			while (i >= 0 && c[i] != ' ') {
				i--;
			}
			int k = i + 1;
			while (k <= j) {
				output += c[k];
				k++;
			}
			if (i >= 0)
				output += c[i];

		}
		System.out.println(output);
	}
}
