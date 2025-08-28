package com.operator;

import java.util.Scanner;

public class Arithmatic_03 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=sc.nextInt();
		
		
		int sum=0;
		int original=number;
		
		while(number>0)
		{
			int lastDigit=number%10; //get the last value 
			sum=sum+lastDigit; // here we will add the values
			number=number/10; //get remaining values after removing last digit
		}
		
		System.out.println("The sum of the "+original+" is :"+sum);
		
		/*
		digit = 3456 % 10 = 6 → sum = 0+6=6, number = 3456/10=345

		digit = 345 % 10 = 5 → sum = 6+5=11, number = 345/10=34

		digit = 34 % 10 = 4 → sum = 11+4=15, number = 34/10=3

		digit = 3 % 10 = 3 → sum = 15+3=18, number = 3/10=0 → stop loop
		 */
	}
}
