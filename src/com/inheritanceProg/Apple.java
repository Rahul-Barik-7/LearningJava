package com.inheritanceProg;

public class Apple extends Fruit {
	
	int aprice=40;
	void m1()
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args) {
		Fruit f=new Apple(); //UpCasting
		System.out.println(f.x);
		//System.out.println(f.aprice);
		//f.m1();
		
		Apple r=(Apple)f;
		r.m1();
		System.out.println(r.x);
		System.out.println(r.aprice);
	}
}
