package com.Methods;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greeting g=new Greeting();
		g.m1(); //Hello
		String st = g.m2();
		System.out.println(st); //how are you
		
		g.m3("Rahul"); //Hello Rahul
		
		String nm = g.m4("John");
		System.out.println(nm);
	}

}
