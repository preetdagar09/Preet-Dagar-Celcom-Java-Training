package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Preet");
		list.add("Sameer");
		list.add("Rishabh");
		
		for(int i = 0; i<list.size() ; i++) {
			System.out.println("element at index " + i + " : " + list.get(i));
		}
		

	}

}
