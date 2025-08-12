package com.Methods;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	void printStudentData()
	{
		System.out.println(sid+" "+sname+" "+grade);//this is the good way
	}
	
	void setStudentData(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
		//System.out.println(sid+" "+sname+" "+grade); //but not good way to print the data 	
	}
	
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
}
