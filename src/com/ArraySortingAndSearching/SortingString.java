package com.ArraySortingAndSearching;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		String arr[]= {"Jack","Ajay"};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println();
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
	}
}
