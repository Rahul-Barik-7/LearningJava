package com.LoopingStatement;

public class BreakStatement {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				break; //after break you should not used any statement
				//System.out.println(i); 
			}
			System.out.println(i);
		}
	}
}
