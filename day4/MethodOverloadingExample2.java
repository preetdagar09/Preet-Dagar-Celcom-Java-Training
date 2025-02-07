package com.celcom.day4;

public class MethodOverloadingExample2 {
	
	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Integer addition : "+ sum);
	}
	
	void addition(double a, double b) {
		double sum = a + b;
		System.out.println("Double addition : "+ sum);
	}
	void addition(long a, long b) {
		long sum = a + b;
		System.out.println("Long addition : "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample2 obj = new MethodOverloadingExample2();
		obj.addition(5.0, 6.0);
		obj.addition(20L,30L);
		obj.addition(5, 15);

	}

}
