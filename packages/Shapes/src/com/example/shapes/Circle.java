package com.example.shapes;
import com.example.utils.MathUtils;


public class Circle {
	double radius;
	double area;
	Circle(double radius){
		this.radius=radius;
	}
	public double Area() {
		return MathUtils.PI*radius*radius; //accessing PI from MathUtils
		
	}
}

