package com.celcom.day9;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());

	}

}
