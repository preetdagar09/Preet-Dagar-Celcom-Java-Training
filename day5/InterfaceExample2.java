package com.celcom.day5;

//Interface
interface VehiclePlan1 {
	void noOfEngine();

}

interface VehiclePlan2{
	void noOfWheels();
	void brandName();
}

//Abstract class
abstract class Vehicle implements VehiclePlan1,VehiclePlan2{
	
	Vehicle(){
		System.out.println("Contructor");
	}

}

class Car extends Vehicle{
	
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

public class InterfaceExample2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj1 = new Car();
		obj1.noOfWheels();
		obj1.brandName();
		obj1.noOfEngine();
	
	
		
		

	}
}

