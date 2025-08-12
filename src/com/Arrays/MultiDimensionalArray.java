package com.Arrays;
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
		int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("number of rows:"+a.length );
		System.out.println("number of columns:"+a[2].length );
		
		//read specific value from array
		System.out.println("value of this array : "+a[2][1]);
		
		//read all the values from array (for loop)
//		for(int r=0;r<a.length;r++)
//		{
//			for(int c=0;c<a[r].length;c++)
//			{
//				System.out.print(a[r][c]+" ");
//			}
//			System.out.println();
//		}		
		
		//for each loop
		
		for(int arr[] :a)
		{
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
				
		
	}
}
