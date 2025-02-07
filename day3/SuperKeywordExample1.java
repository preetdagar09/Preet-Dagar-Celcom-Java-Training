package com.celcom.day3;
//Using super keyword to call super class constructor, variable, method.
class Vehicle4 {
	String name = "I am super class variable";
	
	Vehicle4(){
		System.out.println("I am super class constructor");
	}
	
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
	
class TwoWheeler4 extends Vehicle4{
	TwoWheeler4(){
		super();
	}
	
	void noOfWheels() {
		System.out.println("I have Two wheels");
		System.out.println(super.name);
		super.noOfEngine();
	}
}

public class SuperKeywordExample1 {

	public static void main(String[] args) {
		TwoWheeler4 two = new TwoWheeler4();
		two.noOfWheels();


	}

}
