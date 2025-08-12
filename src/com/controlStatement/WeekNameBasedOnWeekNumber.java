package com.controlStatement;

public class WeekNameBasedOnWeekNumber {

	public static void main(String[] args) {
		
		int weekno=6;
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		else if(weekno==2)
		{
			System.out.println("Monday");
		}
		else if(weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if(weekno==4)
		{
			System.out.println("Wednesday");
		}
		else if(weekno==5)
		{
			System.out.println("Thusday");
		}
		else if(weekno==6)
		{
			System.out.println("Friday");
		}
		else if(weekno==7)
		{
			System.out.println("Saturday");
		}
		else {
			System.err.println("Please Enter a valid Number!");
		}
	}

}
