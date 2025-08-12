package com.controlStatement;

public class SmallestOf3Number {

	public static void main(String[] args) {
		
		int number1=90,number2=20,number3=10;
		
		if(number1<number2 && number1<number3)
		{
			System.out.println("number1 is smaller");
		}
		else if(number2<number1 && number2<number3)
		{
			System.out.println("number2 is smaller");
		}
		else
		{
			System.out.println("number3 is smaller");
		}
	}

}
