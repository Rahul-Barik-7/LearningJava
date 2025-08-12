package com.controlStatement;

/*
 a>b and a>c --- a is greater 
 b>a and b>c --- b is greater
 c>a and c>b --- c is greater
 */

public class LargestOf3Mumber {

	public static void main(String[] args) {
		
		int a=10,b=20,c=0;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number ..."+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number..."+b);
		}
		else
		{
			System.out.println("c is largest number..."+c);
		}
	}

}
