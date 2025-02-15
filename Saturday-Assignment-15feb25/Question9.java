package com.celcom.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question9 {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add("Preet");
		
		Iterator<Object> it = list.listIterator();
		while(it.hasNext()) {
			Object temp = it.next();
			System.out.println(temp));
			System.out.println(list.indexOf(temp));
		}
		

	}

}
