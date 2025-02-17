package com.celcom.day10;

import java.util.ArrayList;

public class ArraysContainSameElements {

	public static void main(String[] args) {
		ArrayList<Object> arraylist1 = new ArrayList<>();
		arraylist1.add("2");
		arraylist1.add("4");
		arraylist1.add("8");
		
		ArrayList<Object> arraylist2 = new ArrayList<>();
		arraylist2.add("8");
		arraylist2.add("4");
		arraylist2.add("2");
		
		Boolean isContains = false;
		
		for(Object array1: arraylist1) {
			if((arraylist2.contains(array1))){
				isContains = true;
			}
			else {
				isContains = false;
				break;
			}
		}
		
		if(isContains == false) {
			System.out.println("No both arrays does not contain same elements");
		}
		else {
			System.out.println("Both arrays contains same elements");
		}
		
		

	}

}
