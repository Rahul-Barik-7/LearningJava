package com.ArraySortingAndSearching;

import java.util.Scanner;

public class TakingMultipleInputsInKeyboard {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter your 2nd number");
		int num2=sc.nextInt();
		
		System.out.println("addition of two number is : "+(num1+num2));
	}
}
