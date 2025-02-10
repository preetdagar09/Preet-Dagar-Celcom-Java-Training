package com.celcom.javaassignment2;

class Animal{
	
	void makeSound() {
		System.out.println();
	}
	
}

class Cat extends Animal{

	
	void makeSound() {
		System.out.println("Meow");
	}
}

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Cat();
		obj1.makeSound();

		

	}

}
