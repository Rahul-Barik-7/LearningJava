package com.Arrays;

/*
 1- Declare an array
 2- Add values in array
 3- Find length of an array
 4- read specific value from array
 5- read multiple values from array
 */

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		//declaration
		//approach-1   (if you know the size of an array)
		
  /*    int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;  */
		
		//approach-2 (if you don't know the size of an array)
		int a[]= {100,200,300,400,500,600}; //prefer
		
		//Find length of an array
		System.out.println("length of this array is : "+a.length);
		
		//read specific value from array
		//System.out.println("value of this array : "+a[4]);
		
		//read all the values from array (for loop)
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//read all the values from array (for each loop)
//		for(int x:a)
//		{
//			System.out.println(x);
//		}
		
		
	}
}
