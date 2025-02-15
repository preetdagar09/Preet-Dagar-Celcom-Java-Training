package com.celcom.Assignment3;

import java.util.LinkedList;
import java.util.List;

public class Question10 {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add("Preet");
		
		System.out.println("Original List : " + list);
		
		List<Object> copiedlist = new LinkedList<>(list);
		System.out.println("Copied List : " + copiedlist);
		

	}

}
