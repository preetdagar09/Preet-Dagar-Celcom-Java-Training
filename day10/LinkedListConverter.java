package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListConverter {
	
	void arrayListToLinkedList() {
		ArrayList<Object> arraylist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many objects you want to add to arraylist : " ); 
		int num = sc.nextInt(); 
		System.out.println("Enter the objects : ");
		for(int i = 1; i<=num; i++) {
			arraylist.add(sc.next());
		}
		LinkedList<Object> linklist = new LinkedList<>(arraylist); 
		System.out.println("After converting , Linked list is : " + linklist);

	}
	
	void linkedListToArrayList() {
		LinkedList<Object> linklist = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many objects you want to add to Linkedlist : " ); 
		int num = sc.nextInt(); 
		System.out.println("Enter the objects : ");
		for(int i = 1; i<=num; i++) {
			linklist.add(sc.next());
		}
		ArrayList<Object> arraylist = new ArrayList<>(linklist); 
		System.out.println("After converting , Array list is : " + arraylist);

	}

	public static void main(String[] args) {
		LinkedListConverter obj = new LinkedListConverter();
		obj.linkedListToArrayList();
	}

}
