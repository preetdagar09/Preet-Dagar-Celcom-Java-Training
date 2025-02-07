package com.celcom.day3;

public class ThisKeywordExample2 {
	
	ThisKeywordExample2(){
		this("preet");
		System.out.println("A");
	}
	
	ThisKeywordExample2(String name){
		this(5);
		System.out.println("B");
	}
	
	ThisKeywordExample2(int a){
		System.out.println("C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordExample2 obj = new ThisKeywordExample2();

		

	}

}
