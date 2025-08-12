package exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("program is started");
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number : ");
		
//		Example----1 //java.lang.ArithmaticException
//		int num = sc.nextInt();
//		try
//		{
//			System.out.println(100/num);		
//		}
//		catch(ArithmeticException e)
//		{
//			System.err.println("Invalid Number ");
//		} 
		
		
		
		//example---------2 //java.lang.ArrayIndexOutOfBoundsException
		int a[]=new int[5];
		System.out.println("Enter the position (0-4): ");
		int position = sc.nextInt();
		System.out.println("Enter value: ");
		int value = sc.nextInt();
		try {
			a[position]=value;  
			System.out.println(a[position]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.err.println("Invald Entry");
			
		}
		
		
		
//		Example----------3 java.lang.NumberFormatException
//		String s="12345"; //instead of this if i will enter
//		String s="Welcome";
//		int number = Integer.parseInt(s);
//		System.out.println(number);
		
//		Example----------4 java.lang.NullPointerException
//		String s1="Welcome"; //instead of this if i will enter
//		String s1=null; 
//		System.out.println(s1.length()); //NullPointerException
		
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}
}
