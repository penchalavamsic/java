package com.company;
import com.company.accounts.*;
import com.company.hr.*;

public class CompanyTest {
	public static void main(String[] args) {
		
	Employee e=new Employee("Vamsi", 12345); //directly prints because of void return type
	
	e.displayEmployeeDetails();
	Account a=new Account("AB125", 52000);
	a.displayAccountDetails();
	
	}
}	
