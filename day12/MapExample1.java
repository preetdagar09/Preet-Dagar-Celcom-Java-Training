package com.celcom.day12;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1 , " Chocolate1");
		hm.put(2 , " Chocolate2");
		hm.put(3 , " Chocolate3");
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> hm2 : hm.entrySet()) {
			System.out.println(hm2.getKey() + " : " + hm2.getValue());
		}
		
		Map<Integer, String> hm2 = new HashMap<>();
		hm2.put(4 , "Chocolate1");
		
		System.out.println(hm.containsKey(1)); //If hm2 is a key in hm, it will return true; otherwise, it will return false.
		System.out.println(hm.containsValue(hm2));
		System.out.println(hm.equals(hm2));
		System.out.println(hm.hashCode());
		hm.merge(3, "Dairy", (oldValue,newValue) -> oldValue + newValue);
		hm.putIfAbsent(4, "five star");
		System.out.println(hm);
	}

}
