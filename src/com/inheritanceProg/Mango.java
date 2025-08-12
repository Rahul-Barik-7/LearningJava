package com.inheritanceProg;

public class Mango extends Fruit {
	
	int aprice=62;
	void m2()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Fruit f=new Mango(); //UpCasting
		System.out.println(f.x);
		//System.out.println(f.aprice);
		//f.m2();
		
		Mango r=(Mango)f;
		r.m2();
		System.out.println(r.x);
		System.out.println(r.aprice);
	}
}
