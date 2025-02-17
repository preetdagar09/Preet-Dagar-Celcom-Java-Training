package com.celcom.day10;

import java.util.ArrayList;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(1);
		arraylist.add(10);
		arraylist.add(50);
		arraylist.add(25);
		arraylist.add(2);
		
		for(int i = 0; i<arraylist.size(); i++) {
			for(int j= i + 1; j < arraylist.size(); j++) {
				if(arraylist.get(i) > arraylist.get(j)) {
					int temp = arraylist.get(i);
					arraylist.set(i, arraylist.get(j));
					arraylist.set(j, temp);
				}
			}
		}
		
		System.out.println("Sorted array : " + arraylist);

	}

}
