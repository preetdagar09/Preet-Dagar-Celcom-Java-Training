package com.celcom.day5;
import java.util.Scanner;

interface Area{
	void areaCalculate();
}

interface Perimeter{
	void perimeter();
}

abstract class Shape implements Area{
	double pi = 3.14 ,radius,length,breadth,height;
	Shape(double radius){
		this.radius = radius;
	}
	
	Shape(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}		
	
}

class Circle extends Shape{
	
	public void areaCalculate() {
		double area = pi*radius*radius;
		System.out.println("Area of the circle is : " + area);
	}
	
	public void perimeter() {
		double perimeter = 2 * pi * radius;
		System.out.println("Perimeter of the circle is : " + perimeter);
	}
	
	Circle(double radius){
		super(radius);
		this.areaCalculate();
		this.perimeter();

	}
}

class Rectangle extends Shape{
	
	Rectangle(double length, double breadth){
		super(length, breadth);
		this.areaCalculate();
		this.perimeter();
	}
	
	public void areaCalculate() {
		
		double area = length * breadth;
		System.out.println("Area of the Rectangle is : " + area);
	}
	
	public void perimeter() {
		double perimeter = 2*(length + breadth);
		System.out.println("Perimeter of the rectangle : "+ perimeter);
	}
}

class Triangle extends Shape{
	
	Triangle(double length, double breadth){
		super(length, breadth);
		this.areaCalculate();
		this.perimeter();		
	}
	public void areaCalculate() {
		double area = 0.5 * length * breadth;
		System.out.println("Area of the Triangle is : " + area);
	}
	
	public void perimeter() {
		double perimeter = 2*length+breadth; 
		System.out.println("Perimeter of the triangle is : " + perimeter);
	}
}

public class InterfaceExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : Shape s = new Circle(5.5);
		break;
		case 2 : Shape s1 = new Rectangle(2,4);
		break;
		case 3 : Shape s2 = new Triangle(2, 4);
		break;
		}
		

	 

	}

}
