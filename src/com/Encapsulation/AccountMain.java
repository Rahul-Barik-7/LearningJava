package com.Encapsulation;

public class AccountMain {
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccountNo(100);
		System.out.println(acc.getAccount());
		
		acc.setName("Rahul");
		System.out.println(acc.getName());
		
		acc.setAccountNo(45698714);
		System.out.println(acc.getAccount());
	}
}
