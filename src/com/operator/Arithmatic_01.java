package com.operator;
//We want to print each digit of a two-digit number (e.g., 59).
public class Arithmatic_01 {
	
	public static void main(String[] args) {
		int number=59;
		
		int firstDigit=number/10;
		int lastDigit=number%10;

		System.out.println(firstDigit); 
		System.out.println(lastDigit);
		
	}
}
