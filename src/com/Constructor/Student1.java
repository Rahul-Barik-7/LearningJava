package com.Constructor;

public class Student1 {

	String sname;
	int sroll;
	
	//creating constructor
	//Constructor concept is specially design to perform initialization of an object.
	Student1(String sname,int sroll) 
	{
		this.sname=sname;
		this.sroll=sroll;
	}
	
	public static void main(String[] args) 
	{
		Student1 s1=new Student1("Rahul", 101);
		System.out.println(s1.sname);
		System.out.println(s1.sroll);
	}
}
