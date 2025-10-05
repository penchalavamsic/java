package com.company.hr;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	public void displayEmployeeDetails() {
		System.out.println("Name: "+name+"\n Id: "+id);
	}
}
