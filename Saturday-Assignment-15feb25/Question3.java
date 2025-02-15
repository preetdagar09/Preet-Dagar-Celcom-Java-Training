package com.celcom.Assignment3;
import java.util.ArrayList;
import java.util.List;


public class Question3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Preet");
		list.add("Sameer");
		list.add("Rishabh");
		
		List<String> copiedList = new ArrayList<>(list);
		System.out.println("Original List : " + list);
		System.out.println("Copied List : " + copiedList);
		

	}

}
