package com.String;

import java.util.Arrays;

public class Splitmethod {

	public static void main(String[] args) {
		// split the string in to multiple parts base on deli-meter
		
		String s=new String();
		s="rahulbarik481@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(Arrays.toString(a));
		
		String amount="$102,20,30";
		System.out.println(amount.replace("$"," "));
		System.out.println(amount.replace("$"," ").replace(",", " "));
		
		s="abc,123@xyz";
		
 		String arr[]=s.split(",");
		System.out.println(Arrays.toString(arr));	
		
		String[] arr2 = arr[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println(arr[0]);	
		System.out.println(arr2[1]);	
		
		
		s="Rahul Barik";
		System.out.println(s.replace('R', 'r').contains("rahul"));	
		System.out.println(s.toLowerCase().contains("rahul"));
}
}
