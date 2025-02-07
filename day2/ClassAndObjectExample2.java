package com.celcom.day2;
class Fruits{
	String color;
	int size;
	int price;
	
	//Initialize values by constructor
	Fruits(String color, int size, int price){
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	//method
	void display() {
		System.out.println("Fruit Color : " + color);
		System.out.println("Fruit Size : " + size);
		System.out.println("Fruit Place : " + price);
		
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}

public class ClassAndObjectExample2 {

	public static void main(String[] args) {
		Fruits apple = new Fruits("Red", 10, 200);
		apple.display();
		
		apple.setPrice(300);
		
		apple.display();
	}
}
