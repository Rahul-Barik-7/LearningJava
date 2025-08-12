package com.StringImmutability;

public class ReverseAString {
	public static void main(String[] args) {
		
		//approach -1 length()    charAt()
		String s="Qspider";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	
	
		//approach -2  without using string methods
		
		String s1="Selenium";
		String reverse="";
		
		char a[]=s1.toCharArray();  //here we are storing the string data in to char array
		for(int i=a.length-1;i>=0;i--)
		{
			reverse=reverse+a[i];
		}
		System.out.println("Reverse array is :"+reverse);
		
		//approach -3  using stringBuffer class
		
		StringBuffer s3=new StringBuffer("DCBA");
		System.out.println("string is :"+s3);
		
		System.out.println("reverse string is : "+s3.reverse());
		
		//approach -3  using stringBuilder class
		StringBuilder s4=new StringBuilder("EDCBA");
		System.out.println("string is :"+s4);
		
		System.out.println("reverse string is : "+s4.reverse());
	
	}
}
