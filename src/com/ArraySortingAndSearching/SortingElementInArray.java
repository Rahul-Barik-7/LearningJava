package com.ArraySortingAndSearching;

import java.util.Arrays;

public class SortingElementInArray {
	
	public static void main(String[] args) {
		
		int a[]= {10,30,20,10,40,70,60};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println();
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
	}
}
