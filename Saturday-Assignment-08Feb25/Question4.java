package com.celcom.javaassignment2;
import java.lang.Math;
import java.util.Scanner;

class Circle{
	float radius;
	
	Circle(float radius){
		this.radius = radius;
		this.area();
		this.circumference();
	}
	
	public float getRadius() {
		return radius;
	}



	public void setRadius(float radius) {
		this.radius = radius;
	}



	void area() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle is : "+ area);
	}
	
	void circumference() {
		double circum= 2 * Math.PI * radius;
		System.out.println("Circumference of the circle is : " + circum);
	}
}

public class Question4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you to update the radius y or n: ");
		String input = sc.next();
		if (input.equals("y")) {
			System.out.println("Enter the radius : ");
			float radius = sc.nextFloat();
			obj1.setRadius(radius);
			Circle obj2 = new Circle(radius);
		}
		else {
			System.out.println("Ok");
		}
		

	}

}
