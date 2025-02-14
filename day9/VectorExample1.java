package com.celcom.day9;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>(3, 2);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		//Traversing way 1
		for(int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}
		
		//way-2
		for( Integer i : vec) {
			System.out.println(i);
		}
		
		//Way-3
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
