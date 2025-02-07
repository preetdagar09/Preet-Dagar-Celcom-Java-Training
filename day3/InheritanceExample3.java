package com.celcom.day3;
//Hierarchical Inheritance
class Vehicle3 {
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
	
class TwoWheeler3 extends Vehicle3{
	void noOfWheels() {
		System.out.println("I have Two wheels");
	}
}

class Bike3 extends Vehicle3{
	void brandName() {
		System.out.println("My brand name is honda ");
	}
}


public class InheritanceExample3 {

	public static void main(String[] args) {
		TwoWheeler3 two = new TwoWheeler3();
		two.noOfWheels();
		two.noOfEngine();
		Bike3 b =new Bike3();
		b.noOfEngine();
		b.brandName();
		

	}

}