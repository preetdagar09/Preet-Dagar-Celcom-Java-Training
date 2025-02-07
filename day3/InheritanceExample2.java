package com.celcom.day3;
//MultiLevel Inheritance
class Vehicle2 {
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
	
class TwoWheeler2 extends Vehicle2{
	void noOfWheels() {
		System.out.println("I have Two wheels");
	}
}

class Bike extends TwoWheeler2{
	void brandName() {
		System.out.println("My brand name is honda ");
	}
}


public class InheritanceExample2 {

	public static void main(String[] args) {
		TwoWheeler2 two = new TwoWheeler2();
		two.noOfWheels();
		two.noOfEngine();
		

	}

}