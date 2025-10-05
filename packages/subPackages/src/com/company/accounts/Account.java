package com.company.accounts;

public class Account {
	String AccountID;
	int salary;
	public Account(String AccountID, int salary) {
		this.AccountID=AccountID;
		this.salary=salary;
	}
	public void displayAccountDetails() {
		System.out.println("Account ID: "+AccountID+"\n Salary: "+salary);
	}
}
