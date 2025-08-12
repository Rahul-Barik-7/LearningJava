package com.Methods;

public class Greeting {
	
	//no parameters no return value
	void m1()
	{
		System.out.println("Hello");
	}
	
	//no parameters  return value
	String m2()
	{
		return "how are you";
	}
	
	//parameters no return value
	void m3(String name)
	{
		System.out.println("Hello "+name);
	}
	
	//parameters & return value
	String m4(String name)
	{
		return "Hi "+name;
	}
}
