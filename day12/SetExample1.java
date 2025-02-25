package com.celcom.day12;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample1 {

	public static void main(String[] args) {
		
		Set<String> st1 = new HashSet<>();
		st1.add("1");
		st1.add("10");
		st1.add("5");
		st1.add("Preet");
		st1.add(null);
		for(String s : st1) {
			System.out.println(s);
		}
		System.out.println(st1);
		
		Set<String> st2 = new HashSet<>();
		st2.add("1");
		st2.add("2");
		st2.add("3");
		st2.add(null);
		st2.addAll(st1);
		//st2.contains(st1);
		
		Set<String> st3 = new TreeSet<>();
		st3.add("hello");
		st3.add("2");
		//st3.add(null);
		
		Set<String> st4 = new LinkedHashSet<>();
		st4.add("Linked hash hello");
		st4.add(null);
		System.out.println("Linked Hash Set : " + st4);
		
		//hashset to array
		Object arr[] = st2.toArray();
		System.out.println("After converting hashset to array : " );
		for(Object o : arr) {
			System.out.println(o);
		}
		
		
		System.out.println("Tree set retains all from st2 : " + st3.retainAll(st2));
		
		
		System.out.println(st2);
		System.out.println(st2.contains("1"));
		System.out.println(st2.containsAll(st1));
		System.out.println(st2.hashCode());
		System.out.println(st3);
		

	}

}
