package com.celcom.day4;

public class MethodOverloadingExample1 {
	
	void myMethod(int a){
		int fact = 1;
		for(int i = 1; i<=a;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}
	
	void myMethod(int a, int b){
		int sum = a + b;
		System.out.println("Sum of two numbers : " + sum);
	}
	
	void myMethod(String name){
		System.out.println("Welcome " + name);
	}
	void myMethod(double a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample1 obj = new MethodOverloadingExample1();
		obj.myMethod(4);
		obj.myMethod(20, 25);
		obj.myMethod("Preet");
		obj.myMethod(5.0);
		

	}

}
