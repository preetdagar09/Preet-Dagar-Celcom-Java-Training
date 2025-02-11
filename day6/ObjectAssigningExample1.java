package com.celcom.day6;

public class ObjectAssigningExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectAssigningExample1 obj1 = new ObjectAssigningExample1();
		
		System.out.println(obj1.hashCode());
		
		ObjectAssigningExample1 obj2 = obj1;  //Object Assignment. Both are referring to same object.If changes made in obj1 , it will be on obj2 too.
		
		System.out.println(obj2.hashCode());
		

	}

}
