package com.celcom.day5;

//Interface
interface VehiclePlan {
	void noOfEngine();
	void noOfWheels();
	void brandName();

}

//Abstract class
abstract class Vehicle1 implements VehiclePlan{
	
	Vehicle1(){
		System.out.println("Contructor");
	}

}

class Car1 extends Vehicle1{
	
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


public class InterfaceExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj1 = new Car();
		obj1.noOfWheels();
		obj1.brandName();
		obj1.noOfEngine();
	

}
}
