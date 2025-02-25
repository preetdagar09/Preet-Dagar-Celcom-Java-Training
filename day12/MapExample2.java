package com.celcom.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm2 = new HashMap<>(); //Hashmap
		hm2.put(1, "One");
		hm2.put(2, "two");
		hm2.put(3, "three");
		
		Map<Integer, String> hm3 = new TreeMap<>(); //TreeMap
		hm3.put(4, "Four");
		hm3.put(5, "Five");
		hm3.put(6, "Six");

		//hm2.clear();
		System.out.println(hm2.containsKey(2));
		System.out.println(hm2.containsValue(7));
		System.out.println(hm2.entrySet()); //it returns a Set of Map.Entry objects, where each Map.Entry represents a key-value pair in the HashMap.
		System.out.println(hm2.equals(hm3));
		System.out.println(hm2.get(2));
		System.out.println(hm2.hashCode());
		System.out.println(hm2.isEmpty());
		System.out.println(hm2.keySet());
		hm2.put(null, null);
		hm2.putAll(hm3); //You can add tree map to hashmap even if hashmap has null value but not vice versa
		System.out.println(hm2);
		System.out.println(hm2.size());
		System.out.println(hm2.values());
		//hm2.merge(null, null, null);
		System.out.println(hm2.putIfAbsent(7, "Seven"));
		System.out.println();
		
		System.out.println(hm3.containsKey(2));
		System.out.println(hm3.containsValue(7));
		System.out.println(hm3.entrySet()); //it returns a Set of Map.Entry objects, where each Map.Entry represents a key-value pair in the HashMap.
		System.out.println(hm3.equals(hm2));
		System.out.println(hm3.get(2));
		System.out.println(hm3.hashCode());
		System.out.println(hm3.isEmpty());
		System.out.println(hm3.keySet());
		//hm2.put(null, null);
		//hm3.putAll(hm2);
		System.out.println(hm3);
		System.out.println(hm3.size());
		System.out.println(hm3.values());
		hm3.merge(3, "Five", (oldValue,newValue) -> oldValue + newValue);
		System.out.println(hm3.putIfAbsent(8, "Eight"));
		System.out.println(hm3);
		
	}

}
