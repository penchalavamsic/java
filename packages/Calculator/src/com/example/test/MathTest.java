package com.example.test;
import com.example.math.*;

public class MathTest {
	public static void main(String[] args) {
		Calculator c=new Calculator(10, 50); //calling math package Constructor
		System.out.println("Addition of two numbers is "+c.add()); //calling math package method
		System.out.println("Subraction of two numbers is "+c.sub());
	}

}
