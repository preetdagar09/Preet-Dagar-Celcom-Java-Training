package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Preet");
		list.add("Sameer");
		list.add("Rishabh");
		
		Collections.reverse(list);

		System.out.println("Reversed List : " + list);

	}

}
