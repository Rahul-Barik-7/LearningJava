package com.operator;

public class Conditional_05 {
	public static void main(String[] args) {
		int mark=51;
		
		String result= mark>=80?"A":mark>=60?"B":mark>50?"C":"Fail";
		System.out.println(result);
	}
}
