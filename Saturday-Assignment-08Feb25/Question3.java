package com.celcom.javaassignment2;

class Rectangle {
	int width;
	int height;


Rectangle(int width, int height){
	this.width = width;
	this.height = height;
	this.area();
	this.perimeter();
}

void area() {
	int area = width * height;
	System.out.println("Area of rectangle is : " + area);
}

void perimeter() {
	int perimeter = 2 * (width + height);
	System.out.println("Perimeter of Rectangle is : " + perimeter);
}

}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj1 = new Rectangle(15,20);

	}

}
