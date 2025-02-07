package com.celcom.day3;
//Single level inheritance

class Vehicle {
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
	
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have Two wheels");
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		TwoWheeler two = new TwoWheeler();
		two.noOfWheels();
		two.noOfEngine();
		

	}

}
