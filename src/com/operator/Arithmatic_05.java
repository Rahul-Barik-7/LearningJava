package com.operator;

import java.util.Scanner;

public class Arithmatic_05 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		
		int temp=number;
		while(number>0)
		{
			int digit=temp%10;
			System.out.println(digit);
			temp=temp/10;
		}
	}
}
