package com.celcom.day8;

public class StringMethodExample3 {

	public static void main(String[] args) {

		String s1 = "Java";  //Strings are immutable objects
		s1.concat(" World");
		System.out.println(s1);

		//String Buffers are mutable objects
		StringBuffer sb= new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb); //String and StringBuffer both are different classes.
		
		StringBuilder sb2 = new StringBuilder("Java");
		sb2.append("World2");
		System.out.println(sb2);
		}

}
