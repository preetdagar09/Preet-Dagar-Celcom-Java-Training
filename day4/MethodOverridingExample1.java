package com.celcom.day4;

class SuperClass{
	void myMethod() {
		System.out.println("I am from super class");
	}
}
class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("I am from sub class");
	}
}

public class MethodOverridingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.myMethod();
		SuperClass obj1 = new SubClass();//Superclass Reference and subclass object
		obj1.myMethod();
		

	}

}
