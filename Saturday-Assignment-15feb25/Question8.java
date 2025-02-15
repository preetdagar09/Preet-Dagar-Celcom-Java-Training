package com.celcom.Assignment3;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add("Preet");
		
		//Way - 2
		ListIterator<Object> it = list.listIterator(list.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}

}
