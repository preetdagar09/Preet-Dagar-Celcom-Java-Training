package com.celcom.day8;

public class StringCreationExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		
		String s2 = new String("Java");
		
		char ch[] = {'H','i'};
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
