package com.celcom.day4;

public class MethodOverloadingExample3 {
	
	void concat(String a, String b) {
		System.out.println(a + b);
	}
	
	void concat(int  a, int b) {
		String concatenated = a + "" + b;
		System.out.println(concatenated);
	}
	void concat(double a, double b) {
		String concatenated = a + "" + b;
		System.out.println(concatenated);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample3 obj = new MethodOverloadingExample3();
		obj.concat("Preet","Dagar");
		obj.concat(12,156);
		obj.concat(2.9,5.45);

	}

}
