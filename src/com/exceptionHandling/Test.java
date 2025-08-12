package com.exceptionHandling;

public class Test {
	
	public static void main(String[] args) {
		m1();
	}
	static void m1()
	{
		m2();
	}
	static void m2()
	{
		System.out.println("Hello");
		System.out.println(10/0);
	}
}
