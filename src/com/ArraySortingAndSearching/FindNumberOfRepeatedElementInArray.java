package com.ArraySortingAndSearching;

public class FindNumberOfRepeatedElementInArray {
	
	public static void main(String[] args) {
		
		
		int count = 0;
		int number=20;
		int a[]= {10,20,20,30,20,20,80,40,50,20};
		
		for(int x:a)
		{
			if(x==number)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
