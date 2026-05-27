package com.Arrays;

import java.util.Iterator;

/*
1- Declare an array
2- Add values in array
3- Find length of an array
4- read specific value from array
5- read multiple values from array
*/

public class MultiDimensionalArray {
	
	public static void main(String[] args) {

		//declaring array
		//approach-1 (if you know the size of an array)
			
		//int a[][]=new int[3][2];
		//int [][]a=new int[3][2];  //correct
		//int []a[]=new int[3][2];  //correct
		
		/*a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
			
		a[2][0]=500;
		a[2][1]=600;*/
		 
		
		//approach-2 (if you don't know the size of an array)
		int a[][]= {{100,200,50},
					{300,400},
					{500,600,1,2,3,4}};
		
		System.out.println("number of rows:"+a.length );
		System.out.println("number of columns:"+a[1].length );
		
		//read specific value from array
		System.out.println("value of this array : "+a[2][0]);
		
		//read all the values from array (for loop) -app1
//		for (int row=0;row<=2;row++)
//		{
//			for(int column=0;column<=1;column++)
//			{
//				System.out.print(a[row][column]+" ");
//			}
//			System.out.println();
//		}
		
		//read all the values from array (for loop) -app2 when you do not know the rows and column count
//		
//		for(int rows=0;rows<=a.length-1;rows++)
//		{
//			for(int column=0;column<=a[rows].length-1;column++)
//			{
//				System.out.print(a[rows][column]+" ");
//			}
//			System.err.println();
//		}
		//lenght-1 means we are matching the length with index value 
		
		
		
		
		//for each loop
		
		for(int arr[] :a)   //taking single D array bcz we are storing multiple value in a single variable like 1 row can contains multiple columns
		{
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
				
		
	}
}
