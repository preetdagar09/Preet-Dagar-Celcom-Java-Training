package com.celcom.day2;

public class TypesOfVariables {
	int b = 20;//Instance variable
	static int c = 30;//Static or Class variable

	public static void main(String[] args) {
		int a = 10;//Local Variable
		System.out.println(a);
		
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.b);
		
		System.out.println(TypesOfVariables.c);
	}

}
