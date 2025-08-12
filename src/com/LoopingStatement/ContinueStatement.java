package com.LoopingStatement;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==6 || i==2 || i==9)
			{
				 continue;
			}
			System.out.println(i);
		}
	}

}
