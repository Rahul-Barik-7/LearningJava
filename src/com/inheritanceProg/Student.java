package com.inheritanceProg;

public class Student {
	
	private int roll;
	private String name;
	private char sec;
	
	Student(int roll,String name,char sec)
	{
		this.roll=roll;
		this.name=name;
		this.sec=sec;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSec() {
		return sec;
	}

	public void setSec(char sec) {
		this.sec = sec;
	}
	
	
}
