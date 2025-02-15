package com.celcom.Assignment3;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
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
		

	}

}
