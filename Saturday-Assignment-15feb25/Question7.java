package com.celcom.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add("Preet");
		list.add("Rishabh");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting position : ");
		int startingPosition = sc.nextInt();
		if(startingPosition >= 0 && startingPosition < list.size()) {
			for(int i = startingPosition ; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		else {
			System.out.println("Invalid starting position");
		}

	}

}
