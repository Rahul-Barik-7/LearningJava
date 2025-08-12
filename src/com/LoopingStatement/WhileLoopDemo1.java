package com.LoopingStatement;

public class WhileLoopDemo1 {
	
	public static void main(String[] args) {
		//ex-1  print 1.....10
		
		int i=1; //initi//alization
		while(i<=10) //condition
		{
			if(i==5)
			{
				i++;
				continue;
			}
			System.out.println(i); //statement
			i=i+1 ; //increment
		} 
		
		//ex2 - printing hello message 10 times
		
		/* int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		} */
		
		
		//ex3--- print only even number 1-10
		
		
//		int i=2;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i+=2;
//		}
		
		//another way
		
//		int i=1;
//		while(i<=10)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//ex-4 print even odd as per number
		
//		int i=1;
//		while(i<=10)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i+"-Even");
//			}
//			else
//			{
//				System.out.println(i+"-Odd");
//			}
//			i++;
//		}
		
		//exmple-5 print 10 to 1
		
//		int i=10;
//		while(i>0)
//		{
//			System.out.println(i);
//			i--;
//		}
		
		
		
	}
}
