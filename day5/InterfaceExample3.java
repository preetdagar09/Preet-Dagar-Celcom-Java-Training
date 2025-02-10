package com.celcom.day5;


interface AnimalPlan{
	void move();
	void eat();
}

abstract class Animal implements AnimalPlan{
	String msg = getMessage();
	abstract public void move();
	
	abstract public void eat();
	abstract public String getMessage();
}

class Cat extends Animal{
	public void move() {
		System.out.println("Cat will move by Walk");
	}
	
	public void eat() {
		System.out.println("Cat will eat rat");
	}
	
	public String getMessage() {
		return "C";
	}
}

class Parrot extends Animal{
	public void move() {
		System.out.println("Parrot will fly");
	}
	
	public void eat() {
		System.out.println("Parrot will eat Fruits");
	}
	
	public String getMessage() {
		return "P";
	}
	
}

class Fish extends Animal{
	public void move() {
		System.out.println("Fish will swim");
	}
	public void eat() {
		System.out.println("Fish will eat sea plants");
	}
	public String getMessage() {
		return "F";
	}
}
public class InterfaceExample3 {

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
