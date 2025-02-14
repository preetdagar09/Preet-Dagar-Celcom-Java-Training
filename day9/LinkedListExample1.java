package com.celcom.day9;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListExample1 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();//List<Object> will accept any object .It can be integer, string, etc.
		list.add(10);
		list.add(30);
		list.add(5);
		//list.add("java");
		list.add(10);
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.add(1, 150);
		System.out.println(list);
		
		list.set(1,  160);
		
		list.remove(new Integer(10));
		System.out.println(list);
		
		list.remove(0);  //by default it will take the value as indexs
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.contains(10));
		
		System.out.println(list.isEmpty());
		
		//Traversing-Way1
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Way-2
		for( Integer i : list) {
			System.out.println(i);
		}
		
		//Way-3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
