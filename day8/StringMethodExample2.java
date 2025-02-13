package com.celcom.day8;

public class StringMethodExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		
		for(int i = 0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		//Converting string to character array
		char ch[] = s1.toCharArray();
		for(char c : ch) {
			System.out.println(c);
		}
		
		String s2 = "Welcome to Java Programming";
		String temp[] = s2.split(" ");
		for(String s : temp) {
			System.out.println(s);
		}

	}

}
