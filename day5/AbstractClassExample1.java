package com.celcom.day5;

abstract class Vehicle2{
	
	Vehicle2(){
		System.out.println("Contructor");
	}
	abstract void noOfWheels();
	
	abstract void noOfEngine();
	
	abstract void brandName();
	

}

class Car2 extends Vehicle2{
	
	public void noOfWheels() {
		System.out.println("I have Four Wheels");
	}
	
	public void brandName() {
		System.out.println("Mercedes");
	}
	
	public void noOfEngine() { 
		System.out.println("One engine");
	}
}

public class AbstractClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj1 = new Car();
		obj1.noOfWheels();
		obj1.brandName();
		obj1.noOfEngine();

	}

}
