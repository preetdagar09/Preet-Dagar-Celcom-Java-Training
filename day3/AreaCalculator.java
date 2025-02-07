package com.celcom.day3;
import java.util.Scanner;
class Shape{
	double pi = 3.14 ,radius,length,breadth,height;
	Shape(double radius){
		this.radius = radius;
	}
	
	Shape(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}		
	
	void areaCalculate() {
		
	}
}

class Circle extends Shape{
	
	void areaCalculate() {
		double area = pi*radius*radius;
		System.out.println("Area of the circle is : " + area);
	}
	
	Circle(double radius){
		super(radius);
		this.areaCalculate();

	}
}

class Rectangle extends Shape{
	
	Rectangle(double length, double breadth){
		super(length, breadth);
		this.areaCalculate();
	}
	
	void areaCalculate(double length,double breadth) {
		
		double area = length * breadth;
		System.out.println("Area of the Rectangle is : " + area);
	}
}

class Triangle extends Shape{
	
	Triangle(double length, double breadth){
		super(length, breadth);
		this.areaCalculate();
		
	}
	void areaCalculate() {
		double area = 0.5 * length * breadth;
		System.out.println("Area of the Triangle is : " + area);
	}
}

public class AreaCalculator {

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
