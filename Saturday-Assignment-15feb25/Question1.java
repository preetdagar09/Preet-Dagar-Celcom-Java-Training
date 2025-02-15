package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter : ");
		int num = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i = 1; i<=num; i++) {
			Object elements = sc.next();
			list.add(elements);
		}
		
		Iterator<Object> it =  list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Enter the element you want to check : ");
		Object check = sc.next();
		if(list.contains(check)) {
			System.out.println(check + " is found in the list");
		}
		else {
			System.out.println("Not found");
		}
		
		
		
	}

}
