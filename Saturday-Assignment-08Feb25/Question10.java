package com.celcom.javaassignment2;

class Shape{
	int length;
	int breadth;
	void getArea() {
		
	}
}

class Rectangle1 extends Shape {
	
	Rectangle1(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		this.getArea();
	}
	void getArea() {
		System.out.println("Area of the rectangle is : " + length * breadth);
	}
}

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 obj1 = new Rectangle1(12,14);

	}

}
