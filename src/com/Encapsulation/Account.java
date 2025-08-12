package com.Encapsulation;

public class Account {
	private int accNo;
	private String name;
	private double amount;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	void setAccountNo(int accNo)
	{
		this.accNo=accNo;
	}
	int getAccount()
	{
		return accNo;
	}
	
}
