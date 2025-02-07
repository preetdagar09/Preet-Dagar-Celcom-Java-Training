package com.celcom.day4;

public class JavaBlocksExample1 {
	{
		System.out.println("Instance Block");
	}
	
	JavaBlocksExample1(){
		System.out.println("Constructor");
	}
	@Override
	public String toString() {
		return "To String";
	}
	
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Block");
		
		JavaBlocksExample1 obj = new JavaBlocksExample1();
		System.out.println(obj);

	}

}
