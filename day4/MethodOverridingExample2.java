package com.celcom.day4;

class Animal{
	String msg = getMessage();
	void move() {
		System.out.println("Can not define");	
		}
	
	void eat() {
		System.out.println("Can not define");
	}
	
	String getMessage() {
		return "A";
	}
}

class Cat extends Animal{
	void move() {
		System.out.println("Cat will move by Walk");
	}
	
	void eat() {
		System.out.println("Cat will eat rat");
	}
	
	String getMessage() {
		return "B";
	}
}

class Parrot extends Animal{
	void move() {
		System.out.println("Parrot will fly");
	}
	
	void eat() {
		System.out.println("Parrot will eat Fruits");
	}
	
}

class Fish extends Animal{
	void move() {
		System.out.println("Fish will swim");
	}
	void eat() {
		System.out.println("Fish will eat sea plants");
	}
}
public class MethodOverridingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Parrot();
		obj.move();
		obj.eat();
		
		Animal obj1 = new Cat();
		obj1.move();
		obj1.eat();
		
		Animal obj2 = new Fish();
		obj2.move();
		obj2.eat();
		
		System.out.println(obj1.msg);
		

	}

}
