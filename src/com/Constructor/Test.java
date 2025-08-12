package com.Constructor;

public class Test {
	
	Test(String name)
	{
		this(10);
		System.out.println("String constructor..");
	}
	Test(int roll)
	{
		this();
		System.out.println("int constructor...");
	}
	Test()
	{
		System.out.println("No argument constructor...");
	}
	
	public static void main(String[] args) {
		
		//Test t1=new Test();
		//Test t2=new Test(20);
		Test t3=new Test("shs");
		Child c=new Child(10);
		
	}
}
