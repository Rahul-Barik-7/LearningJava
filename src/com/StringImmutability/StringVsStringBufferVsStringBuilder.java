package com.StringImmutability;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//string -Immutable
		String s=new String("Welcome");
		System.out.println(s);
		s.concat(" to India"); //it is not changing
		System.out.println(s);
		
		//StringBuffer- mutable
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println(s1);
		s1.append(" World"); //it is changing the value without string 
		System.out.println(s1);
		
		
		//StringBuffer- mutable
		StringBuilder s2=new StringBuilder("Hello");
		System.out.println(s2);
		s2.append(" India"); //it is changing the value without string 
		System.out.println(s2);
	}
}
