package com.operator;

public class Arithmatic_04 {
	
	public static void main(String[] args) {
		int number =198;
		
		int lastNumber=number%10;
		int middle=number/10;
		int middleNumber=middle%10;
		int firstNumber=middle/10;
		
		System.out.println(firstNumber);
		System.out.println(middleNumber);
		System.out.println(lastNumber);
	}
}
