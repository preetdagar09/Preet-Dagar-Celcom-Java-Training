package com.celcom.day4;

public class ConstructorOverloadingExample1 {
	
	ConstructorOverloadingExample1(String a, String b) {
		this(10,20);
		System.out.println(a + b);

	}
	
	ConstructorOverloadingExample1(int  a, int b) {
		this(10.5,20.2);
		String concatenated = a + "" + b;
		System.out.println(concatenated);
	}
	ConstructorOverloadingExample1(double a, double b) {
		String concatenated = a + "" + b;
		System.out.println(concatenated);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloadingExample1 obj1 = new ConstructorOverloadingExample1("Preet","Dagar");
		//ConstructorOverloadingExample1 obj2 = new ConstructorOverloadingExample1(12,156);
		//ConstructorOverloadingExample1 obj3 = new ConstructorOverloadingExample1(2.9,5.45);

	}

}