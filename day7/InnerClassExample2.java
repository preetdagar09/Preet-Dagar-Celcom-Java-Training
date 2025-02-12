package com.celcom.day7;


interface MyInterface{
	abstract void display();
}


public class InnerClassExample2 implements MyInterface{
	
	public void display() {
		System.out.println("Display");
	}
//Anonymous inner class
	public static void main(String args[]) {
		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		
		obj1.display();
		
	
		
	}


}
