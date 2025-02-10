package com.celcom.javaassignment2;

class Vehicle{
	void drive() {
		
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new Car();
		obj1.drive();

	}

}
