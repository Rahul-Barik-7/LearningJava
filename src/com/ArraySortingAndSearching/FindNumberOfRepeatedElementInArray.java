package com.ArraySortingAndSearching;

public class FindNumberOfRepeatedElementInArray {
	
	public static void main(String[] args) {
		
		
		int number=20;
		int count = 0;
		int a[]= {10,20,20,30,20,20,80,40,50,20};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				count++;
			}
		}  
		System.out.println(count);
		
	}
}
