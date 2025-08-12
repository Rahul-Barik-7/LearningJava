package com.Arrays;

public class ObjectArray {
	public static void main(String[] args) {
		
		Object a[]= {1,10.5,'a',"hello",true};
		
//		for(Object x:a)
//		{
//			System.out.println(x);
//		}
		
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
