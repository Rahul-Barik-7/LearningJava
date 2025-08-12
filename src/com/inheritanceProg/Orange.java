package com.inheritanceProg;

public class Orange extends Fruit {
	
	int oprice=35;
	void m2()
	{
		System.out.println("Orannge class");
	}
	
	public static void main(String[] args) {
		
		Fruit f1=new Orange();
		System.out.println(f1.x);
		//System.out.println(f1.oprice);
		//f1.m2();
		
		Orange o1=(Orange)f1;
		System.out.println(o1.oprice);
		o1.m2();
	}
	
}
