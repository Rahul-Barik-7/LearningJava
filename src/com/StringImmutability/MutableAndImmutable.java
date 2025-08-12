package com.StringImmutability;

import java.util.Arrays;

public class MutableAndImmutable {
	
	public static void main(String[] args) {
		
		
		//mutable - can change
		int a[]= {10,30,50,20,40};
		System.out.println("Arrays before sorting : "+Arrays.toString(a));
		Arrays.sort(a); // it means this method is mutable means its changing the original values
		System.out.println("Arrays after sorting : "+Arrays.toString(a));
		
		
		//Immutable - can't change
		
		String s=new String("HELLO");
		System.out.println(s);
		String concatvalue = s.concat(" RAHUL"); // it means if you will not store that vlaue in a variable then
		//you not get the updated value - it means it immutable
		System.out.println(s);
		System.out.println(concatvalue);
		
		
		
		
	}
}
