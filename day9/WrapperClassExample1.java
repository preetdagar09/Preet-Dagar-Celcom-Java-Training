package com.celcom.day9;

public class WrapperClassExample1 {

	public static void main(String[] args) {
		int a = 10;
		Integer obj1 = new Integer(a);//Boxing(Converting primitve data type into object)
		int b = obj1.intValue();
		//System.out.println(b);
		
		//From JDK 1.5 onwards
		Integer obj2 = a;//Auto- Boxing
		int c = obj2; //Auto Un-Boxing
		System.out.println(c);
	}

}
